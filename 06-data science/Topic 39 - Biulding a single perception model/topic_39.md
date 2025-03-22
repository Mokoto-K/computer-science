
class: bottom, left
background-image: url(assets/g.png)

<h2 class="title_headings_sml">COSC102 - Data Science Studio 1</h2>

<h1 class="title_headings_sml"> Building a single perceptron model
</h1>

<h3 class="title_headings_sml"> Andreas Shepley, PhD Candidate </h3>

---

## In this Video...

* We'll be looking at:
* Implementing a single layer Perceptron model
* Applying it to a real life dataset.
* Evaluating the model.
*  [Here is the link to the Jupyter Notebook we'll be using in this video](https://mybinder.org/v2/git/https%3A%2F%2Fgitlab.une.edu.au%2Fmwelch8%2Fcosc102/master?filepath=topic_38%2FPerceptron.ipynb)
---

## Perceptron Recap
* A Perceptron is made up of TLU neurons
* TLUs take numerical input, multiply the inputs by weights, then sum the weighted inputs.
* TLUs then pass the sum through a step function, which returns binary output (either 0 or 1)
.center[![Python Reserved Keywords](assets/topic_37/neuron.PNG)]
---

## Limitations of the Perceptron
* The Perceptron is not good for solving non-linearly seperable problems
* A small change in the weights within a TLU can cause its output to flip from 0 to 1 or 1 to 0.
* Perceptrons cannot solve XOR problems - multilayer perceptrons can though!
---

## Alternative to the TLU: The Sigmoid Neuron
* Similar to the TLU, but it doesn't use the step function
* Instead it uses the Sigmoid function. This means the output will be a float value between 0 and 1
* Small changes in the weights will cause small changes in the output meaning we don't have flipping!
---

## And we're done!
*  [Visit the Jupyter Notebook](https://mybinder.org/v2/git/https%3A%2F%2Fgitlab.une.edu.au%2Fmwelch8%2Fcosc102/master?filepath=topic_38%2FPerceptron.ipynb)
* This week, we only covered the theoretical basics of deep learning and the Perceptron. There is no Jupyter Notebook.
* In the next topic, we'll be looking at back propogation!
* Later, we'll be implementing a multi-layered perceptron.
* Thanks for watching! If you have any questions, ask away on SLACK.
* Happy coding!




