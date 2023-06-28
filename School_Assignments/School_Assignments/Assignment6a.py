
def add(num1,num2) :
    answer=num1+num2
    return answer
def multiply(num1,num2) :
    answer=num1*num2
    return answer
def subtract(num1,num2) :
    answer=num1-num2
    return answer
def divide(num1,num2) :
    answer=num1/num2
    return answer

num1=int(input('Type in a number'))
num2=int(input('Type in a second number'))
function=int(input('Type in your function, 1=add, 2=multiply, 3=subtract, 4=divide'))

if(function==1):
    answer=add(num1,num2)
elif(function==2):
    answer=multiply(num1,num2)
elif(function==3):
    answer=subtract(num1,num2)
elif(function==4):
    answer=divide(num1,num2)

print('The answer is', answer)
