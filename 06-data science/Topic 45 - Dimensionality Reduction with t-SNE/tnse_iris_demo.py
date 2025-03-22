import matplotlib.pyplot as plt

from sklearn import datasets
from sklearn.manifold import TSNE

iris = datasets.load_iris()

#The iris dataset has 4 dimensions
X = iris.data
y = iris.target
target_names = iris.target_names

tsne = TSNE(n_components=2, init='random',random_state=0, perplexity=5)
X_r = tsne.fit_transform(X)


plt.figure()
colors = ['navy', 'turquoise', 'darkorange']
lw = 2

for color, i, target_name in zip(colors, [0, 1, 2], target_names):
    plt.scatter(X_r[y == i, 0], X_r[y == i, 1], color=color, alpha=.8, lw=lw,
                label=target_name)
plt.legend(loc='best', shadow=False, scatterpoints=1)
plt.title('t-SNE of IRIS dataset')
plt.xlabel('C1')
plt.ylabel('C2')

plt.show()
