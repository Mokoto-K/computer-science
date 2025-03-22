# -*- coding: utf-8 -*-
"""
Created on Tue Sep  8 19:23:27 2020

@author: mwelch8
"""

# First we will import Python libraries that we need to access the data, create
# plots and run the nearest-neighbours machine learning algorithm 

import matplotlib.pyplot as plt
from sklearn import datasets
from sklearn.cluster import AffinityPropagation
from sklearn.cluster import KMeans
from sklearn import metrics
import matplotlib.pyplot as plt
from itertools import cycle

# This specifies the data columns from the iris dataset that we will use.
# We must select exactly 2 columns for this script to work
features_to_use =[1,2]


# import some data to play with - the iris dataset
iris = datasets.load_iris()
X = iris.data[:,features_to_use]
y = iris.target

af = AffinityPropagation(preference=-40, damping=0.65).fit(X)
cluster_centers_indices = af.cluster_centers_indices_
labels = af.labels_

n_clusters_ = len(cluster_centers_indices)

print("************************************************************")

print("Affinity Propagation Clustering Solution")
print('Estimated number of clusters: %d' % n_clusters_)
print("Homogeneity: %0.3f" % metrics.homogeneity_score(y, labels))
print("Completeness: %0.3f" % metrics.completeness_score(y, labels))
print("V-measure: %0.3f" % metrics.v_measure_score(y, labels))
print("Silhouette Coefficient: %0.3f"
      % metrics.silhouette_score(X, labels, metric='sqeuclidean'))
print("Calinski-Harabasz Score: %0.3f"
      % metrics.calinski_harabasz_score(X, labels))
print("************************************************************")
# Lets visualise the cluasters

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
plt.title('Afinity Propagation - Estimated number of clusters: %d' % n_clusters_)
plt.xlabel(iris.feature_names[features_to_use[0]])
plt.ylabel(iris.feature_names[features_to_use[1]])
plt.show()

#Now we can compare the affinity propagation solution with a K-Means a solution

kmeans = KMeans(init='k-means++', n_clusters=3, n_init=10)
kmeans.fit(X)


labels = kmeans.labels_
n_clusters_ = len(cluster_centers_indices)

print("************************************************************")

print("Kmeans Clustering Solution")
print('Estimated number of clusters: %d' % n_clusters_)
print("Homogeneity: %0.3f" % metrics.homogeneity_score(y, labels))
print("Completeness: %0.3f" % metrics.completeness_score(y, labels))
print("V-measure: %0.3f" % metrics.v_measure_score(y, labels))
print("Silhouette Coefficient: %0.3f"
      % metrics.silhouette_score(X, labels, metric='sqeuclidean'))
print("Calinski-Harabasz Score: %0.3f"
      % metrics.calinski_harabasz_score(X, labels))
print("************************************************************")

colors = cycle('bgrcmykbgrcmykbgrcmykbgrcmyk')
for k, col in zip(range(n_clusters_), colors):
    class_members = labels == k
    plt.plot(X[class_members, 0], X[class_members, 1], col + '.')

x_min, x_max = X[:, 0].min() - 1, X[:, 0].max() + 1
y_min, y_max = X[:, 1].min() - 1, X[:, 1].max() + 1
plt.xlim(x_min, x_max)
plt.ylim(y_min, y_max)
plt.title('K-means: %d Clusters' % n_clusters_)
plt.xlabel(iris.feature_names[features_to_use[0]])
plt.ylabel(iris.feature_names[features_to_use[1]])
plt.show()



