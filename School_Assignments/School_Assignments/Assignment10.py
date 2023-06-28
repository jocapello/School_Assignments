import pygame, sys, math, time, random
from pygame.locals import*
pygame.init
screen=pygame.display.set_mode((1400,1000))

Directed=pygame.image.load('Classroom.jpg').convert()
screen.blit(Directed,(0,0))
Hat1=pygame.image.load('Hat 1.png')
Hat1=pygame.transform.scale(Hat1,(150,150))
Hat2=pygame.image.load('Hat 2.png')
Hat3=pygame.image.load('Hat 3.png')
Hat4=pygame.image.load('Hat 4.png')
Hat4=pygame.transform.scale(Hat4,(100,100))
Pants1=pygame.image.load('Pants1.png')
Pants1=pygame.transform.scale(Pants1,(150,150))
Pants2=pygame.image.load('Pants2.png')
Pants2=pygame.transform.scale(Pants2,(150,150))
Pants3=pygame.image.load('Pants3.png')
Pants3=pygame.transform.scale(Pants3,(150,150))
Pants4=pygame.image.load('Pants4.png')
Pants4=pygame.transform.scale(Pants4,(150,150))
Head1=pygame.image.load('Head1.png')
Head1=pygame.transform.scale(Head1,(100,100))
Head2=pygame.image.load('Head2.png')
Head2=pygame.transform.scale(Head2,(100,100))
Head3=pygame.image.load('Head3.png')
Head3=pygame.transform.scale(Head3,(100,100))
Head4=pygame.image.load('Head4.png')
Head4=pygame.transform.scale(Head4,(100,100))
Shirt1=pygame.image.load('Shirt 1.png')
Shirt1=pygame.transform.scale(Shirt1,(150,150))
Shirt2=pygame.image.load('Shirt 2.png')
Shirt2=pygame.transform.scale(Shirt2,(150,150))
Shirt3=pygame.image.load('Shirt 3.png')
Shirt3=pygame.transform.scale(Shirt3,(150,150))
Shirt4=pygame.image.load('Shirt 4.png')
Shirt4=pygame.transform.scale(Shirt4,(150,150))
Arm1L=pygame.image.load('Arm1L.png')

Arm2L=pygame.image.load('Arm2L.png')

Arm3L=pygame.image.load('Arm3L.png')

Arm4L=pygame.image.load('Arm4L.png')

Arm1=pygame.image.load('Arm1.png')

Arm2=pygame.image.load('Arm2.png')

Arm3=pygame.image.load('Arm3.png')

Arm4=pygame.image.load('Arm4.png')


def pickHeads(x1,y1):
    r=random.randint(1,4)
    if r==1:
        screen.blit(Head1,(x1,y1+70))
    if r==2:
        screen.blit(Head2,(x1,y1+70))
    if r==3:
        screen.blit(Head3,(x1,y1+70))
    if r==4:
        screen.blit(Head4,(x1,y1+70))
def pickHats(x1,y1):
    r=random.randint(1,4)
    if r==1:
        screen.blit(Hat1,(x1-30,y1-45))
    if r==2:
        screen.blit(Hat2,(x1-30,y1-20))
    if r==3:
        screen.blit(Hat3,(x1-30,y1-105))
    if r==4:
        screen.blit(Hat4,(x1,y1))
def pickPants(x1,y1):
    r=random.randint(1,4)
    if r==1:
        screen.blit(Pants1,(x1-30,y1+250))
    if r==2:
        screen.blit(Pants2,(x1-30,y1+250))
    if r==3:
        screen.blit(Pants3,(x1-30,y1+250))
    if r==4:
        screen.blit(Pants4,(x1-30,y1+250))
def pickShirts(x1,y1):
    r=random.randint(1,4)
    if r==1:
        screen.blit(Shirt1,(x1-30,y1+140))
    if r==2:
        screen.blit(Shirt2,(x1-30,y1+140))
    if r==3:
        screen.blit(Shirt3,(x1-30,y1+140))
    if r==4:
        screen.blit(Shirt4,(x1-30,y1+140))
def pickArms(x1,y1):
    r=random.randint(1,4)
    if r==1:
        screen.blit(Arm1,(x1-70,y1+170))
    if r==2:
        screen.blit(Arm2,(x1-40,y1+180))
    if r==3:
        screen.blit(Arm3,(x1-70,y1+170))
    if r==4:
        screen.blit(Arm4,(x1-80,y1+170))
def pickArmsL(x1,y1):
    r=random.randint(1,4)
    if r==1:
        screen.blit(Arm1L,(x1+50,y1+170))
    if r==2:
        screen.blit(Arm2L,(x1+40,y1+180))
    if r==3:
        screen.blit(Arm3L,(x1+70,y1+170))
    if r==4:
        screen.blit(Arm4L,(x1+80,y1+170))
        
FPS = 30 # frames per second setting
fpsClock = pygame.time.Clock()

x1=150
y1=150
for p in range (2):
    
    for i in range(3):

        pickPants(x1,y1)
        pickShirts(x1,y1)
        pickHeads(x1,y1)
        pickHats(x1,y1)
        pickArms(x1,y1)
        pickArmsL(x1,y1)
        
        x1=x1+300
    y1=y1+250
    x1=280

for event in pygame.event.get():
    if event.type == QUIT:
        pygame.quit()
        sys.exit()
pygame.display.update()
fpsClock.tick(FPS)  
