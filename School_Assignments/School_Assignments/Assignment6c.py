#start game
import random
Draws=0
Wins=0
Losses=0
count=0
repeat=1
number1=1

start=input('WELCOME TO ROCK PAPER SCISSORS LIZARD SPOCK\n\nTHE RULES ARE ROCK BEATS PAPER AND LIZARD\nPAPER BEATS ROCK AND SPOCK\nSCISSORS BEATS PAPER AND LIZARD\nLIZARD BEATSSPOCK AND PAPER\nSPOCK BEATS SCISSORS AND ROCK\nTHE COMPUTER  PICKS RANDOMLY\n\nPRESS ENTER TO CONTINUE')

def Compair_T(a,b,Draws):
    if (a==b):
        #num (a) you type in
        print('Draw')
        Draws=Draws+1
    return Draws
def Compair_W(a,b,c,d,Wins):
    if(a==b and c==d):
        print('You win')
        Wins=Wins+1
    return Wins
def Compair_L(a,b,c,d,Losses):
    if(a==b and c==d):
        print('You lose')
        Losses=Losses+1
    return Losses
while(repeat==1):
    

    num1=int(input('\n1=ROCK, 2=PAPER, 3=SCISSORS, 4=LIZARD OR 5=SPOCK?'))

    number=random.randint(1,5)

    if(number==1):
        number1=('Rock')
    elif(number==2):
        number1=('Paper')
    elif(number==3):
        number1=('Scissors')
    elif(number==4):
        number1=('Lizard')
    elif(number==5):
        number1=('Spock')
    
    if(num1==1):
        user=('Rock')
    elif(num1==2):
        user=('Paper')
    elif(num1==3):
        user=('Scissors')
    elif(num1==4):
        user=('Lizard')
    elif(num1==5):
        user=('Spock')

    print('You picked',user,'And the computer picked',number1)
    Draws=Compair_T(num1,number,Draws)
    count=count+1

    
    Losses=Compair_L(num1,1,number,2,Losses) 
    Losses=Compair_L(num1,1,number,5,Losses)

    Losses=Compair_L(num1,2,number,3,Losses)
    Losses=Compair_L(num1,2,number,4,Losses)

    Losses=Compair_L(num1,3,number,5,Losses)
    Losses=Compair_L(num1,3,number,1,Losses)

    Losses=Compair_L(num1,4,number,1,Losses)
    Losses=Compair_L(num1,4,number,3,Losses)
    
    Losses=Compair_L(num1,5,number,4,Losses)
    Losses=Compair_L(num1,5,number,2,Losses)

    
    Wins=Compair_W(num1,1,number,3,Wins) 
    Wins=Compair_W(num1,1,number,4,Wins)

    Wins=Compair_W(num1,2,number,5,Wins)
    Wins=Compair_W(num1,2,number,1,Wins)

    Wins=Compair_W(num1,3,number,2,Wins)
    Wins=Compair_W(num1,3,number,4,Wins)

    Wins=Compair_W(num1,4,number,5,Wins)
    Wins=Compair_W(num1,4,number,2,Wins)

    Wins=Compair_W(num1,5,number,3,Wins)
    Wins=Compair_W(num1,5,number,1,Wins)

    repeat=int(input('\nContinue? (1=yes) (2=no)'))

print('\nYou played',count,'times')
print('You drew',Draws,'Times, You won',Wins,'Times, And You lost',Losses)
