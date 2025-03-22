# -*- coding: utf-8 -*-
"""
Created on Tue Jun 30 14:33:08 2020

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

fig, ax = plt.subplots(figsize=(12, 12))
ax.scatter(X[:, 2], X[:, 3], edgecolor='k', s=20)

# Now lets experiment with a two-dimensional histogram representation

fig, ax = plt.subplots(figsize=(12, 12))
ax.set_title('Linear normalization')
ax.hist2d(X[:, 2], X[:, 3], bins=10)

# We can even use hexagonal cells!!

fig, ax = plt.subplots(figsize=(12, 12))
hb = ax.hexbin(X[:, 2], X[:, 3], gridsize=10)
