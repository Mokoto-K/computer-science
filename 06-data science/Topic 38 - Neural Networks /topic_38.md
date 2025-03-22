
class: bottom, left
background-image: url(assets/g.png)

<h2 class="title_headings_sml">COSC102 - Data Science Studio 1</h2>

<h1 class="title_headings_sml"> Neural Networks
</h1>

<h3 class="title_headings_sml"> Andreas Shepley, PhD Candidate </h3>

---

## In this Video...

* We'll be looking at:
* What is Artificial Intelligence?
* What is a Neural Network?
---

### What is Artificial Intelligence?
* Artificial Intelligence (AI) was born in the 1950s, in an effort to automate tasks usually performed by humans
* From intelligent targeted marketing to Google Home, AI is finding its place in our everyday lives, and has the potential to revolutionise our world. But what is it?
* AI encompasses both Machine Learning (which you have studied already) and deep learning (more on that later!)
* Try to model the human brain to solve complex problems like face recognition
---

## What is Deep Learning?
* Deep learning is a special type of machine learning
* Deep learning involves combining layers of representations
* Deep learning models are hierarchical - earlier layers consist of basic representations, while later layers are complex representations
.center[![Python Reserved Keywords](assets/topic_37/neuron.PNG)]
* These layers of representations are learned using models called neural networks
---

## What are Artificial Neural Networks?
* Artificial Neural Networks (ANNs) are networks of artificial neurons
* Artificial neurons are digital structures that take one or more binary inputs, and return one binary output. If one or more of its inputs are positive, the output will also be positive.
* Think of it like an on/off switch. If a given number of inputs are on, the output will return on. Else, it will return off.
* ANNs are somewhat inspired from the human brain, but are not models of the brain
---
.center[![Python Reserved Keywords](assets/topic_37/neuron2.PNG)]
---
## The Perceptron
* The Perceptron is a special kind of ANN, based on a modified artificial neuron, called a Threshold Logic Unit (TLU)
* Instead of having binary inputs, the TLU inputs are numbers, and each number has an associated weight
* The TLU multiplies each input with its associated weight, then sums all the weights
* It then applies a step function (a type of activation function), before returning its output
---

## The Perceptron
.center[![Python Reserved Keywords](assets/topic_37/TLU.PNG)]
---

## The Perceptron cont....
* A step function is a function that switches sharply from one value to another.
* The Heaviside step function is often used with the Perceptron. If the input is less than 0, the output will be zero. Otherwise, the output will be 1.
* Other step functions such as the Sign step function can also be used.
---

## The Perceptron: The Step Function
.center[![Python Reserved Keywords](assets/topic_37/heaviside.png)]
---

## The Perceptron cont....
* A single TLU can be used for binary classification.
* A Perceptron is just a layer of TLUs.
* The layer is dense, or fully connected, because each TLU is connected to all the inputs (the input layer).
* Training a TLU involves finding the right values for the weights associated with each input value.  
---

## The Perceptron cont....
* Perceptron training is inspired by Hebbian Learning
* Hebbian learning is based on the idea that when a neuron triggers another neuron, the weight connection between them increases
* Perceptrons are trained using a variant of Hebbian learning that uses the errors made by the network during prediction to improve the model
* It does this by reinforcing the connection weights that minimise error
* In multi-layered networks (which we'll cover later this week), learning is the process of finding the best values for all the weights of all the layers in the neural networks, so that it will correctly map inputs to targets
---

## The Perceptron cont....
* The Perceptron Convergence Theorem states that if a problem is linearly seperable, the Perceptron can find a solution
* This is because the decision boundary of each output neuron is linear.
* This means the Perceptron can't learn complex patterns.
---

## And we're done!
* This week, we only covered the theoretical basics of deep learning and the Perceptron. There is no Jupyter Notebook.
* In the next topic, we'll be looking at how to implement a simple Perceptron model.
* Later, we'll be implementing a multi-layered Perceptron, and learning about backpropagation!
* Thanks for watching! If you have any questions, ask away on SLACK.
* Happy coding!




