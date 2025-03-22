class: bottom, left
background-image: url(assets/g.png)

<h2 class="title_headings_sml">COSC102 - Data Science Studio 1</h2>

<h1 class="title_headings_sml"> Topic 43 - Dimensionality Reduction Concepts</h1>

<h3 class="title_headings_sml"> Dr. Mitchell Welch </h3>

---

## Reading

* **Chapter 8** from *Hands-on Machine Learning with Scikit-Learn and Tensor Flow*

---

## Summary

* The Curse of Dimensionality
* Projections and Manifolds

---

## The Curse of Dimensionality

* Many Machine Learning problems involve thousands or even millions of features for
each training instance. 
* Features can be redundant and correlated.
* Features can be noisy and provide no useful information to the ML problem.
  * This large quantity of features make training extremely slow.
  * They can also make it much harder to find a good solution.
* This problem is often referred to as *the curse of dimensionality*.
* We have seen this problem when working with the MNIST dataset.


---

## The Curse of Dimensionality

.center[![center-aligned](assets/topic_17/mnist.png)]


---
## The Curse of Dimensionality

* Fortunately (in real-world problems) it is often possible to reduce the number of features considerably.
   * Consider the MNIST images: the pixels on the image borders are almost always white, so you could completely drop these pixels from the training set without losing much information.

---

## The Curse of Dimensionality

Relative pixel importance using *Recursive Feature Elimination*

.center[![center-aligned](assets/topic_43/mnist_pixels.png)]

---

## The Curse of Dimensionality

* We are so used to living in three dimensions that our intuition fails us when we try to imagine a high-dimensional space.
* Even a basic 4D hypercube is incredibly hard to picture in our minds.

.center[![center-aligned](assets/topic_43/hypercube.png)]

---

## The Curse of Dimensionality

* It turns out that many things behave very differently in high-dimensional space. 
  * For example, if you pick a random point in a unit square (a 1 × 1 square, it will have only about a 0.4% chance of being located less than 0.001 from a border (in other words, it is very unlikely that a random point will be “extreme” along any dimension). 
  * But in a 10,000-dimensional unit hypercube, this probability is greater than 99.999999%. Most points in a high-dimensional hypercube are very close to the border.


---

## The Curse of Dimensionality

* Another example: 
  * If you pick two points randomly in a *unit square*, the distance between these two points will be, on average, roughly 0.52. 
  * If you pick two random points in a *unit 3D cube*, the average distance will be roughly 0.66.
  * In a 1,000,000-dimensional hypercube, the average distance (believe it or not) will be about 408.25
* how can two points be so far apart when they both lie within
the same unit hypercube? 
* There’s just plenty of space in high dimensions. 

---

## The Curse of Dimensionality

* This reduction on density as we increase the number of dimensions is problematic.
* It means that a new instance will likely be far away from any training instance, making predictions much less reliable.
* We need more more data points to achieve the required density to train a machine learning algorithm.
  * Or we need to create a lower-dimensional representation.


---

## Projections and Manifolds

* In most real-world problems, training instances are not spread out uniformly across all dimensions. 
* Many features are almost constant, while others are highly correlated
(as discussed earlier for MNIST). 
* Training instances lie within (or close to) a much lower-dimensional subspace of the high-dimensional space.

---

## Projections and Manifolds

.center[![center-aligned](assets/topic_43/projection.png)]

---

## Projections and Manifolds

* Notice that all training instances lie close to a plane:
    * This is a lower-dimensional (2D) subspace of the high-dimensional (3D) space.

* If we project every training instance perpendicularly onto this subspace (as represented by the short lines connecting the instances to the plane), we get the new 2D dataset

---

## Projections and Manifolds

.center[![center-aligned](assets/topic_43/projection_2.png)]

---

## Projections and Manifolds

* Things can be more complicated however:

.center[![center-aligned](assets/topic_43/swiss_role.png)]

---

## Projections and Manifolds

* This one won't project down nicely:

.center[![center-aligned](assets/topic_43/swiss_role_flat.png)]

---

## Projections and Manifolds

* The Swiss roll is an example of a 2D *manifold*. 
* Put simply, a 2D manifold is a 2D shape that can be bent and twisted in a higher-dimensional space.
* Many dimensionality reduction algorithms work by modeling the manifold on which the training instances lie.
*  This relies on the *manifold assumption*: most real-world high-dimensional datasets lie close to a much lower-dimensional manifold
  
---

## Projections and Manifolds

* Reducing the dimensionality of your training set before training a model will usually speed up training.
* It may not always lead to a better or simpler solution; it all depends on the dataset.


---

## Summary

* The Curse of Dimensionality
* Projections and Manifolds

---

## Reading

* **Chapter 8** from *Hands-on Machine Learning with Scikit-Learn and Tensor Flow*

---