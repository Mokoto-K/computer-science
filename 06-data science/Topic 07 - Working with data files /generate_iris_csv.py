# -*- coding: utf-8 -*-
"""
Created on Fri Jun 26 13:22:23 2020

@author: mwelch8
"""

import csv
from sklearn import datasets

# import some data to play with - the iris dataset
iris = datasets.load_iris()

# Open a connection to the file
with open('iris.csv', 'w', newline='') as f:
    writer = csv.writer(f)
    
    #Write the header row - we get this from the iris.feature_names
    writer.writerow(iris.feature_names)
    
    #Write the data - we get this from iris.data
    writer.writerows(iris.data)


# The data will be stored in iris.csv
