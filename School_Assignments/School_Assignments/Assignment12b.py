myWords = ['python','java','c++','adobe','html','     '] 
repeat=1
right=0
lose=3
    
print('What are the most popular types of code?')

while repeat==1:

    correct=False
    removeWord=-1
    guess=input('Type in a guess')
    for i in range(len(myWords)-1):

        if guess==myWords[i]:
            correct=True
            print(guess,'Is correct')
            removeWord=i
            right=right+1
    if removeWord>-1:
            myWords.pop(removeWord)
            print('You answered correctly')

    if(correct==False):
        lose=lose-1
        print('You answered wrong')
    if(right==5):
        print('You are a fortnite god!')
        repeat=12012043
    if(lose==0):
        print('You such a yuval')
        repeat=12012043
