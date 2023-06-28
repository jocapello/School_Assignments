
def add(c,h,n,o,s):
    answer=(c*12.011)+(h*1.00794)+(n*14.00674)+(o*15.9994)+(s*32.066)
    return answer

c=int(input('What is the number of atoms OF Carbon?'))
h=int(input('What is the number of atoms OF HYDROGEN?'))
n=int(input('What is the number of atoms OF NITROGEN?'))
o=int(input('What is the number of atoms OF OXYGEN?'))
s=int(input('What is the number of atoms OF SULFER?'))

answer=0
answer=add(c,h,n,o,s)

print('The answer is', answer)
