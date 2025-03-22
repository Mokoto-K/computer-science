# -*- coding: utf-8 -*-
"""
Created on Fri Sep  4 12:47:10 2020

@author: mwelch8
"""

from sklearn.model_selection import cross_val_score
from sklearn.datasets import load_wine
from sklearn.ensemble import (RandomForestClassifier,AdaBoostClassifier)
import matplotlib.pyplot as plt
import numpy as np
from statistics import mean

# import some data to play with - the iris dataset
wine_data = load_wine()
X = wine_data.data
y = wine_data.target


cros_val_scores = [];
best_score = 0;
best_learners = 1

for weak_learners in range(1,100):

    rf_clf = RandomForestClassifier(n_estimators=weak_learners)
    rf_scores = cross_val_score(rf_clf, X, y, cv=3)
    cros_val_scores.append(mean(rf_scores))
    if mean(rf_scores) > best_score:
        best_score = mean(rf_scores)
        best_learners = weak_learners
    
fig,ax = plt.subplots()
ax.plot(cros_val_scores)    
ax.set_ylim(0.5,1)    
ax.set_title('Mean Cross Validation Score')
ax.set_xlabel('Learners')
ax.set_ylabel('Mean Score')
   
rf_clf = RandomForestClassifier(n_estimators=best_learners)
rf_clf.fit(X, y)
importances = rf_clf.feature_importances_

fig,ax = plt.subplots(figsize=(10,6))
ax.bar(np.arange(len(importances)),importances, align="center")
ax.set_xticks(np.arange(len(importances)))
ax.set_xticklabels(wine_data.feature_names)
labels = ax.get_xticklabels()
plt.setp(labels, rotation=45, horizontalalignment='right')
ax.set_title('Feature Importance')
