class: bottom, left
background-image: url(assets/g.png)

<h2 class="title_headings_sml">COSC102 - Data Science Studio 1</h2>

<h1 class="title_headings_sml"> Topic 45 - Dimensionality Reduction with t-SNE</h1>

<h3 class="title_headings_sml"> Dr. Mitchell Welch </h3>

---


## Reading

* **Chapter 8** from *Hands-on Machine Learning with Scikit-Learn and Tensor Flow*
* Review [https://distill.pub/2016/misread-tsne/](https://distill.pub/2016/misread-tsne/)
* [t-SNE Demos](http://turing.une.edu.au/~cosc102/topics/topic_45/)

---

## Summary

* t-SNE Concepts
* t-SNE in Scikit-Learn 

---

## t-SNE Concepts

* *t-distributed stochastic neighbor embedding* (t-SNE) is a popular dimensionality reduction technique that is particularly good at creating visually pleasing 2/3-D 'maps' of higher dimensional data.
* The algorithm is non-linear and adapts to the underlying data, performing different transformations on different regions.
* t-SNE has a tuneable parameter, ***perplexity***, which controls the balance between *local* and *global* aspects of your data. 
  * The parameter is a guess about the number of close neighbors each point has.

---

## t-SNE Concepts

* Review the interactive visualisations available at [https://distill.pub/2016/misread-tsne/](https://distill.pub/2016/misread-tsne/)
* The transformation of the two interlocking rings into a 2-dimensional representation is particularly impressive.
* The formal mathematics are covered in [van der Maaten and Hinton in 2008](https://www.jmlr.org/papers/volume9/vandermaaten08a/vandermaaten08a.pdf) (Complete coverage of this is beyond the scope of this unit)
* The algorithm is iterative with a stopping condition based upon achieving a stable state.


---

## t-SNE Concepts

.center[![center-aligned](assets/topic_45/perp.png)]

---

## t-SNE Concepts

* t-SNE is very sensitive to the perplexity parameter.
* In the previous example, perplexity values in the range (5 - 50) the diagrams do show the underlying clusters, although with very different shapes.
  * With perplexity=2, local variations dominate.
  * With perplexity=50, the global structure is clearly evident.
* t-SNE also has a learning-rate parameter (epsilon)
  * This controls the rate/resolution that the algorithms uses to iterate to a stable state. 

---

## t-SNE Concepts

* The relative *sizes* of clusters produced within the lower dimensional representation are meaningless. 
* t-SNE adapts to the local densities and expands dense clusters.
* This density equalization happens by design and is a predictable feature of t-SNE.
* This is clear in the underlying algorithm -  it *searches* for conditional probability distributions across each point to achieve the desired perplexity.


---

## t-SNE Concepts

* The distances between clusters within the lower dimensional don't necessarily have any specific meaning.
* Again, this is an effect of the adaptive approach.
* We can achieve the desired global spacing between clusters evident in the higher-dimensional space by manipulating the perplexity.

---

## t-SNE Concepts

* t-SNE can produce patterns from random noise.
* This happens on *local* noise with low perplexities and *global* noise at high perplexities.
  * *Clumps* in the lower-dimensional representation aren't meaningful (especially with low perplexity)
* t-SNE generally distorts structures present within the higher-dimensional data outwards.
* This occurs through the expansion of higher density regions. 

---

## t-SNE in Scikit-Learn 

* The t-SNE function sits within the manifold module.
* Scikit-learn classifies t-SNE as an unsupervised, manifold learning algorithm.

```python
from sklearn.manifold import TSNE

# Where X contains our original data and we are calculating a 2-dimensional set.
tsne = TSNE(n_components=2, init='random',random_state=0, perplexity=5)
X_r = tsne.fit_transform(X)

```

* Review the example
  * [tnse_iris_demo.py](http://turing.une.edu.au/~cosc102/topics/topic_45/tnse_iris_demo.py)
  * [tsne_wine_demo.py](http://turing.une.edu.au/~cosc102/topics/topic_45/tsne_wine_demo.py)

---

## Summary

* t-SNE Concepts
* t-SNE in Scikit-Learn 

---

## Reading

* **Chapter 8** from *Hands-on Machine Learning with Scikit-Learn and Tensor Flow*
* Review [https://distill.pub/2016/misread-tsne/](https://distill.pub/2016/misread-tsne/)
* [t-SNE Demos](http://turing.une.edu.au/~cosc102/topics/topic_45/)

---


