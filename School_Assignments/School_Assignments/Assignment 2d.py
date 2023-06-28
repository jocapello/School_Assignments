import math
#ask user for 3 numbers
a=int(input('type in a'))
b=int(input('type in b'))
c=int(input('type in c'))
#Numbers for the equation
x1=(-b+math.sqrt(b**2-4*a*c))/(2*a)
print('the x1 is',x1)
x2=(-b-math.sqrt(b**2-4*a*c))/(2*a)
print('the x2 is', x2)
