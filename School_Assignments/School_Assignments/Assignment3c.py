start=int(input('Type in a starting number'))
difference=int(input('Type in the difference'))
total=int(input('Type in total'))         

mySum=0
number=start

for i in range(total):
    mySum=mySum+number
    number=number+difference
print("the sum is",mySum)
