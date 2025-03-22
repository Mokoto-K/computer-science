# -*- coding: utf-8 -*-
"""
Created on Thu Jun 25 20:16:41 2020

@author: mwelch8
"""

import csv
import matplotlib.pyplot as plt
import math

x_set = []
y_set = []

with open('sheep.csv', newline='') as f:
    reader = csv.reader(f)
    for row in reader:
        print(row)
        x_set.append(float(row[0]));
        y_set.append(float(row[1]));

plt.figure(figsize=(20,10))        
plt.plot(x_set, y_set, 'r-')
plt.xlabel('x axis')
plt.ylabel('y axis')
plt.show()

sheep_speed = []
for t in range(1,len(x_set)):
    d = math.sqrt(((x_set[t-1] - x_set[t]) + (y_set[t-1] - y_set[t]))**2.0)
    # We multiply this value by 10 because the data is sampled at 10hz and we want the output to be m/sec
    d = d*10
    sheep_speed.append(d)

plt.figure(figsize=(20,10))        
plt.hist(sheep_speed, bins=200, range=[0,1])
plt.xlabel('Speed m/sec')
plt.ylabel('Count')
