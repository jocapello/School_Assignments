import random 
total=0
con=True
count=0
while(con==True):

    
    number=random.randint(1,11)
    print('your number is', number)
    total=total+number
    repeat=int(input('Continue?(1=yes)(2=no)'))
    print('your sum is',total)
    
    if(total>21):
        con=False
    
    count=count+1
    if(repeat!=1):
        con=False
    
   
print('you used the program',count,'times')

#++ equal != doesnt equal

