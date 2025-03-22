class: bottom, left
background-image: url(assets/g.png)

<h2 class="title_headings_sml">COSC102 - Data Science Studio 1</h2>

<h1 class="title_headings_sml"> Topic 36 - Affinity Propagation Clustering</h1>

<h3 class="title_headings_sml"> Dr. Farshid Hajati </h3>

---

## Reading

* [Scikit-Learn Affinity Propagation Documentation](https://scikit-learn.org/stable/modules/clustering.html#affinity-propagation)


---

## Summary

* Basic Concepts
* Algorithm Example

---

## Basic Concepts

* AffinityPropagation creates clusters by sending messages between pairs of data-points until convergence.
* Each data point sends messages to all other points informing its targets of each target’s relative *attractiveness* to the sender.
* Each target then responds to all senders with a reply informing each sender of its availability to *associate* with the sender, given the *attractiveness* of the messages that it has received from all other senders.
* This process is repeated iteratively as each data-point learns the attractiveness of all other points.

---

## Basic Concepts

* The algorithm proceeds by alternating between two message-passing steps, which update two matrices:
  * The **responsibility** matrix $R$ has values $r(i, k)$ that quantify how well-suited $x_k$ is to serve as the exemplar for $x_i$, relative to other candidate exemplars for $x_i$.
  * The **availability** matrix $A$ contains values $a(i, k)$ that represent how "appropriate" it would be for $x_i$ to pick $x_k$ as its exemplar, taking into account other points' preference for $x_k$ as an exemplar.


---

## Basic Concepts

* Affinity Propagation is interesting as it chooses the number of clusters based on the data provided.
* Other algorithms (e.g. K-Means requires the specification of the number of clusters)
* Instead it has two parameters:
  * The *preference* controls how many samples are used in the process.
  * The *damping factor* which damps the messages to avoid endless oscillations.
* The algorithm has a time complexity of the order $O(N^2T)$, where $N$  is the number of samples and $T$ is the number of iterations until convergence.

---

## Algorithm Example

* First we need a very simple data set.

.center[![center-aligned](assets/topic_36/data.png)]


---

## Algorithm Example

* The first step in the process involves calculating a *similarity matrix* (denoted as $s$).
* This is a matrix that contains a measure of difference between each data point.
  * In this example we will use the **negation of the sum-of-squares** as the similarity measure.
* For example, the similarity measure between Alice and Doug:
  
$(3-1)^2 + (4-1)^2 + (3-3)^2 + (2-2)^2 + (1-3)^2 \\
  = 4 + 9 + 0 + 0 + 4 \\
  = 17$
* When we negate this, we get -17

---
## Algorithm Example

* The '0' values on the diagonal hve been updated with the minimum value from the non-diagonal cells.

.center[![center-aligned](assets/topic_36/similarity.png)]

---

## Algorithm Example

*  Once we have the similarity matrix, we can calculate the *Responsibility* and *Availability* matrices.
*  Both of these are *n x n* matrices (where n is the number of data points) similar to the similarity matrix. 
*  Initially, the availability matrix, $a$, only contains 0s.
*  The responsibility matrix $r$ is then calculated according to the formula:

$$ r(i,k) \leftarrow s(i,k) - max \\{ a(i,k') + s(i,k') \\},$$

where $i$ refers to the row and $k$ column 

---

## Algorithm Example

* For example, lets calculate the link/edge between Cary (row) and George (column):
$$ -18 - (-6) = -12 $$

* This is (-18) minus the maximum of the remaining similarities on Cary's row (-6). 


---

## Algorithm Example

* Our resulting responsibility matrix.

.center[![center-aligned](assets/topic_36/responsibility_matrix.png)]

---

## Algorithm Example

* Now we calculate the next step for the availability matrix.
* For the elements on the diagonal the calculation is:

$$ a(k,k) \leftarrow \sum _{i'\ such \ that \ i' \neq k} max\\{ 0, r(i' , k)\\},$$

where ii refers to the row and kk column
* The equation is telling you to sum all the values above 0 along the column $k$ 
* So for Alice's self availability we have: $10+11+0+0 = 21$ 

---
## Algorithm Example

* For the off-diagonal elements: 
$$ a(i,k) \leftarrow min\\{ 0,r(k,k) + \sum_{i'\ such \ that \ i' \notin \{i,k\}} max\\{ 0, r(i',k)\\}  \\}$$
* The equation is asking you to sum all the positive responsibilities along the $k$ column excluding the element $(i,i)$ and the element $(i,k)$
* For example, lets calculte the Alice (row)/Bob(column) availability:
$$-15+0+0+0 = -15$$

---

## Algorithm Example

* Our resulting availability matrix.

.center[![center-aligned](assets/topic_36/availability.png)]

---

## Algorithm Example

* This process of updating the responsibility and availability matrices continues until a steady state is reached (i.e. there are no changes made in an iteration) 
* The final step to obtain the clustering solution involves calculating the *criterion* matrix
* This matrix is calculated by element-wise sum of the availability and responsibility matrices.

$$c(i,k) \leftarrow r(i,k) + a(i,k) $$

* The criterion value for the Bob(column) to Alice(row) element is given by $(-1) +(-15) = -16$


---

## Algorithm Example

* The criterion matrix gives us the cluster membership: The highest criterion value in each row is designated the exemplar data point.
* Rows that share the same exemplar are in the same cluster:

.center[![center-aligned](assets/topic_36/criterion.png)]

---

## Algorithm Example

* This gives us the mechanical process for implementing Affinity Propagation.
* We didn't address the two parameters - these are covered when we look at the implementation.
* You won't need to build this: there are scikit-learn functions that already have this done for you. 

---

## Summary

* Basic Concepts
* Algorithm Example

---

## Reading

* [Scikit-Learn Affinity Propagation Documentation](https://scikit-learn.org/stable/modules/clustering.html#affinity-propagation)


---