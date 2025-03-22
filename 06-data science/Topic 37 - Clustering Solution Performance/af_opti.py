#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Sep  1 19:41:32 2020

@author: mwelch8
"""
# -*- coding: utf-8 -*-
"""
Created on Mon Aug 31 13:32:08 2020

@author: mwelch8
"""

# First we will import Python libraries that we need to access the data, create
# plots and run the nearest-neighbours machine learning algorithm 

import numpy as np
import matplotlib.pyplot as plt
from matplotlib.colors import ListedColormap
from sklearn import neighbors, datasets
from sklearn.cluster import AffinityPropagation
from sklearn import metrics

# This specifies the data columns from the iris dataset that we will use.
# We must select exactly 2 columns for this script to work
features_to_use =[2,3]


# import some data to play with - the iris dataset
iris = datasets.load_iris()

# We only take the first two features. We could avoid this ugly
# slicing by using a two-dim dataset.
# The measurements sit within the 'data' attribute of the 'iris' object.
# The species names sit in the 'target' attribute of the 'iris' object. 
# We can change the columns that we are using by updating the indexes 
# Try [:, 2:4:]
X = iris.data[:,features_to_use]
y = iris.target

best_v1 = 0
best_ch = 0

best_pref = -70
best_damp = 0.5

for pref in np.linspace(-70, -10, num=20):
    for damp in np.linspace(0.5, 0.9,num=12):

        af = AffinityPropagation(preference=pref, damping=damp).fit(X)
        cluster_centers_indices = af.cluster_centers_indices_
        labels = af.labels_
        
        n_clusters_ = len(cluster_centers_indices)
        
        if n_clusters_ < 2:
            continue
        
        print('Estimated number of clusters: %d' % n_clusters_)
        print("Homogeneity: %0.3f" % metrics.homogeneity_score(y, labels))
        print("Completeness: %0.3f" % metrics.completeness_score(y, labels))
        print("V-measure: %0.3f" % metrics.v_measure_score(y, labels))
        print("Adjusted Rand Index: %0.3f"
              % metrics.adjusted_rand_score(y, labels))
        print("Adjusted Mutual Information: %0.3f"
              % metrics.adjusted_mutual_info_score(y, labels))
        print("Silhouette Coefficient: %0.3f"
              % metrics.silhouette_score(X, labels, metric='sqeuclidean'))
        print("Calinski-Harabasz Score: %0.3f"
              % metrics.calinski_harabasz_score(X, labels))
    
        #if metrics.calinski_harabasz_score(X, labels) > best_ch:
        if metrics.v_measure_score(y, labels) > best_v1:
            best_v1 = metrics.v_measure_score(y, labels)
            best_ch = metrics.calinski_harabasz_score(X, labels)
            best_pref = pref
            best_damp = damp

af = AffinityPropagation(preference=best_pref, damping=best_damp).fit(X)
cluster_centers_indices = af.cluster_centers_indices_
labels = af.labels_
    
n_clusters_ = len(cluster_centers_indices)

print('Estimated number of clusters: %d' % n_clusters_)
print("Homogeneity: %0.3f" % metrics.homogeneity_score(y, labels))
print("Completeness: %0.3f" % metrics.completeness_score(y, labels))
print("V-measure: %0.3f" % metrics.v_measure_score(y, labels))
print("Adjusted Rand Index: %0.3f"
      % metrics.adjusted_rand_score(y, labels))
print("Adjusted Mutual Information: %0.3f"
      % metrics.adjusted_mutual_info_score(y, labels))
print("Silhouette Coefficient: %0.3f"
      % metrics.silhouette_score(X, labels, metric='sqeuclidean'))
print("Calinski-Harabasz Score: %0.3f"
      % metrics.calinski_harabasz_score(X, labels))

# Lets visualise the cluasters

import matplotlib.pyplot as plt
from itertools import cycle

plt.close('all')
plt.figure(1)
plt.clf()

colors = cycle('bgrcmykbgrcmykbgrcmykbgrcmyk')
for k, col in zip(range(n_clusters_), colors):
    class_members = labels == k
    cluster_center = X[cluster_centers_indices[k]]
    plt.plot(X[class_members, 0], X[class_members, 1], col + '.')
    plt.plot(cluster_center[0], cluster_center[1], 'o', markerfacecolor=col,
             markeredgecolor='k', markersize=14)
    for x in X[class_members]:
        plt.plot([cluster_center[0], x[0]], [cluster_center[1], x[1]], col)

x_min, x_max = X[:, 0].min() - 1, X[:, 0].max() + 1
y_min, y_max = X[:, 1].min() - 1, X[:, 1].max() + 1
plt.xlim(x_min, x_max)
plt.ylim(y_min, y_max)
plt.title('Estimated number of clusters: %d' % n_clusters_)
plt.xlabel(iris.feature_names[features_to_use[0]])
plt.ylabel(iris.feature_names[features_to_use[1]])
plt.show()