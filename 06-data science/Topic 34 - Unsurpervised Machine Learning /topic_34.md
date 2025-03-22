class: bottom, left
background-image: url(assets/g.png)

<h2 class="title_headings_sml">COSC102 - Data Science Studio 1</h2>

<h1 class="title_headings_sml"> Topic 34 - Unsupervised Machine Learning</h1>

<h3 class="title_headings_sml"> Dr. Farshid Hajati </h3>

---

## Reading

* Chapter 9 from *Hands-on Machine Learning with Scikit-Learn & TensorFlow* (This chapter only appears in the second edition)
* [Scikit-Learn Clustering Documentation](https://scikit-learn.org/stable/modules/clustering.html#clustering)
* Review the [clustering example script](http://turing.une.edu.au/~cosc102/topics/topic_34/iris_afp.py)

---

## Summary

* Unsupervised Machine Learning Concepts
* Simple Clustering Example

---

## Unsupervised Machine Learning Concepts

* In the real world the vast majority of the available data is unlabeled: 
  * we have the input features **X**, but we do not have the labels **y**
* Labeling data will generally require human input to annotate the datasets.
* This can be expensive and difficult to achieve.
* As a result, the labeled dataset will be quite small, and any trained classifier algorithms will have poor performance.

---

## Unsupervised Machine Learning Concepts

* Unsupervised machine learning algorithms identify underlying groupings in the data.
* The most common machine learning approach is *clustering*.
* This is the task of identifying similar instances and assigning them to clusters, or groups of similar instances.
  * Similarity is based upon some sort of distance measurement between data points within the set. 

---

## Unsupervised Machine Learning Concepts

.center[![center-aligned](assets/topic_34/unlabelled.png)]

---

## Unsupervised Machine Learning Concepts

.center[![center-aligned](assets/topic_34/clustered.png)]

---

## Unsupervised Machine Learning Concepts

.center[![center-aligned](assets/topic_34/real_clusters.png)]

---

## Unsupervised Machine Learning Concepts

* In order to measure how well a clustering algorithm works, we need to quantify the performance of the resulting clustering *solution*.
* Evaluating the performance of a clustering algorithm is not as trivial as counting the number of errors or the precision and recall of a supervised classification algorithm.
* An evaluation metric should not take the absolute values of the cluster labels into account but rather if this clustering define separations of the data similar to some ground truth set of classes.

---

## Unsupervised Machine Learning Concepts

* There are many performance measures that can be used to quantify the performance:
  * **Rand Index** - is a function that measures the similarity of the two assignments with known labels.
  * **Homogeneity** - each cluster contains only members of a single class.
  * **Completeness** - all members of a given class are assigned to the same cluster.
  * Their harmonic mean called **V-measure** .
  * **Calinski-Harabasz Index** - ratio of the sum of between-clusters dispersion and of inter-cluster dispersion.

---

## Simple Example

* We will review a simple example that applies the affinity algorithm to cluster the iris dataset.
* Review the [clustering example script](http://turing.une.edu.au/~cosc102/topics/topic_34/iris_afp.py)


---

## Summary

* Unsupervised Machine Learning Concepts
* Simple Clustering Example

---

## Reading

* Chapter 9 from *Hands-on Machine Learning with Scikit-Learn & TensorFlow* (This chapter only appears in the second edition)
* [Scikit-Learn Clustering Documentation.](https://scikit-learn.org/stable/modules/clustering.html#clustering)
* Review the [clustering example script.](http://turing.une.edu.au/~cosc102/topics/topic_34/iris_afp.py)


---


