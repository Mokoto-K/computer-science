class: bottom, left
background-image: url(assets/g.png)

<h2 class="title_headings_sml">COSC102 - Data Science Studio 1</h2>

<h1 class="title_headings_sml"> Topic 12 - The Machine Learning Landscape </h1>

<h3 class="title_headings_sml"> Dr. Farshid Hajati </h3>

---

## Reading
* Chapter 1 from ***Hands-on Machine Learning with Scikit-Learn & TensorFlow***

---

## Summary

* What is Machine Learning?
* Types of Machine Learning

---

## What is Machine Learning?

* Put simply: Machine learning is the science (or art) of programming computers so they can learn from data.
* More generally:
  * *Machine Learning is the field of study that gives computers the ability to learn without being explicitly programmed*  —Arthur Samuel, 1959

* An Example: An email **spam filter** that flags spam emails typically uses *training* examples to learn which future emails should be flagged as *spam*
  * Each training example is a *training instance* - these need to include positive and negative examples.  

---

## What is Machine Learning?

.center[![Matplotlib](assets/topic_12/traditional.png)]

---

## What is Machine Learning?

.center[![Matplotlib](assets/topic_12/ml.png)]

---

## What is Machine Learning?

.center[![Matplotlib](assets/topic_12/adaptive.png)]

---

## Machine Learning Benefits

* Machine learning algorithms can help humans study a problem.
* We can inspect the structure of the resulting trained algorithm
* We can assess the *importance* and use of different *features*
* Understand patterns drawn from very large datasets.


---

## Types of Machine Learning

* Supervised Learning: 
  * The data fed into the algorithm includes the desired solutions or *targets* - for example, our *iris dataset*
* Typically used for *classification* or *prediction (regression)*:
  * Classification usually refers to categorical problems (e.g. spam vs non-spam)
  * Prediction uses features (*predictors*) to predict a numeric value (*target*).  

---

## Types of Machine Learning

.center[![Matplotlib](assets/topic_12/regression.png)]

---

## Types of Machine Learning

* Unsupervised Learning:
   * The data fed into the algorithm does not include the solution or target. The data is said to be *unlabelled*
* This approach allows us to find natural groupings and even assign labels to these groupings within the data.  
* We can detect anomalies and outliers within the data.
* We can deduce *Association rules* - for example, looking at related purchases at retail stores.

---

## Types of Machine Learning

.center[![Matplotlib](assets/topic_12/tsne.png)]


---

## Types of Machine Learning

* Semisupervised Learning:
  * The data fed into the algorithm has some labels.
* Labels can be transferred from labelled to un-labelled examples using an unsupervised ML algorithm.
* The system can be fine-tuned using a supervised ML algorithm. 

---

## Types of Machine Learning

* Reinforcement Learning:
  * Agents learn to solve a problem by selecting and performing *actions* to receive a *reward* 
  * The Agent updates this selection policy to maximize the reward.
  * Example: The DeepMind AlphaGo Algorithm beat the world champion at the game of *Go*
    * The policy was learnt from analyzing millions of games and play against itself.  


---

## Types of Machine Learning

.center[![Matplotlib](assets/topic_12/reinforcement.png)]


---

## Summary

* What is Machine Learning?
* Types of Machine Learning

---

## Reading
* Chapter 1 from ***Hands-on Machine Learning with Scikit-Learn & TensorFlow***

---

