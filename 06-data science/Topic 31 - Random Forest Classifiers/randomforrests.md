
class: bottom, left
background-image: url(assets/g.png)

<h2 class="title_headings_sml">COSC102 - Data Science Studio 1</h2>

<h1 class="title_headings_sml"> Random Forrest Classifiers
</h1>

<h3 class="title_headings_sml"> Andreas Shepley, PhD Candidate </h3>

---

## In this Video...

* We'll be looking at:
* Random Forest Classifier.
* End to end model building.
* Evaluating our models.
*  [Here is the link to the Jupyter Notebook we'll be using in this video](filepath=https://mybinder.org/v2/git/https%3A%2F%2Fgitlab.une.edu.au%2Fmwelch8%2Fcosc102/master?filepath=https%3A%2F%2Fmybinder.org%2Fv2%2Fgit%2Fhttps%253A%252F%252Fgitlab.une.edu.au%252Fmwelch8%252Fcosc102%2Fmaster)
---

### Random Forrests
* Random forests is a supervised learning algorithm.
* It can be used both for classification and regression problems.
* Random forests fits a number of decision tree classifiers on randomly selected sub-samples of the dataset.
* It obtains a prediction from each tree, then uses voting to return an optimal result
* It uses averaging to improve the predictive accuracy and minimise over-fitting.
* Increasing the number of trees improves robustness
* Random forests uses randomly selected subsets of the training data to create decorrelated decision trees. This reduces variances, and improves robustness of the model, by ensuring the model isn't entirely dependent on any given strong predictor. 
---

## Random Forests Algorithm
* Random forests is good for applications such as recommendation engines, image classification, predict patient outcomes based on symptoms, etc.
* If you were seeking recommendations to buy a product online, e.g. an air fryer, you would search and read online reviews. This can be compared to the decison tree part of the algorithm.
* You would then tally the votes for the most recommended products and base your decision on the majority vote. 
.center[![Python Reserved Keywords](assets/topic_31/randomforrest.PNG)]
---

## Advantages
* It decorrelates features, even if the dataset has many highly correlated features, thus removing bias in the prediction.
* It can reduce error because it relies on a collection of decision trees, which means that it will use many trees to predict the outcome of one sample, minimising error and variance.
* It performs well on unbalanced datasets, e.g. when one class is is dominant, e.g >98% of transactions will be genuine, with <2% fraudulent
* Minimisation of impact of outliers on predictions because many trees are used
* Very good at generalisation, with minmal overfitting because only a random subset of features are used per tree, with many trees being used per prediction.
---

## And we're done!
*  [Visit the Jupyter Notebook](https://mybinder.org/v2/git/https%3A%2F%2Fgitlab.une.edu.au%2Fmwelch8%2Fcosc102/master?filepath=https%3A%2F%2Fmybinder.org%2Fv2%2Fgit%2Fhttps%253A%252F%252Fgitlab.une.edu.au%252Fmwelch8%252Fcosc102%2Fmaster)
* Remember programming is all about practical experience so feel free to experiment and test things out in the notebook
* Thanks for watching! If you have any questions, ask away on SLACK.
* Happy coding!

.center[[![Binder Python Lesson 1](https://mybinder.org/v2/git/https%3A%2F%2Fgitlab.une.edu.au%2Fmwelch8%2Fcosc102/master?filepath=https%3A%2F%2Fmybinder.org%2Fv2%2Fgit%2Fhttps%253A%252F%252Fgitlab.une.edu.au%252Fmwelch8%252Fcosc102%2Fmaster)]




