# -*- coding: utf-8 -*-
"""
Created on Thu Sep 17 09:19:42 2020

@author: mwelch8
"""

from sklearn.datasets import make_swiss_roll
from sklearn.manifold import TSNE
import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D
from sklearn.manifold import LocallyLinearEmbedding
from sklearn.decomposition import PCA

X, t = make_swiss_roll(n_samples=1500, noise=0.2)

axes = [-11.5, 14, -2, 23, -12, 15]

fig = plt.figure(figsize=(11, 10))
ax = fig.add_subplot(111, projection='3d')

ax.scatter(X[:, 0], X[:, 1], X[:, 2], c=t, cmap=plt.cm.jet)
ax.view_init(10, -70)
ax.set_xlabel("$x_1$", fontsize=18)
ax.set_ylabel("$x_2$", fontsize=18)
ax.set_zlabel("$x_3$", fontsize=18)
ax.set_xlim(axes[0:2])
ax.set_ylim(axes[2:4])
ax.set_zlim(axes[4:6])

plt.show()

pca = PCA(n_components=2)
X_r = pca.fit(X).transform(X)

plt.title("Unrolled swiss roll using PCA", fontsize=14)
plt.scatter(X_r[:, 0], X_r[:, 1], c=t, cmap=plt.cm.jet)
plt.xlabel("$z_1$", fontsize=18)
plt.ylabel("$z_2$", fontsize=18)
#plt.axis([-0.065, 0.055, -0.1, 0.12])
plt.grid(True)

plt.show()

tsne = TSNE(n_components=2, init='random',random_state=0, perplexity=25)
X_r = tsne.fit_transform(X)

plt.title("Unrolled swiss roll using t-SNE", fontsize=14)
plt.scatter(X_r[:, 0], X_r[:, 1], c=t, cmap=plt.cm.jet)
plt.xlabel("$z_1$", fontsize=18)
plt.ylabel("$z_2$", fontsize=18)
#plt.axis([-0.065, 0.055, -0.1, 0.12])
plt.grid(True)

plt.show()


# The gold standard using locally linear embedding

lle = LocallyLinearEmbedding(n_components=2, n_neighbors=10, random_state=42)
X_r = lle.fit_transform(X)

plt.title("Unrolled swiss roll using LLE", fontsize=14)
plt.scatter(X_r[:, 0], X_r[:, 1], c=t, cmap=plt.cm.jet)
plt.xlabel("$z_1$", fontsize=18)
plt.ylabel("$z_2$", fontsize=18)
#plt.axis([-0.065, 0.055, -0.1, 0.12])
plt.grid(True)

plt.show()

