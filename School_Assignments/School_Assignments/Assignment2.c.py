#ask for 5 numbers

import math

num1=int(input('type in a number'))
num2=int(input('type in a second number'))
num3=int(input('type in a third number'))
num4=int(input('type in a  fourth number'))
num5=int(input('type in a fifth number'))

#calculate the mean, difference,

mean= (num1+num2+num3+num4+num5)/5

differencefrommean1 = num1 - mean
differencefrommean2 = num2 - mean
differencefrommean3 = num3 - mean
differencefrommean4 = num4 - mean
differencefrommean5 = num5 -mean

squareofdifference1 = differencefrommean1 * differencefrommean1
squareofdifference2 = differencefrommean2 * differencefrommean2
squareofdifference3 = differencefrommean3 * differencefrommean3
squareofdifference4 = differencefrommean4 * differencefrommean4
squareofdifference5 = differencefrommean5 * differencefrommean5

average=(squareofdifference1+squareofdifference2+squareofdifference3+squareofdifference4+squareofdifference5)/5

standarddeviation=math.sqrt(average)

#calculate the mean

print('the mean is',mean)

print('the difference from mean 1 is',differencefrommean1)
print('the difference from mean 2 is',differencefrommean2)
print('the difference from mean 3 is',differencefrommean3)
print('the difference from mean 4 is',differencefrommean4)
print('the difference from mean 5 is',differencefrommean5)

print('The sqaure of difference 1 is',squareofdifference1)
print('The sqaure of difference 2 is',squareofdifference2)
print('The sqaure of difference 3 is',squareofdifference3)
print('The sqaure of difference 4 is',squareofdifference4)
print('The sqaure of difference 5 is',squareofdifference5)

print('the average is',average)

print('the standard deviation is',standarddeviation)

