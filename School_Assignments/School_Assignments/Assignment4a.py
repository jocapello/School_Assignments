total=0
con=True
count=0
while(con==True):
    
    num1=int(input('type in a number'))
    total=total+num1
    repeat=int(input('Continue?(1=yes)(2=no)'))
    count=count+1
    if(repeat!=1):
        con=False
    
print('your number is',total)
print('you used the program',count,'times')

#++ equal != doesnt equal

