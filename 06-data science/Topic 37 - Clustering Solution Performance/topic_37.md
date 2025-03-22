class: bottom, left
background-image: url(assets/g.png)

<h2 class="title_headings_sml">COSC102 - Data Science Studio 1</h2>

<h1 class="title_headings_sml"> Topic 37 - Cluster Performance Measures</h1>

<h3 class="title_headings_sml"> Dr. Farshid Hajati </h3>

---

## Reading

* [Scikit-Learn Clustering Performance Documentation](https://scikit-learn.org/stable/modules/clustering.html#clustering-performance-evaluation)
* [Sample Code](http://turing.une.edu.au/~cosc102/topics/topic_37/)

---

## Summary

* Basic Concepts
* Silhouette Coefficient
* Calinski-Harabasz Index
* Homogeneity/Completeness Score
* V-measure 

---

## Basic Concepts

* In order to measure how well a clustering algorithm works, we need to quantify the performance of the resulting clustering *solution*.
* Evaluating the performance of a clustering algorithm is not as trivial as counting the number of errors or the precision and recall of a supervised classification algorithm.
* An evaluation metric should not take the absolute values of the cluster labels into account, but rather if this clustering defines separations of the data similar to some ground truth set of classes.


---

## Basic Concepts

* Why do we evaluate a clustering solution?
  * To find the *best* clustering solution.
  * To find if there is a clustering tendency within the data.
  * To compare the results of a clustering solution to externally known results (e.g. class labels).
* Clustering performance measures are designed to assess the validity of the clustering solution. 

---

## Basic Concepts

* **Unsupervised** measures assess the performance of a clustering solution without an external information, such as known class labels.
  * These include measures that capture the **cohesion** and **separation** within the clustering solution.
  * They only use information embedded within the data itself.
* **Supervised** measures assess the extent to which a clustering solution matches some external structure, such as a set of known external labels.
  * These measures are designed to validate the ability of the data to predict the labels and understand how this is achieved within the discovered groupings. 

---

## Basic Concepts

* **Unsupervised Measures:**
  * Silhouette Coefficient
  * Calinski-Harabasz Index

* **Supervised measures:**
  * Homogeneity
  * Completeness
  * V-measure   

---

## Silhouette Coefficient

Given by:

* $a$: The mean distance between a sample and all other points in the same class.
* $b$: The mean distance between a sample and all other points in the next nearest cluster.

The Silhouette Coefficient $s$ for a single sample is then given as:

$$s= \frac{b-a}{max(a,b)} $$

* The Silhouette Coefficient provides a simple measure of cohesion and separation between clusters

---

## Calinski-Harabasz Index

* The Calinski-Harabasz Index (also known as the Variance Ratio Criterion) - can be used to evaluate the model, where a higher Calinski-Harabasz score relates to a model with better defined clusters
* The index is the ratio of the sum of between-clusters dispersion and of inter-cluster dispersion for all clusters (where dispersion is defined as the sum of distances squared)
* This measure is fast to compute.
* The full mathematical formulation is given [here](https://scikit-learn.org/stable/modules/clustering.html#clustering-performance-evaluation).
---

## Homogeneity/Completeness Score

* In particular Rosenberg and Hirschberg (2007) define the following two desirable objectives for any cluster assignment:

  * *homogeneity*: each cluster contains only members of a single class.
  * *completeness*: all members of a given class are assigned to the same cluster.

* Scikit-Learn captures these concepts within the calculation of the homogeneity_score and completeness_score.
* Both are bounded below by 0.0 and above by 1.0 (higher is better)
* These metrics require the knowledge of the ground truth classes while almost never available in practice or requires manual assignment by human annotators (as in the supervised learning setting).

---

## V-measure 

* This is the harmonic mean of the homogeneity_score and completeness_scores.
* This is analogous to the F1-score we looked at in our classification topic.
* The V-measure is actually equivalent to the mutual information index.
* The full mathematical formulation is given [here](https://scikit-learn.org/stable/modules/clustering.html#clustering-performance-evaluation).
---

## Metrics Module 

* The Scikit-learn metrics module has all of these for you:

```python 
# lables conatins that clustering solution for data X with targets y
print('Estimated number of clusters: %d' % n_clusters_)
print("Homogeneity: %0.3f" % metrics.homogeneity_score(y, labels))
print("Completeness: %0.3f" % metrics.completeness_score(y, labels))
print("V-measure: %0.3f" % metrics.v_measure_score(y, labels))
print("Silhouette Coefficient: %0.3f"
      % metrics.silhouette_score(X, labels))
print("Calinski-Harabasz Score: %0.3f"
      % metrics.calinski_harabasz_score(X, labels))

```

---

## Summary

* Basic Concepts
* Silhouette Coefficient
* Calinski-Harabasz Index
* Homogeneity/Completeness Score
* V-measure 

---

## Reading

* [Scikit-Learn Clustering Performance Documentation](https://scikit-learn.org/stable/modules/clustering.html#clustering-performance-evaluation)
* [Sample Code](http://turing.une.edu.au/~cosc102/topics/topic_37/)

---