#A list with items
myWords = [ ] 
repeat=1


while repeat==1:
    word=input ('Type in a word')   #type in the word
    myWords.append(word)	#add the word to the list
    repeat=int(input('Continue?(1=yes)(2=no)'))


    myWords.sort() 
for i in range(len(myWords)):
    print (myWords[i])
        
