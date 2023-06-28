alphabet=['t','f','d','g','l','k','v','i',' ','j','t','z','v','e','t','v',' ','z','j',' ','e','f',' ','d','f','i','v',' ','r','s','f','l','k',' ','t','f','d','g','l','k','v','i','j',' ','k','y','r','e',' ','r','j','k','i','f','e','f','d','p',' ','z','j',' ','r','s','f','l','k',' ','k','v','c','v','j','t','f','g','v','j']
print ('Original alphabet')
for i in range (78):
    print (alphabet[i], end=' ')
print ()
print ('Alphabet shifted 1 to the right')
for i in range (78):
    letter=alphabet[i]
    number=ord(letter)
    number=number+9
    if number>=123:
        number=number-26
    alphabet[i]=chr(number)
    print (alphabet[i], end=' ')
print ()
