# -*- coding: utf-8 -*-
"""
Created on Sun Jul 12 15:17:47 2020

@author: mwelch8
"""

import numpy as np
import matplotlib.pyplot as plt
from matplotlib.colors import ListedColormap
from sklearn import datasets
# This import registers the 3D projection, but is otherwise unused.
from mpl_toolkits.mplot3d import Axes3D  # noqa: F401 unused import

# import some data to play with - the iris dataset
iris = datasets.load_iris()

X = iris.data
tgt = iris.target

cmap_bold = ListedColormap(['red', 'green', 'blue'])
fig = plt.figure(figsize=(20,15))
ax = fig.add_subplot(111, projection='3d')


ax.scatter(X[:,0], X[:,1], X[:,2],c=tgt, cmap=cmap_bold,
                              edgecolor='k', s=30)
ax.view_init(elev=30., azim=-35)

ax.set_xlabel(iris.feature_names[0])
ax.set_ylabel(iris.feature_names[1])
ax.set_zlabel(iris.feature_names[2])