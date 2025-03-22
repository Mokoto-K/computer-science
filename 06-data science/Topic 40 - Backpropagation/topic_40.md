
class: bottom, left
background-image: url(assets/g.png)

<h2 class="title_headings_sml">COSC102 - Data Science Studio 1</h2>

<h1 class="title_headings_sml"> Backpropagation
</h1>

<h3 class="title_headings_sml"> Andreas Shepley, PhD Candidate </h3>

---

## In this Video...

* We'll be looking at:
* What is a Multi-Layered Perceptron
* What is backpropagation?
* What is a loss function?
* What are activation functions?
---

## Deep learning: The Multi-Layered Perceptron
* In the last 2 lessons we looked at the Perceptron, which is a model made of a single layer of neurons
* As we move forward, we'll be looking at deeper networks, those with more than one layer
* Before we do that, we need to learn about the backpropagation algorithm, which is used to train deep neural networks
---

## Deep learning: The Multi-Layered Perceptron cont...
* The MLP is made up of 1 input layer, 1 or more hidden layers, and 1 output layer
* MLPs are deep neural networks (DNN) or deep learning models because they contain a collection of hidden layers, between the input and output layers
.center[![Python Reserved Keywords](assets/topic_40/mlp.PNG)]
---

## Deep learning: The Multi-Layered Perceptron cont...
* The MLP is fully connected
* Layers nearest to the input layer are called lower layers, while layers nearest to the output layer are called upper layers
* It is a feedforward network, which means neurons only fire in one direction, from layer to layer until they reach the output layer.
---

## Deep learning: The Multi-Layered Perceptron cont...
* Before training, all weights in the hidden layers are randomly initialised
* The MLP is trained using the backpropagation algorithm
* The goal of backpropagation is to find the best weights for all the layers
---

## Logical Problem
* To better understand, let's consider the x AND y logical problem. For x AND y to be 1, both x and y must be 1, otherwise, it is 0
.center[![Python Reserved Keywords](assets/topic_40/xandy.jpg)]
---

## Logical Problem
* When we pass training data through an MLP, we might end up with incorrect predictions. This is because we cannot know the weights in advance, we have to randomly initialise them.
.center[![Python Reserved Keywords](assets/topic_40/target.jpg)]
---

## Logical Problem
* We can fix this by updating the weights. To do this, we first calculate the error...
.center[![Python Reserved Keywords](assets/topic_40/errorcalc.jpg)]
---

## Logical Problem
* Once we know the error, we can change the weights. We continue to do this until the error = 0.
.center[![Python Reserved Keywords](assets/topic_40/error.jpg)]
---

## The loss function
* Another way of calculating the error is to use a loss function such as mean squared error
* C(w) is the loss function, where f(x) is our target output and y is the predicted output
* If C(w) is large, it means the MLP is making a lot of mistakes
* If C(w) is small, our MLP is working quite well.
.center[![Python Reserved Keywords](assets/topic_40/lossfunction.PNG)]
---

## The Backpropagation Algorithm
* The MLP is trained using the backpropagation algorithm to update weights
* Backpropagation calculates the network error using one forward and one bacward pass through the network
* Once it knows the error, it uses gradient descent to change the weights to reduce the error
* This process is repeated until the loss is minimised and a solution is reached
---

## Gradient Descent Visualised!
.center[![Python Reserved Keywords](assets/topic_40/graddescent.PNG)]
---

## Summary of the Learning Process
* The training dataset is broken into small batches, called mini-batches
* Each mini-batch of data (subset of training set) is passed through the network separately
* Forward pass: It is first passed through the input layer, then to the first hidden layer, then onwards throgh the network until it reaches the output layer. 
.center[![Python Reserved Keywords](assets/topic_40/backprop.PNG)]
---

## Summary of the Learning Process cont...
* Loss function: The network uses a loss function such as mean squared error to compute the output error by comparing the actual prediction to the desired prediction
* Backward Pass: The Chain Rule is then used to determine which weights contributed the most to the error. It works backwards, applying the chain rule to each layer
* Gradient Descent: all the weights are then modified according to their contribution to the error using the partial derivative of the loss function.
---

## Activation Functions: Why Not Use a Step Function?
* The MLP uses a sigmoid, or logistic activation function instead of a step function
* If the step function was retained, backpropagation wouldn't work because the step function is linear and horizontal, meaning its gradient is 0
* In contrast, the sigmoid function is curved, meaning its gradient will be a variable, non-zero value
* This means the gradient can be minimised to 0 by moving down the curve - this is gradient descent (loss of 0 means that the network isn't making any mistakes)
---

## Activation Functions cont...
* Activation functions are really important because they make DNNs non-linear allowing them to solve complex probelms
* Backpropagation can also be used with other activation functions including:
 * Tanh which is a continuous differentiable S shaped function with output ranging from -1 to 1
 * ReLU (Rectified Linear Unit) function (default activation function used in MLPs)
---

## And we're done!
* In the next topic, Classification and Regression MLPs
* Multi-label Classification
* Building an End-to-end Classification MLP
* Thanks for watching! If you have any questions, ask away on SLACK.
* Happy coding!




