class: bottom, left
background-image: url(assets/g.png)

<h2 class="title_headings_sml">COSC102 - Data Science Studio 1</h2>

<h1 class="title_headings_sml"> Topic 13 - Challenges of Machine Learning </h1>

<h3 class="title_headings_sml"> Dr. Farshid Hajati </h3>

---

## Reading
* Chapter 1 from ***Hands-on Machine Learning with Scikit-Learn & TensorFlow***

---

## Summary

* Insufficient Quantity of Data
* Non-Representative Data
* Poor Quality Data
* Poor Feature Selection
* Overfitting the Data
* Underfitting the Data

---

## The Machine-learning Approach

.center[![Matplotlib](assets/topic_12/ml.png)]

---
## Insufficient Quantity of Data

* It takes a lot of data for most machine learning algorithms to successfully train and a machine learning algorithm.
* Very simple problems can require thousands of examples.
* For complex problems like image and speech recognition may need millions of examples.
* This is largely determined by the ability of the data to describe the problem. 

---

## Insufficient Quantity of Data

.center[![Matplotlib](assets/topic_13/knn.png)]

---
## Insufficient Quantity of Data

.center[![Matplotlib](assets/topic_13/effectiveness.png)]

---

## Non-Representative Data

* In order to generalize well, the data must be reflective of new cases that you want to predict.
* Non-representative data can result from:
  * *Sampling noise* - By chance.
  * *Sampling bias* - flawed sampling method that does not capture data reflective of all aspects of the problem.
* If the data doesn't represent the pattern, the algorithm can't learn the pattern.
* Datasets should be **balanced** so that each *class*/*target* is represented by the same number of data points.
---

## Poor Quality Data

* Real world datasets often contain errors.
* These errors introduce *noise* that makes the recognition of underlying patterns difficult. 
* This noise can generate outliers that aren't reflective of the general trends.
* Missing features and values need to be cleaned up or the data point needs to be ignored.

---

## Poor Feature Selection

* Including irrelevant features has the effect of introducing noise into the training process.
* These are features that have limited predictive of discriminative power.
* The ML algorithm may train to the irrelevant features and this will reduce the ability of the algorithm to generalize.

---

## Poor Feature Selection

.center[![Matplotlib](assets/topic_13/poor_feature.png)]

---

## Overfitting the Data

* Occurs when the model performs well on the training data, but does not generalize well to new data points.
* This usually results from an overly complex model to a chance noisy pattern in the training data.
* The model may be too complex relative to the size and noisiness of the training data.
  * Reduce the complexity of the model.
  * Increase the size of the dataset.
  * Reduce the noise in the training data.

---

## Overfitting the Data

* Simplification of the model is referred to as *regularization*.
* A good example of regularization might involve constraining the *slope* parameter in a linear regression.
* If we constrain this parameter, we can reduce the risk of overfit.
* Regularization is a balancing act!

---
## Overfitting the Data

.center[![Matplotlib](assets/topic_13/overfit.png)]

---

## Overfitting the Data

.center[![Matplotlib](assets/topic_13/good_fit.png)]

---

## Underfitting the Data

* The model is too simple to learn the underlying structure in the data.
* Solution:
  * More powerful model with more parameters.
  * Better feature selection.
  * Avoid over-regularization

---

## Summary

* Insufficient Quantity of Data
* Non-Representative Data
* Poor Quality Data
* Poor Feature Selection
* Overfitting the Data
* Underfitting the Data

---

## Reading
* Chapter 1 from ***Hands-on Machine Learning with Scikit-Learn & TensorFlow***

---