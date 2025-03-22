
class: bottom, left
background-image: url(assets/g.png)

<h2 class="title_headings_sml">COSC102 - Data Science Studio 1</h2>

<h1 class="title_headings_sml"> K-means Clustering
</h1>

<h3 class="title_headings_sml"> Dr. Farshid Hajati </h3>

---

## In this Video...

* We'll be looking at:
* K-Means Clustering.
* End to end model building.
* Evaluating our models.
*  [Here is the link to the Jupyter Notebook we'll be using in this video](https://mybinder.org/v2/git/https%3A%2F%2Fgitlab.une.edu.au%2Fmwelch8%2Fcosc102/master?filepath=topic_35%2FK-Means_Clustering.ipynb)

---

### What is K-Means Clustering
* K-means clustering is an unsupervised algorithm, which means that it makes inferences based on input data, without the need for predefined output labels.
* K-means clustering functions by grouping similar data points together, into clusters, which may reveal patterns. 
* A predefined number of clusters must be provided (k). K-means clustering looks for k clusters in the dataset.

---

## What is K-Means Clustering cont....
* A cluster is a group of data points aggregated based on similarities, e.g. if 2 sentences contain the word 'great' they may be grouped together.
* The predefined number of clusters (k) lets the algorithm know how many centroids are required, (sqrt(n/2)). 
* A centroid represents the center of a cluster. K-means clustering allocates every data point to the nearest cluster.

---

## What is K-Means Clustering cont....
* The word ‘means’ in K-means clustering refers to the mean averaging of data to find the centroid.
.center[![K-means clustering](assets/topic_35/KMeans.PNG)]

---

## How the K-means clustering algorithm work
* K-means clustering initially uses a group of randomly selected centroids.
* Iterative calculations are then used to optimise the positions of the centroids
* K-means clustering is not intelligent. It simply looks for patterns in data to develop clusters.

---

## And we're done!
*  [Visit the Jupyter Notebook](https://mybinder.org/v2/git/https%3A%2F%2Fgitlab.une.edu.au%2Fmwelch8%2Fcosc102/master?filepath=topic_35%2FK-Means_Clustering.ipynb)
* Remember programming is all about practical experience so feel free to experiment and test things out in the notebook
* Thanks for watching! If you have any questions, ask away on SLACK.
* Happy coding!
.center[[![Binder Python Lesson 1](https://mybinder.org/badge_logo.svg)](https://mybinder.org/v2/git/https%3A%2F%2Fgitlab.une.edu.au%2Fmwelch8%2Fcosc102/master?filepath=topic_35%2FK-Means_Clustering.ipynb)]

---
