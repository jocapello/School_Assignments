import pygame, sys, random,math, time
from pygame.locals import * 
pygame.init
screen = pygame.display.set_mode((1200, 700), 0, 32)

titlepage=pygame.image.load('Apples.jpg')
Rules=pygame.image.load('Apples.png')
Orchard=pygame.image.load('Bakground.jpg')
Bird=pygame.image.load('Evil birdy.png')
Red=pygame.image.load('Apple thing.png')
Green=pygame.image.load('Granny smith.png')
Yellow=pygame.image.load('Secret pepper (Shh!!!) .png')
Jon=pygame.image.load('tourist.png')
Gameover=pygame.image.load('Gameover.png')
Life=pygame.image.load('Heart.png')
Explode=pygame.image.load('Explode.png')
points=0
x=100
y=0
Lifex=600
Lifey=550
explosion=0

#Colours
GREEN=(89,179,60)
RED=(217,21,27)
BLUE=(30,20,218)
YELLOW=(206,198,32)

scene=0
direction='right'
DIRECTION=0
point=0
Applex=[100]
Appley=[100]
r=random.randint(1,6)
Applepic=[1]
pygame.init()

FPS = 30 # frames per second setting
fpsClock = pygame.time.Clock()

#--------------- set up the window------------------------------------------------------

pygame.display.set_caption('Fallen Apples')

#-------------------define functions-------------------------------------------------------
def title():
        #show title page
	screen.blit(titlepage,(0,0))
	
def rules():
        #show rules
	screen.blit(Rules,(0,0))

def Apple(r,ax,ay):
        #picking apple type
        if r==1 or r==2 or r==3:
                screen.blit(Red,(ax,ay))
        if r==4 or r==5:
                screen.blit(Green,(ax,ay))
        if r==6:
                screen.blit(Yellow,(ax,ay))
                
def move_Jon(x,y):   #Great functions are versatile can do more than one thing
    return x,y

#def lives(r):
    
    


#--------------------set starting values of variables---------------------------------------------
Jonx=400
Jony=400
x=100
y=0
location='title page'
speed=3
level=1
Lives=4
gameover=0

#game start
direction=1
explode=False
while True:
        if location=='title page':
            title()
        elif location=='rules':
            rules()
        elif location=='play game':
            
            screen.blit(Orchard,(0,0))    #show images
            if explode==False:
                    screen.blit(Jon,(Jonx,Jony))
            else:        
                    screen.blit(Explode,(Jonx+15,Jony))
                    explodeCounter=explodeCounter+1
                    if explodeCounter>=6:
                            explode=False
            screen.blit(Bird,(x,y))
            font = pygame.font.SysFont('Times New Roman', 32)
            text1 = font.render('Points ='+str(points), True, GREEN, BLUE)
            text2 = font.render('Level: '+str(level), True, GREEN, BLUE)
            text3 = font.render('Lives: '+str(Lives), True, GREEN, BLUE)
            screen.blit(text1,(100,650))
            screen.blit(text2,(300,650))
            screen.blit(text3,(500,650))
            #game end 
            if gameover==1:
                screen.blit(Gameover,(0,0))
                
            #Death
            if Lives < 1:
                gameover=1
                Lives=4
                appley=-10000
                
            #shooting
            removeAppleBullet=-1
            for i in range (len(Applex)):
                Appley[i]=Appley[i]+10
                Apple(Applepic[i],Applex[i],Appley[i])
                if Appley[i]>=700:
                    removeAppleBullet=i
                    Lives=Lives-1
    #if you get an apple 
                if math.hypot((Applex[i]-Jonx),(Appley[i]-Jony)) <100 :
                    removeAppleBullet=i
                    explosion=1
                    explode =True
                    explodeCounter=0
                    #screen.blit(Explode,(Jonx,Jony))
                    if Applepic[i]==1:
                        points=points+100
                        point=point+100
                        print(points)
                        
                        #screen.blit(Explode,(Jonx,Jony))
                        #time.sleep(0.1)
                    if Applepic[i]==2:
                        points=points+100
                        point=point+100
                        print(points)
                        #screen.blit(Explode,(Jonx,Jony))
                        #time.sleep(0.1)
                    if Applepic[i]==3:
                        points=points+100
                        point=point+100
                        print(points)
                        #screen.blit(Explode,(Jonx,Jony))
                        #time.sleep(0.1)
                    if Applepic[i]==4:
                        points=points+150
                        point=point+150
                        print(points)
                        #screen.blit(Explode,(Jonx,Jony))
                        #time.sleep(0.1)
                    if Applepic[i]==5:
                        points=points+150
                        point=point+150
                        print(points)
                        #screen.blit(Explode,(Jonx,Jony))
                        #time.sleep(0.1)
                    if Applepic[i]==6:
                        points=points+200
                        point=point+200
                        print(points)
                        #screen.blit(Explode,(Jonx,Jony))
                        #time.sleep(0.1)
                #makes it harder
                if point>=2000:
                    speed=speed+1
                    point=0
                    level=level+1
                    Lifex=600
                    #level goes up
            if level>1:
                    screen.blit(Life,(Lifex,Lifey))
                    #heart hit box
            if math.hypot((Jonx+50-Lifex),(Jony+150-Lifey)) <50 :
                    Lives=Lives+1
                    Lifex=-1000
    #Apple remove
            if removeAppleBullet>-1:
                Applex.pop(removeAppleBullet)
                Appley.pop(removeAppleBullet)
                Applepic.pop(removeAppleBullet)
            removeAppleBullet=-1
            for i in range (len(Applex)):
              Appley[i]=Appley[i]+speed
              
            #explosion
            #if explosion==1 and removeAppleBullet>-1:
             #   time.sleep(0.5)
                
                
                

            #Move Jon
            if DIRECTION == 'LEFT':
                if Jonx>=0:
                    Jonx=Jonx-5
            if DIRECTION == 'RIGHT':
                if Jonx<=1000:
                    Jonx=Jonx+5

            #directions for Jon
            
               
            x=x+speed*direction 
            if x>1050:
                direction=direction*-1
             
            if x<50:
                direction=direction*-1
                    
            r=random.randint(1,75)
            if (r==1):
                  Applex.append(x)
                  Appley.append(-100)
                  Applepic.append(random.randint(1,6))
                #restart game 
        elif location=='Play again':
            lives=4
            points=0
            level=0
            speed=3
            Jonx=400
            Jony=400
            x=100
            y=0
            gameover=0
            Lifex=0
            Jonx=600
            title()
            location='title page'
                
             #--------------------------------------------------------------
        for event in pygame.event.get():
                 if event.type == QUIT:
                    pygame.quit()
                    sys.exit()
                    #what buttons do 
                 if event.type==KEYDOWN:
                      if event.key==K_LEFT:
                          Jonx=Jonx-25
                      elif event.key==K_3:
                          location='Play again'
                          lives=20
                      elif event.key==K_RIGHT:
                          Jonx=Jonx+25
                      elif event.key==K_RETURN:
                          if location=='title page':
                              location='rules'
                          elif location=='rules':
                              location='play game'
                          elif location=='Play again':
                              location='title page'
                          elif gameover==1:
                              location='Play again'
                                            
        pygame.display.update()
        fpsClock.tick(FPS)

