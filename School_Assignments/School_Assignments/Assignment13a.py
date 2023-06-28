import pygame, sys,math
import random
from pygame.locals import *
pygame.init()
screen=pygame.display.set_mode((1800,1000))

red=(255,0,0)
brickRed=(241,82,14)
green=(0,128,0)
yellow=(255,255,0)
black=(0,0,0)
blue=(230,130,0)
randomc=(75,120,212)
Inky=pygame.image.load('Inky.png')
Pinky=pygame.image.load('pinkpac.png')
Pinky=pygame.transform.scale(Pinky,(47,47))
Blinky=pygame.image.load('redpac.png')
Blinky=pygame.transform.scale(Blinky,(47,47))
Clide=pygame.image.load('gladpac.jpg')
Clide=pygame.transform.scale(Clide,(47,47))
Pacman=pygame.image.load('pacman.jpg')
Pacman=pygame.transform.scale(Pacman,(47,47))
Brick=pygame.image.load('Brick.png')
Rupees=pygame.image.load('rupees.png')
OBrick=pygame.image.load('Brick t.png')
Inky=pygame.transform.scale(Inky,(50,50))
Menu=pygame.image.load('Menu.png')
Rules=pygame.image.load('rule.png')
Inky2=pygame.transform.scale(Inky,(100,100))
Pacman2=pygame.transform.scale(Pacman,(94,94))
Pinky2=pygame.transform.scale(Pinky,(94,94))
Blinky2=pygame.transform.scale(Blinky,(94,94))
Clide2=pygame.transform.scale(Clide,(94,94))
LevelUP=pygame.image.load('level up.png')
x=0
y=0
xdead=-100
ydead=500
direction='right'
#Rupees
Blue0=pygame.image.load('Orange Rup.png')
Purple0=pygame.image.load('yellow Rup.png')
Green0=pygame.image.load('green Rup.png')
Orange0=pygame.image.load('blue Rup.png')
Yellow0=pygame.image.load('purple Rup.png')


row=1  #starting location of the player in the maze
#Ghostx=430
Ghosty=300
Ghostx=150

#random
r=random.randint(1,5)

def coin(x,y):
     screen.blit(Rupees,(x+10,y+8,40,40))
     
def barrier(x,y):
     pygame.draw.circle(screen,randomc,(x+20,y+20),19)
     pygame.draw.rect(screen,black,(x,y,40,40),2)

def Pacman1(x,y):
     screen.blit(Pacman,(Ghostx,Ghosty))
def Blinky1(x,y):
     screen.blit(Blinky,(Ghostx,Ghosty))
def Pinky1(x,y):
     screen.blit(Pinky,(Ghostx,Ghosty))
def Clide1(x,y):     
     screen.blit(Clide,(Ghostx,Ghosty))
def bricks (x,y):
     screen.blit(Brick,(x,y,40,40))
def OBricks (x,y):
     screen.blit(OBrick,(x,y,40,40))
def player(x,y):
        screen.blit(Inky,(x-5,y-5))
def pellets(x,y):
        screen.blit(Blue0,(x+10,y+8))
        
def createMaze(): #set up the world as numbers
                  #0-path of gems
                  #1-wall
                  #2 - barrier that could be removed
                  #-3 - walls you can go through
                  #-4 - gems / power ups
     row0= [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]#20 x 15 list
     row1= [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
     row2= [1,0,1,1,1,0,1,1,0,1,1,1,1,1,1,0,1,1,0,1,1,1,0,1]
     row3= [1,0,0,-4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-4,0,0,1]
     row4= [1,0,1,0,1,0,1,0,1,0,1,1,1,1,0,1,0,1,0,1,0,1,0,1]
     row5= [1,0,1,0,1,0,1,0,1,0,2,-1,-1,2,0,1,0,1,0,1,0,1,0,1]
     row6= [1,0,1,0,1,0,1,0,1,0,1,-1,-1,1,0,1,0,1,0,1,0,1,0,1]
     row7= [1,0,1,0,1,0,1,0,0,0,1,-1,-1,1,0,0,0,1,0,1,0,1,0,1]
     row8= [1,0,1,0,1,0,1,0,1,0,1,-1,-1,1,0,1,0,1,0,1,0,1,0,1]
     row9= [1,0,-3,0,-3,0,1,0,1,0,2,-1,-1,2,0,1,0,1,0,-3,0,-3,0,1]
     row10=[1,0,1,0,1,0,0,0,1,0,1,1,1,1,0,1,0,1,0,1,0,1,0,1]
     row11=[1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1]
     row12=[1,0,1,0,1,0,1,1,1,0,1,1,1,1,0,1,1,1,0,1,0,1,0,1]
     row13=[1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1]
     row14=[1,0,1,0,1,0,1,1,1,1,1,-3,-3,1,1,1,1,1,0,1,0,1,0,1]
     row15=[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
     row16=[1,0,1,1,1,0,1,1,1,0,1,1,1,1,0,1,1,1,0,1,1,1,0,1]
     row17=[1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1]
     row18=[1,0,1,-4,1,0,1,0,1,1,1,1,1,1,1,1,0,1,0,1,-4,1,0,1]
     row19=[1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1]
     row20=[1,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,1]
     row21=[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]
     
     maze = [row0,row1,row2 ,row3,row4,row5,row6,row7,row8,row9,row10,row11,row12,row13,row14,row15,row16,row17,row18,row19,row20,row21]
     return maze

def drawMaze(maze): # draw the maze changing the numbers to images
   for j in range(24):
       for i  in range(22):
             x=j*40
             y=i*40
             if maze[i][j] == 1 :
                 bricks(x,y)
             elif maze[i][j] == 2:
                 barrier(x,y)
             elif maze[i][j] == -3:
                  OBricks(x,y)
             elif maze[i][j] == -4:
                 pellets(x,y)
             
             elif maze[i][j] == 0:
                 coin(x,y)

def checkMaze(maze):
     t=0
     for j in range(23):
          for i  in range(22):
               if maze[i][j]==-4 or maze[i][j]==0  :
                    t=1
                    waitTime=0
     if t==0:
          return True
     else:
          return False       
row=1  #starting location of the player in the maze
column=10
points=0
maze=createMaze()
FPS = 30 # frames per second setting
fpsClock = pygame.time.Clock()
x=0
y=0

#SPAWN POINTS
row=1  #starting location of the player in the maze
column=10#starting location of the player in the maze
rowGhost1=6  
columnGhost=11
rowGhost2=7
columnGhost2=12
columnGhost3=11
rowGhost3=8
columnGhost4=12
rowGhost14=9

waitTime=0
points=0
lives=3
level=1
delay=False
done =False

time=0
time2=0
time3=0
time4=0
time5=0
time6=0
time7=0
time8=0
#speed
enemyspeed=37#enemeys speed
enemyspeed2=34
enemyspeed3=35
enemyspeed4=36
enemyspeed5=37
enemyspeed6=34
enemyspeed7=35
enemyspeed8=36

pacx=400
pacy=40
game=1
#hurt ghost
rowGhost1hurt=5  
columnGhosthurt=9
rowGhost1hurt2=5  
columnGhosthurt2=3
rowGhost1hurt4=5  
columnGhosthurt4=10
rowGhost1hurt3=5  
columnGhosthurt3=16
Sleep=0
speed=1
menu=1
location='title page'
#===============================================================================
while True:
     if location=='Game over':
          speed=1
          points=0
          lives=3
          level=1
          screen.blit(Blinky2,(xdead-100,ydead))
          screen.blit(Inky2,(xdead-20,ydead))
          screen.blit(Pinky2,(xdead-200,ydead))
          screen.blit(Clide2,(xdead-300,ydead)) 
          screen.blit(Pacman2,(xdead-400,ydead))
          direction='right'
          if direction=='right':
               xdead=xdead+5
          if xdead>=1900:
               location='title page'
               xdead=-100
               maze=createMaze()
               drawMaze(maze)
     if location=='title page':
          screen.blit(Menu,(0,0))
     if location=='rules':
          screen.blit(Rules,(0,0))
     if location=='play game':
         screen.fill(black)
         drawMaze(maze)
              
              
         player(column*40,row*40)

         #display
         font=pygame.font.SysFont('Times New Roman',22)#lives points and visuals all blit in here 
         text2=font.render('lives='+str(lives) ,True,red,yellow)
         font=pygame.font.SysFont('Times New Roman',22)
         text3=font.render('level='+str(level) ,True,red,yellow)
         font = pygame.font.SysFont('Times New Roman', 32)
         text1 = font.render('Points ='+str(points), True, blue, green)
         screen.blit(text1,(1000,200))
         screen.blit(text2,(200,850))
         screen.blit(text3,(850,850))

         #pacman
         screen.blit(Pacman,(columnGhost*40,rowGhost1*40))
         screen.blit(Pinky,(columnGhost2*40,rowGhost2*40))
         screen.blit(Blinky,(columnGhost3*40,rowGhost3*40))
         screen.blit(Clide,(columnGhost4*40,rowGhost14*40))

         #time
         time=time+speed
         time2=time2+speed
         time3=time3+speed
         time4=time4+speed

         #hit boxes
         if math.hypot((columnGhost-column),(rowGhost1-row)) <1    : #if player gets hit
              row=1  
              column=10
              rowGhost1=6  
              columnGhost=11
              rowGhost2=7
              columnGhost2=12
              columnGhost3=11
              rowGhost3=8
              columnGhost4=12
              rowGhost14=9
              lives=lives-1
         if math.hypot((columnGhost2-column),(rowGhost2-row)) <1    : #if player gets hit
              row=1  
              column=10
              rowGhost1=6  
              columnGhost=11
              rowGhost2=7
              columnGhost2=12
              columnGhost3=11
              rowGhost3=8
              columnGhost4=12
              rowGhost14=9
              lives=lives-1
         if math.hypot((columnGhost3-column),(rowGhost3-row)) <1    : #if player gets hit
              row=1  
              column=10
              rowGhost1=6  
              columnGhost=11
              rowGhost2=7
              columnGhost2=12
              columnGhost3=11
              rowGhost3=8
              columnGhost4=12
              rowGhost14=9
              lives=lives-1
         if math.hypot((columnGhost4-column),(rowGhost14-row)) <1    : #if player gets hit
              row=1  
              column=10
              rowGhost1=6  
              columnGhost=11
              rowGhost2=7
              columnGhost2=12
              columnGhost3=11
              rowGhost3=8
              columnGhost4=12
              rowGhost14=9
              lives=lives-1
         pygame.display.update()

          #pacmans chasing code 
         if(time>=enemyspeed):
               if columnGhost > column and maze[rowGhost1][columnGhost-1] != 1  :   
                    columnGhost=columnGhost-1
               if columnGhost < column and maze[rowGhost1][columnGhost+1] != 1:
                    columnGhost=columnGhost+1
               if rowGhost1> row and maze[rowGhost1-1][columnGhost] != 1:	      
                    rowGhost1=rowGhost1-1
               if rowGhost1 < row and maze[rowGhost1+1][columnGhost] != 1:
                    rowGhost1=rowGhost1+1
               time=0

         if(time2>=enemyspeed2):
               if columnGhost2 > column and maze[rowGhost2][columnGhost2-1] != 1  :    #If the pacmanx is to the right of the ghost
                    columnGhost2=columnGhost2-1
                    #move left towards the ghost
               if columnGhost2 < column and maze[rowGhost2][columnGhost2+1] != 1:
                    columnGhost2=columnGhost2+1	#otherwise move right towards the ghost
               if rowGhost2> row and maze[rowGhost2-1][columnGhost2] != 1:	      #If the pacmanx is below the ghost
                    rowGhost2=rowGhost2-1
                    1   #move up towards the ghost
               if rowGhost2 < row and maze[rowGhost2+1][columnGhost2] != 1:
                    rowGhost2=rowGhost2+1 	#otherwise move down towards the ghost
               time2=0

         if(time3>=enemyspeed3):
               if columnGhost3 > column and maze[rowGhost3][columnGhost3-1] != 1  :    #If the pacmanx is to the right of the ghost
                    columnGhost3=columnGhost3-1
                    #move left towards the ghost
               if columnGhost3 < column and maze[rowGhost3][columnGhost3+1] != 1:
                    columnGhost3=columnGhost3+1	#otherwise move right towards the ghost
               if rowGhost3> row and maze[rowGhost3-1][columnGhost3] != 1:	      #If the pacmanx is below the ghost
                    rowGhost3=rowGhost3-1
                    1   #move up towards the ghost
               if rowGhost3 < row and maze[rowGhost3+1][columnGhost3] != 1:
                    rowGhost3=rowGhost3+1 	#otherwise move down towards the ghost
               time3=0


         if(time4>=enemyspeed4):
               if columnGhost4 > column and maze[rowGhost14][columnGhost4-1] != 1  :    #If the pacmanx is to the right of the ghost
                    columnGhost4=columnGhost4-1
                    #move left towards the ghost
               if columnGhost4 < column and maze[rowGhost14][columnGhost4+1] != 1:
                    columnGhost4=columnGhost4+1	#otherwise move right towards the ghost
               if rowGhost14> row and maze[rowGhost14-1][columnGhost4] != 1:	      #If the pacmanx is below the ghost
                    rowGhost14=rowGhost14-1
                    1   #move up towards the ghost
               if rowGhost14 < row and maze[rowGhost14+1][columnGhost4] != 1:
                    rowGhost14=rowGhost14+1 	#otherwise move down towards the ghost
               time4=0
     for event in pygame.event.get():
          if event.type==QUIT:
               pygame.quit()
               sys.exit()
               
        #movement and key binds
          if event.type==KEYDOWN:
               if event.key==K_UP and maze[row-1][column]<=0:
                    row=row-1
               if event.key==K_DOWN and maze[row+1][column]<=0:
                    row=row+1
               if event.key==K_RIGHT and maze[row][column+1]<=0:
                    column=column+1
               if event.key==K_LEFT and maze[row][column-1]<=0:
                    column=column-1
               elif event.key==K_RETURN:
                    if location=='title page':
                         location='play game'
               if event.key==K_1:
                   location='rules'
               if event.key==K_RETURN:
                   location='play game' 
    

                    #death
               if lives<=0:
                   direction='right'
                   location='Game over'
                   screen.fill(black)
                   pygame.display.update()

                   if direction=='right':
                       pygame.display.update()
                       xdead=xdead+10
                       pygame.display.update()
                   fpsClock.tick(FPS) 

     
                    #cheat
               if event.key==K_9:
                    speed=speed*speed+1


         #collecting points 
     if maze[row][column]==0:
           points=points+100
           maze[row][column]=-1
     if maze[row][column]<=-4:
           points=points+1000
           maze[row][column]=-1
           location='Reverse play'
           delay=True
           waitTime=200

             

     if location=='Reverse play':
         screen.fill(black)
         drawMaze(maze)
         if(checkMaze(maze)):
              Sleep=Sleep+1
              screen.blit(LevelUP,(0,0))
              if Sleep>=30:
                  Sleep=0
                  maze=createMaze()
                  drawMaze(maze)
                  level=level+1
                  speed=speed+1
              
         player(column*40,row*40)

         #display
         font=pygame.font.SysFont('Times New Roman',22)#lives points and visuals all blit in here 
         text2=font.render('lives='+str(lives) ,True,red,yellow)
         font=pygame.font.SysFont('Times New Roman',22)
         text3=font.render('level='+str(level) ,True,red,yellow)
         font = pygame.font.SysFont('Times New Roman', 32)
         text1 = font.render('Points ='+str(points), True, blue, green)
         font = pygame.font.SysFont('Times New Roman', 32)
         text4 = font.render('Power up enabled for='+str(waitTime), True, blue, green)
         screen.blit(text1,(1000,200))
         screen.blit(text2,(200,850))
         screen.blit(text3,(850,850))
         screen.blit(text4,(1000,400))

         #pacman
         screen.blit(Pacman,(columnGhost*40,rowGhost1*40))
         screen.blit(Pinky,(columnGhost2*40,rowGhost2*40))
         screen.blit(Blinky,(columnGhost3*40,rowGhost3*40))
         screen.blit(Clide,(columnGhost4*40,rowGhost14*40))

         #time
         time5=time5+speed
         time6=time6+speed
         time7=time7+speed
         time8=time8+speed
         delay=True

         #HIT BOXES WHEN JEWEL IS COLLECTED
         
         if math.hypot((columnGhost-column),(rowGhost1-row)) <1    : #if player gets hit
              points=points+1000
              rowGhost1=6  
              columnGhost=11
         if math.hypot((columnGhost2-column),(rowGhost2-row)) <1    : #if player gets hit
              points=points+1000
              rowGhost2=7  
              columnGhost2=12
         if math.hypot((columnGhost3-column),(rowGhost3-row)) <1    : #if player gets hit
              points=points+1000
              rowGhost3=8  
              columnGhost3=11
         if math.hypot((columnGhost4-column),(rowGhost14-row)) <1    : #if player gets hit
              points=points+1000
              rowGhost14=9
              columnGhost4=12

               #pacmans chasing code 
         if(time5>=enemyspeed5):
               if columnGhost < column and maze[rowGhost1][columnGhost-1] != 1  :
                    columnGhost=columnGhost-1
               if columnGhost > column and maze[rowGhost1][columnGhost+1] != 1:
                    columnGhost=columnGhost+1
               if rowGhost1 < row and maze[rowGhost1-1][columnGhost] != 1:	      
                    rowGhost1=rowGhost1-1
               if rowGhost1 > row and maze[rowGhost1+1][columnGhost] != 1:
                    rowGhost1=rowGhost1+1
               time5=0

         if(time6>=enemyspeed6):
               if columnGhost2 < column and maze[rowGhost2][columnGhost2-1] != 1  :    #If the pacmanx is to the right of the ghost
                    columnGhost2=columnGhost2-1
                    #move left towards the ghost
               if columnGhost2 > column and maze[rowGhost2][columnGhost2+1] != 1:
                    columnGhost2=columnGhost2+1	#otherwise move right towards the ghost
               if rowGhost2 < row and maze[rowGhost2-1][columnGhost2] != 1:	      #If the pacmanx is below the ghost
                    rowGhost2=rowGhost2-1
                    1   #move up towards the ghost
               if rowGhost2 > row and maze[rowGhost2+1][columnGhost2] != 1:
                    rowGhost2=rowGhost2+1 	#otherwise move down towards the ghost
               time6=0

         if(time7>=enemyspeed7):
               if columnGhost3 < column and maze[rowGhost3][columnGhost3-1] != 1  :    #If the pacmanx is to the right of the ghost
                    columnGhost3=columnGhost3-1
                    #move left towards the ghost
               if columnGhost3 > column and maze[rowGhost3][columnGhost3+1] != 1:
                    columnGhost3=columnGhost3+1	#otherwise move right towards the ghost
               if rowGhost3 < row and maze[rowGhost3-1][columnGhost3] != 1:	      #If the pacmanx is below the ghost
                    rowGhost3=rowGhost3-1
                    1   #move up towards the ghost
               if rowGhost3 > row and maze[rowGhost3+1][columnGhost3] != 1:
                    rowGhost3=rowGhost3+1 	#otherwise move down towards the ghost
               time7=0


         if(time8>=enemyspeed8):
               if columnGhost4 < column and maze[rowGhost14][columnGhost4-1] != 1  :    #If the pacmanx is to the right of the ghost
                    columnGhost4=columnGhost4-1
                    #move left towards the ghost
               if columnGhost4 > column and maze[rowGhost14][columnGhost4+1] != 1:
                    columnGhost4=columnGhost4+1	#otherwise move right towards the ghost
               if rowGhost14 < row and maze[rowGhost14-1][columnGhost4] != 1:	      #If the pacmanx is below the ghost
                    rowGhost14=rowGhost14-1
                    1   #move up towards the ghost
               if rowGhost14 > row and maze[rowGhost14+1][columnGhost4] != 1:
                    rowGhost14=rowGhost14+1 	#otherwise move down towards the ghost
               time8=0
              
         if (delay==True):
               waitTime=waitTime-1
               if (waitTime==0):
                    waitTime=200
                    delay=False
         if (delay==False):
              location='play game'
              pygame.display.update()

         if(checkMaze(maze)):
              Sleep=Sleep+1
              screen.blit(LevelUP,(0,0))
              if Sleep>=10:
                  Sleep=0
                  maze=createMaze()
                  drawMaze(maze)
                  level=level+1
                  speed=speed+1
                  player(column*40,row*40)
                  screen.blit(Pacman,(columnGhost*40,rowGhost1*40))
                  screen.blit(Pinky,(columnGhost2*40,rowGhost2*40))
                  screen.blit(Blinky,(columnGhost3*40,rowGhost3*40))
                  screen.blit(Clide,(columnGhost4*40,rowGhost14*40))
                      
                    
     fpsClock.tick(FPS)
                    
     pygame.display.update()

     
