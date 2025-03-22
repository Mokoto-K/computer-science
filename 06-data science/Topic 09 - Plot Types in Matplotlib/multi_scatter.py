# -*- coding: utf-8 -*-
"""
Created on Mon Jun 29 22:18:17 2020

@author: mwelch8
"""

# First we will import Python libraries that we need to access the data, create
# plots and run the nearest-neighbours machine learning algorithm 

import numpy as np
import matplotlib.pyplot as plt
from matplotlib.colors import ListedColormap
from sklearn import datasets

# import some data to play with - the iris dataset
iris = datasets.load_iris()

X = iris.data
tgt = iris.target

cmap_bold = ListedColormap(['red', 'green', 'blue'])

fig, axs = plt.subplots(4, 4, figsize=(12, 12))

for x in range(0,4):
    for y in range(0,4):
        if x == 0:
            axs[y, x].set_ylabel(iris.feature_names[y])
        if y == 3:
            axs[y, x].set_xlabel(iris.feature_names[x])
        if x != y:
            axs[y, x].scatter(X[:, x], X[:, y], c=tgt, cmap=cmap_bold,
                              edgecolor='k', s=20)
fig.suptitle('Iris Data (red=setosa, green=versicolor,blue=virginica',fontsize=24)
plt.show()