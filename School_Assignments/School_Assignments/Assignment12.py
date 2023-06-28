#A list with items
myWords = [ 'ant','goat','elephant','tiger','skunk'] 
repeat=1
ant=0
goat=0
elephant=0
skunk=0
tiger=0

while repeat==1:
    word=input ('Type in a word')   #type in the word
   	#add the word to the list

    myWords = [ 'ant','goat','elephant','tiger','skunk']
    guess=input('type in a guess')
    removeWord=-1
    repeat=int(input('Would you like another word ? 1=yes'))   #check if user wants another word
    for i in range(len(myWords)):
        if guess==myWords[i]:
            print (guess,' is correct')
            removeWord=i
    if removeWord>-1:
        myWords.pop(removeWord)

    print ('To show you that the word was removed:')
    for i in range(len(myWords)):
        print (myWords[i])
        

#type in a guess   tiger
#tiger  is correct
#To show you that the word was removed:
#ant
#goat
#elephant
#skunk
