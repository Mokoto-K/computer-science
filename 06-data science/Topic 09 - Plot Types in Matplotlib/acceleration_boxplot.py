# -*- coding: utf-8 -*-
"""
Created on Tue Jun 30 14:27:37 2020

@author: mwelch8
"""

# -*- coding: utf-8 -*-
"""
Created on Tue Jun 30 12:27:23 2020

@author: mwelch8
"""

#Import the data from the dataset.csv

import csv
import matplotlib.pyplot as plt
import numpy as np

# The segment that we want to analyse 
# Try changing this to 1000, 1850 to view a single 'cycle'
segment_to_view_start = 1000
segment_to_view_end = 1850

# Create empty 3D np.arrays to store the accelerometer and gyroscope data 
ax_set = np.empty((0,3), float)
gx_set = np.empty((0,3), float)


# Read the data line-by-line into the 3D arrays
with open('imu_dataset.csv', newline='') as f:
    reader = csv.reader(f)
    for row in reader:
        #We are only interested in the accelerometer data
        temp_Arr = np.array([float(row[1]), float(row[2]),float(row[3]),
                             float(row[4]), float(row[5]),float(row[6])])
        ax_set = np.append(ax_set,[temp_Arr[0:3]], axis = 0);
        gx_set = np.append(gx_set, [temp_Arr[3:6]], axis = 0)

num_bins = 100

fig, ax = plt.subplots()

# basic plot
ax.boxplot(ax_set[:,0])
ax.set_title('Basic Plot')

# Plot multiple series
fig, ax = plt.subplots()
ax.boxplot(ax_set)
ax.set_title('Multi Box Plot')

# Scatter
fig, ax = plt.subplots()
ax.scatter(ax_set[:,0], ax_set[:,1])
ax.set_title('Scatter Plot')

fig, ax = plt.subplots(figsize=(12, 12))
ax.set_title('Linear normalization')
ax.hist2d(ax_set[:,0], ax_set[:,1], bins=50)
