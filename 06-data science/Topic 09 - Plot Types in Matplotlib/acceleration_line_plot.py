# -*- coding: utf-8 -*-
"""
Created on Tue Jun 30 10:45:44 2020

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


# Plot the acceleration data
fig, ax = plt.subplots(nrows=2,figsize=(30,20))
ax[0].set_title('Accelerometer Data')      
ax[0].plot(ax_set[segment_to_view_start:segment_to_view_end,0], 'r-')
ax[0].plot(ax_set[segment_to_view_start:segment_to_view_end,1], 'g-')
ax[0].plot(ax_set[segment_to_view_start:segment_to_view_end,2], 'b-')
ax[0].set_xlabel('Time')
ax[0].set_ylabel('Acceleration')

# Plot the gyroscope data
ax[1].set_title('Gyroscope Data')
ax[1].plot(gx_set[segment_to_view_start:segment_to_view_end,0], 'r-')
ax[1].plot(gx_set[segment_to_view_start:segment_to_view_end,1], 'g-')
ax[1].plot(gx_set[segment_to_view_start:segment_to_view_end,2], 'b-')
ax[1].set_xlabel('Time')
ax[1].set_ylabel('Angle')




