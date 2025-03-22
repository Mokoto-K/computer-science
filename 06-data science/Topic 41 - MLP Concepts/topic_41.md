
class: bottom, left
background-image: url(assets/g.png)

<h2 class="title_headings_sml">COSC102 - Data Science Studio 1</h2>

<h1 class="title_headings_sml"> MLP Concepts
</h1>

<h3 class="title_headings_sml"> Andreas Shepley, PhD Candidate </h3>

---

## In this Video...

* We'll be looking at:
* Classification and Regression MLPs
* Multi-label Classification
* Loss functions
* Building an End-to-end Classification MLP
* [Here is the link to the Jupyter Notebook we'll be using in this video](https://mybinder.org/v2/git/https%3A%2F%2Fgitlab.une.edu.au%2Fmwelch8%2Fcosc102/master?filepath=topic_41%2FMulti-Layered_Perceptron.ipynb)
---

## MLP Recap
* MLPs are trained using backpropagation
* They are deep neural networks, which means they have many layers
* They use activation functions such as sigmoid, ReLU, softmax or TanH 
---

## Classification MLP
* For binary classsification, only one output neuron is required
* If you use the sigmoid function, it will return a value between 0 and 1, which can be interpreted using a threshold
* For example, if you train an MLP to determine whether mushrooms are poisonous or not, it might return a value of 0.856 for a given mushroom, meaning it is 85.6% likely to be poisonous, and 14.4% likely to be edible (1-0.856=0.144)
---

## Multilabel Classification
* For multilabel binary classification, you need one output neuron per label/positive class
* For example, if you are predicting the colour of a mushroom and you have 10 possible outcomes, e.g. brown=n, buff=b, cinnamon=c, gray=g, green=r, pink=p, purple=u, red=e, white=w, yellow=y you will need 10 output neurons
.center[![Python Reserved Keywords](assets/topic_40/spore.PNG)]
---

## Multilabel Classification cont...
* If you use the sigmoid activation function, the sum of the output values won't necessarily add to make 1, which is fine if your classes are not mutually exclusive
* For example, you can have a brown and red mushroom, then you might want the output to tell you it is both 90% red and 85% brown
* The sigmoid activation function allows you to have multiple labels per instance, e.g. brown and red mushroom
---

## Multilabel Classification cont...
* However, if each mushroom can only have one color, then you need one output neuron per colour, but the sum of all the outputs must be 1
* In such a case, you should use the softmax activation function because it ensures the sum of all the output neurons is equal to 1
* Softmax forces you to choose only one label, e.g. red mushroom
* Softmax is used extensively in multi-class classification
---

## Loss Function for Classification MLPs
* Usually a cross-entropy loss is used for classification MLPs because we are calculating probability distributions
* The cross-entropy loss, also known as the log loss, measures the performance of a classification model which has output values made up of probability scores between 0 and 1.
* As the probability of the correct label decreases during the prediction stage, the cross-entropy loss increases, to force covergence with the target label.
---


## And we're done!
* [Here is the link to the Jupyter Notebook we'll be using in this video](https://mybinder.org/v2/git/https%3A%2F%2Fgitlab.une.edu.au%2Fmwelch8%2Fcosc102/master?filepath=topic_41%2FMulti-Layered_Perceptron.ipynb)
* In the next topic, we'll be implementing a regression MLP!
* Thanks for watching! If you have any questions, ask away on SLACK.
* Happy coding!




