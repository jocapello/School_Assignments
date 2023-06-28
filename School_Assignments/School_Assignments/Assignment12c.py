alphabet=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
print ('Original alphabet')
for i in range (26):
    print (alphabet[i], end=' ')
print ()
print ('Alphabet shifted 1 to the right')
for i in range (26):
    letter=alphabet[i]
    number=ord(letter)
    number=number+1
    if number>=123:
        number=number-26
    alphabet[i]=chr(number)
    print (alphabet[i], end=' ')
print ()
for i in range (26):
    letter=alphabet[i]
    number=ord(letter)
    number=number-2
    if number<=96:
        number=number+26
    alphabet[i]=chr(number)
    print (alphabet[i], end=' ')
print ()
