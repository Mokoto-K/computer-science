# -*- coding: utf-8 -*-
"""
Created on Wed Aug  5 11:43:20 2020

Decision Tree Regularisation Demo

@author: mwelch8
"""

import numpy as np
import matplotlib.pyplot as plt

from sklearn.datasets import *
from sklearn.tree import DecisionTreeClassifier, plot_tree
from sklearn.model_selection import train_test_split
from sklearn.model_selection import cross_val_predict

from sklearn.metrics import confusion_matrix
from sklearn.metrics import recall_score
from sklearn.metrics import precision_score
from sklearn.metrics import f1_score
from sklearn.metrics import roc_curve, auc
from sklearn.metrics import plot_confusion_matrix
from sklearn.preprocessing import label_binarize
from dtreeviz.trees import *

# Load the cancer dataset
data_set = load_breast_cancer()
X = data_set.data
y = data_set.target
nclasses = len(data_set.target_names)

# Split the data into a training set and a test set
X_train, X_test, y_train, y_test = train_test_split(X, y)


# Store the performance metrics for the cross validation
best_max_depth = 1
best_mean_f1 = 0
f1_set = np.zeros(20)
max_depth_range = range(1,20)

# Here we will do a search to regularise the max_depth hyperparameter
for max_depth_val in range(1,20):
    
    # Train
    clf = DecisionTreeClassifier(max_depth=max_depth_val).fit(X_train, y_train)
    # Return the predictions for the 5-Fold crossvalidation
    y_predicted = cross_val_predict(clf, X_train,y_train, cv=5)
    
    # Print out the recall, precision and F1 scores
    # There will be a value for each class
    # CV Train
    print("CV recall:",max_depth_val," - ", recall_score(y_train,y_predicted,average=None))
    print("CV precision:",max_depth_val," - ",precision_score(y_train,y_predicted,average=None))
    print("CV f1:",max_depth_val," - ",f1_score(y_train,y_predicted,average=None))
    print("\n")
    
    # Store the mean f1 score for each test to plot later - this is just for show
    f1_set[max_depth_val] = np.mean(f1_score(y_train,y_predicted,average=None))
    current_f1 = np.mean(f1_score(y_train,y_predicted,average=None))
    # Test to see if this is the best cross validation
    if current_f1 > best_mean_f1:
        best_max_depth = max_depth_val
        best_mean_f1 = current_f1
        best_clf = clf

# Plot the F1 Score for each max_depth test    
fig, ax = plt.subplots(figsize = (10,10))
ax.plot(max_depth_range,f1_set[1:20])
ax.set_xticks(max_depth_range)
ax.set_title("F1 Score by max_depth")



y_test_predicted = best_clf.predict(X_test)

# Plot a fancy confusion matrix
fig, ax = plt.subplots()
disp = plot_confusion_matrix(best_clf, X_test, y_test,
                                 display_labels=data_set.target_names,
                                 cmap=plt.cm.Blues,ax=ax)
ax.set_title('Testing')

# Test
print("Test:",recall_score(y_test,y_test_predicted,average=None))
print("Test:",precision_score(y_test,y_test_predicted,average=None))
print("Test:",f1_score(y_test,y_test_predicted,average=None))         

y_score = best_clf.predict_proba(X_test)
# We need to format the y_test into a n_samples x 2 binary array
# that indicates class membership
#y_test_bin = label_binarize(y, classes=[0, 1])
fpr = dict()
tpr = dict()
roc_auc = dict()
fpr, tpr, _ = roc_curve(y_test, y_score[:,1])
roc_auc = auc(fpr, tpr)

# Plot the TPR vs FPR for each class
fig, ax = plt.subplots(figsize=(8,8))
ax.plot(fpr, tpr, color='orange')
ax.plot([0, 1], [0, 1], 'k--')
ax.set_xlim([0.0, 1.0])
ax.set_ylim([0.0, 1.05])
ax.set_xlabel('False Positive Rate')
ax.set_ylabel('True Positive Rate')
ax.set_title('Receiver operating characteristic Curve')
ax.legend(loc="lower right")

# Visualise the best classifier using dtreeviz
viz = dtreeviz(best_clf, 
     X, 
     y,
     target_name='Outcome',
    feature_names=data_set.feature_names, 
     class_names=["malignant", "benign"]  # need class_names for classifier
    )  
              
viz.view() 