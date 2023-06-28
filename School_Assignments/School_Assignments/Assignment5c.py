import random
count=0
num1=0
number=random.randint(1,100)
         
while(num1!=number):

    num1=int(input('type in a number'))
               
    if(num1<number):
        print('The number is higher')
    elif(num1>number):
        print('The number is lower')
    elif(num1==number):
        print('You win') 
    count=count+1
    repeat=('Guess again')
    
print('you guesses', count, 'times')
