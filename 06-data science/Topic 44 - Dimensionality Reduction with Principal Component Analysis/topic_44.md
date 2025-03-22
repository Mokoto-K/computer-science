class: bottom, left
background-image: url(assets/g.png)

<h2 class="title_headings_sml">COSC102 - Data Science Studio 1</h2>

<h1 class="title_headings_sml"> Topic 44 - Dimensionality Reduction with Principal Component Analysis</h1>

<h3 class="title_headings_sml"> Dr. Mitchell Welch </h3>

---

## Reading

* **Chapter 8** from *Hands-on Machine Learning with Scikit-Learn and Tensor Flow*

---

## Summary

* PCA Concepts
* PCA in Scikit-Learn 

---

## PCA Concepts

* *Principal Component Analysis* (PCA) is by far the most popular dimensionality reduction
algorithm.
* First it identifies the hyperplane that lies closest to the data, and then
it projects the data onto it.

.center[![center-aligned](assets/topic_43/projection.png)]

---

## PCA Concepts

* This raises the question - how do we select the hyperplane?
* In PCA, we select the axis that preserves the maximum amount of variance.
* The idea behind this is that it will most likely **lose less information** than other possible projections.
* The $i^{th}$ axis is called the ith principal component (PC) of the data.
---

## PCA Concepts

An example 2-dimensional dataset:

.center[![center-aligned](assets/topic_44/pca_2d.png)]

---

## PCA Concepts

* In this example, we have identified 3 1-dimensional hyperplanes.
* On the right is the result of the projection of the dataset onto each of these hyperplanes.
  * The projection onto the **solid** line preserves the maximum variance.
  * The projection onto the **dashed** line preserves an intermediate amount of variance.
  * The projection onto the **dotted** line preserves very little variance.

---

## PCA Concepts

* The PCA algorithm identifies the axis that accounts for the largest amount of variance in the training set: this becomes the first principle component (the vector $C_1$)
* It also finds a second axis, *orthogonal* to the first one, that accounts for the largest amount of remaining variance (vector $C_2$).
  * In this example, there is only one choice - if there were more dimensions, there would be additional choices.
  * In this situation, we select the axis that accounts for the next largest amount of variance and so on unit the dimensions are exhausted.

---

## PCA Concepts

* So how do we find the the axis that accounts for the largest amount of variance?
* PCA uses a standard matrix factorization technique called *Singular Value Decomposition* (SVD)
* This approach decomposes the training set into a set of matrices that describe the scale, transformation and rotation of the dataset:

$$ M = U \cdot \Sigma \cdot V^t $$

* The $V^t$ matrix contains the principle components.
* PCA assumes that the dataset is centered around the origin - Scikit-Learn’s PCA classes take care of centering the data for you.

---

## PCA Concepts

* Once we have the principle components, we reduce the dimensionality of the dataset to *d* dimensions by projecting it on the hyperplane defined by first *d* principle components.
* This ensures that the maximum amount of variance is preserved for the reduced number of dimensions.
* To project the training set onto the hyperplane and obtain a reduced dataset $X_{d-proj}$ of dimensionality $d$, compute the matrix multiplication of the training set matrix $X$ by
the matrix $W_d$, defined as the matrix containing the first $d$ columns of $V^t$

$$ X_{d-proj} = X \cdot W_d $$

---

## PCA in Scikit-Learn

* This is all implemented within scikit-learn.

```python
from sklearn.decomposition import PCA
pca = PCA(n_components = 2)
X2D = pca.fit_transform(X)

```

---

## PCA in Scikit-Learn

* One of the really useful feature implemented within the scikit-learn PCA module is the *explained variance ratio* for each feature.
* This ratio indicates the proportion of the dataset's variance that lies along each principle component.

```
>>> pca.explained_variance_ratio_
array([0.84248607, 0.14631839])
```

* Review the examples:
  * [pca_demo.py](http://turing.une.edu.au/~cosc102/topics/topic_44/pca_demo.py)
  * [pca_demo_wine.py](http://turing.une.edu.au/~cosc102/topics/topic_44/pca_demo_wine.py)

---

## Summary

* PCA Concepts
* PCA in Scikit-Learn 

---

## Reading

* **Chapter 8** from *Hands-on Machine Learning with Scikit-Learn and Tensor Flow*

---