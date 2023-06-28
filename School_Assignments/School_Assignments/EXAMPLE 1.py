#import other files
import math
import random
import pygame, sys
from pygame.locals import *

pygame.init()
#load images and set up clock
ship = pygame.image.load('yes.png')
invader1 = pygame.image.load('Secret pear.png')
invader2 = pygame.image.load('Granny smith.png')
invader3 = pygame.image.load('Apple thing.png')
shot = pygame.image.load('Tom.png')
alienshot = pygame.image.load('Arm4.png')
boom = pygame.image.load('Fish.png')
boom2 = pygame.image.load('Shark.png')
space=pygame.image.load('Apple orchard.png')
heal=pygame.image.load('Arm1.png')
cover=pygame.image.load('Ocean.png')
rules=pygame.image.load('Directed by.png')
controls=pygame.image.load('Classroom.jpg')
FPS = 30 # frames per second setting
fpsClock = pygame.time.Clock()

# set up the window
screen = pygame.display.set_mode((800, 700), 0, 32)
pygame.display.set_caption('Animation')
# create colours
WHITE = (255, 255, 255)
WHITE2 = (0, 0, 255)
#set up starting location of the ship
shipx = 500
shipy = 610
whichalien=[]
invadery=[0,0,0,0,0,
          100,100,100,100,100,
          200,200,200,200,200,
          300,300,300,300,300]

invaderx=[0,100,200,300,400,
          0,100,200,300,400,
          0,100,200,300,400,
          0,100,200,300,400]
for i in range (20):
    whichalien.append(random.randint(1,3))
    
con=False
count=0
points=0
lives=3
shotx=[]
shoty=[]
hit=0
level=1

alienshotx=[]
alienshoty=[]

def pickspaceman(invaderx,invadery,r):
 #choose alien   
    
    if r==1:
         screen.blit(invader1,(invaderx,invadery))
    if r==2:
         screen.blit(invader2,(invaderx,invadery))
    if r==3:
         screen.blit(invader3,(invaderx,invadery))
    
     #--------------------------------------------------------------

#direction of aliens and the speed that they go at
direction=1
speed=5

restart=False
waitTime=0

#shooting delay
delay=False
while(con==False):
    
    screen.blit(cover,(0,0))


    for event in pygame.event.get(): #check for user input
         if event.type == QUIT:  #quit if requested to do so
            pygame.quit()
            sys.exit()
    if event.type==KEYDOWN:  #react when a key is pressed
              if event.key==K_SPACE:  #move left
                  con=1
    if event.type==KEYDOWN:  #react when a key is pressed
              if event.key==K_1:  #move left
                  menu=2
                  if(menu==2):
                      screen.blit(rules,(0,0))
                      pygame.display.update()
    if event.type==KEYDOWN:  #react when a key is pressed
              if event.key==K_2:  #move left
                  menu=3
                  if(menu==3):
                      screen.blit(controls,(0,0))
                      pygame.display.update()

                                        
    
                      

    pygame.display.update()
    
        

    
    while (con==True): # the main game loop


         if (delay==True):
             waitTime=waitTime+1
             if (waitTime>=10):
                 waitTime=0
                 delay=False
         screen.blit(space,(0,0))
         screen.blit(ship, (shipx, shipy))

#text code
         font=pygame.font.SysFont('Times New Roman',22)
         text=font.render('points='+str(points) ,True,WHITE,WHITE2)
         screen.blit(text,(20,590))
         text=font.render('lives='+str(lives) ,True,WHITE,WHITE2)
         screen.blit(text,(20,540))
         text=font.render('level='+str(level) ,True,WHITE,WHITE2)
         screen.blit(text,(20,490))
         

        #shooting
         removealienBullet=-1
         for i in range (len(alienshotx)):
             alienshoty[i]=alienshoty[i]+10
             screen.blit(alienshot,(alienshotx[i],alienshoty[i]))
             if alienshoty[i]>=700:
                 removealienBullet=i

             if alienshoty[i]>=700:
                 removealienBullet=i
#if you get hit
             if math.hypot((alienshotx[i]-shipx),(alienshoty[i]-shipy)) <30 :
                 removealienBullet=i
                 hit=hit+1
                 lives=lives-1
                 screen.blit(boom2,(shipx,shipy))
#alien bullet remove
         if removealienBullet>-1:
              alienshotx.pop(removealienBullet)
              alienshoty.pop(removealienBullet)




        #figure out how to remove
                 
         changeDirection=False

        #alien bullets 

         removealienBullet=-1
         for i in range (len(invaderx)):
              pickspaceman(invaderx[i],invadery[i],whichalien[i])
              invaderx[i]=invaderx[i]+speed*direction
              r=random.randint(1,100)
              if (r==1):
                  alienshotx.append(invaderx[i])
                  alienshoty.append(invadery[i])
                    









                  #alien movement and death aswhile as bullet code
                
              if (invaderx[i]>=750):
                    changeDirection=True
                    
              if invaderx[i]<=0:
                changeDirection=True
         if (invadery[i]>=600) :
             hit=hit+3   

               
         if changeDirection==True:
              direction=direction*-1
              for i in range (len(invaderx)):
                  invadery[i]=invadery[i]+10

         removeBullet=-1
         removealien=-1     
         for i in range (len(shotx)):
             shoty[i]=shoty[i]-10
             screen.blit(shot,(shotx[i],shoty[i]))
             if shoty[i]<=0:
                 removeBullet=i

#checking if kills then killing
             for j in range (len(invaderx)):        
                 if math.hypot((shotx[i]-invaderx[j]),(shoty[i]-invadery[j])) <30 :
                    points=points+100
                    removeBullet=i
                    removealien=j
                    screen.blit(boom,(invaderx[j],invadery[j]))
                    
                 
#removing the aliens and bullets            

         if removeBullet>-1:
              shotx.pop(removeBullet)
              shoty.pop(removeBullet)
         


            


         if removealien>-1:
              
              invaderx.pop(removealien)
              invadery.pop(removealien)
              
#restart
         if(len(invaderx)<=0 or restart==True):
             invadery=[0,0,0,0,0,
                       100,100,100,100,100,
                       200,200,200,200,200,
                       300,300,300,300,300]
             invaderx=[0,100,200,300,400,
                       0,100,200,300,400,
                       0,100,200,300,400,
                       0,100,200,300,400]
             changeDirection=False
             speed=speed+1
             direction=1
             level=level+1

             restart=False
         
                 
         #lose

         if (hit>=3):
             screen.blit(cover,(0,0))
             con=False
             hit=0
             level=1
             lives=3
             for event in pygame.event.get(): #check for user input
                 if event.type == QUIT:  #quit if requested to do so
                    pygame.quit()
                    sys.exit()
             if event.type==KEYDOWN:  #react when a key is pressed
                  if event.key==K_SPACE:  #move left
                      con=1
#reseting
             points=0
             speed=5
                




             invadery=[0,0,0,0,0,
                       100,100,100,100,100,
                       200,200,200,200,200,
                       300,300,300,300,300]
             invaderx=[0,100,200,300,400,
                       0,100,200,300,400,
                       0,100,200,300,400,
                       0,100,200,300,400]
             changeDirection=False
             
             direction=1


                    #move the invader down
         
         fpsClock.tick(FPS)   #pause the program

         
            

                 


        #controls

         for event in pygame.event.get(): #check for user input
             if event.type == QUIT:  #quit if requested to do so
                pygame.quit()
                sys.exit()
             if event.type==KEYDOWN:  #react when a key is pressed
                  if event.key==K_LEFT:  #move left
                       shipx=shipx-20
                       #restart=True
                  elif event.key==K_RIGHT:   #move   right
                       shipx=shipx+20
                  
                  elif event.key==K_SPACE and delay==False:   #move   right
                       shotx.append(shipx+15)
                       shoty.append(shipy)
                       shooting=True
                       delay=True
                  elif event.key==K_0:
                      hit=hit-100
                      lives=lives+100
                  elif event.key==K_9:
                      points=points+1000

                  elif event.key==K_7:
                      speed=speed+1
                            
   


                
                    
                  
           


         
             


         pygame.display.update()   #show image in new loshipion
         fpsClock.tick(FPS)   #pause the program

