
class: bottom, left
background-image: url(assets/g.png)

<h2 class="title_headings_sml">COSC102 - Data Science Studio 1</h2>

<h1 class="title_headings_sml"> MLP Regression Example
</h1>

<h3 class="title_headings_sml"> Andreas Shepley, PhD Candidate </h3>

---

## In this Video...

* We'll be looking at:
* Regression MLPs
* Building an End-to-end Regression MLP
* [Here is the link to the Jupyter Notebook we'll be using in this video](https://mybinder.org/v2/git/https%3A%2F%2Fgitlab.une.edu.au%2Fmwelch8%2Fcosc102/master?filepath=topic_42%2FRegressionMLP.ipynb)
---

## REGRESSION MLPS
* MLPs can also be used for multivariate regression too, but you need 1 output neuron for each output value
* Including an activation function in the output layer is optional 
* Including an activiation function gives you a more predictable result, e.g. using ReLU will ensure your output is never negative
.center[![Python Reserved Keywords](assets/topic_40/mlp.PNG)]
---

## REGRESSION MLPS
* Regression is used to predict or estimate the relationships between a dependent variable and one or more independent variables
* For example, in classification problems, we predict the category of an item
* e.g. poisonous or edible mushroom. In contrast, regression problems involve predicting a value as close to our target as possible
* e.g. if you are predicting the value of a car, and it has a target value of 34,000, and your model predicts the value to be 32,500, you will probably be satisfied!
---

## Loss functions for Regression MLPs
* Loss functions are used to calculate the difference between the predicted output and the target, or desired output
* Mean squared error
* Mean absolute error
* Huber Loss: combination of means squared and mean abosolute error
.center[![Python Reserved Keywords](assets/topic_40/lossfunction.PNG)]
---

## And we're done!
*  [Visit the Jupyter Notebook](https://mybinder.org/v2/git/https%3A%2F%2Fgitlab.une.edu.au%2Fmwelch8%2Fcosc102/master?filepath=topic_42%2FRegressionMLP.ipynb)
* This week, we covered Multi Layeyed Perceptron Regression
* If you have any questions, ask away on SLACK.
* Thanks for watching! 
* Happy coding!




