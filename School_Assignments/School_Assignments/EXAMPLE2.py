import pygame, sys #import junk
import random,math
from pygame.locals import *
pygame.init()
screen=pygame.display.set_mode((1800,1000))
pac=pygame.image.load('pacman.jpg')#load images
cage=pygame.image.load('yes.png')
bee=pygame.image.load('Apples.png')
beehive=pygame.image.load('Arm1.png')
pacmancover=pygame.image.load('Apple orchard.png')
rules=pygame.image.load('rules.png')
story=pygame.image.load('Directed by.png')
gameover=pygame.image.load('Gameover.png')
nic1=pygame.image.load('Fish.png')
nicpic2=pygame.image.load('Evil birdy.png')
gate=pygame.image.load('Hat 1.jpg')
nicpic3=pygame.image.load('Head1.png')
nicpic4=pygame.image.load('Head2.png')
nicbee=pygame.image.load('Heart.png')
brokencage=pygame.image.load('Ocean.png')
red=(255,0,0)
brickRed=(241,82,14)
green=(0,128,0)
yellow=(255,255,0)
black=(0,0,0)
BLACK=(0,0,0)
#define functions
def coin(x,y):
     screen.blit(bee,(x,y))
def broken(x,y):
     screen.blit(brokencage,(x,y))
def nic(x,y):
     screen.blit(nic1,(x,y))
def nic2(x,y):
     screen.blit(nicpic2,(x,y))
def nic3(x,y):
     screen.blit(nicpic3,(x,y))
def nic4(x,y):
     screen.blit(nicpic4,(x,y))
def hurtnic(x,y):
     screen.blit(nicbee,(x,y))
def hurtnic2(x,y):
     screen.blit(nicbee,(x,y))
def hurtnic3(x,y):
     screen.blit(nicbee,(x,y))
def hurtnic4(x,y):
     screen.blit(nicbee,(x,y))

def barrier(x,y):
     screen.blit(gate,(x,y))

def bricks (x,y):
     screen.blit(cage,(x,y))

def player(pacx,pacy):
     screen.blit(pac,(pacx,pacy))
def hive(x,y):
     screen.blit(beehive,(x,y))
def createMaze(): #set up the world as numbers
                  #0-path of yellow
                  #1-wall
                  #2 - barrier that could be removed

     row0= [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]#20 x 15 list
     row1= [1,-3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-3,1,1]
     row2= [1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1]
     row3= [1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,1,1]
     row4= [1,0,1,0,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1]
     row5= [1,0,1,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,1,0,-3,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1]
     row6= [1,0,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1]
     row7= [1,0,0,0,1,0,0,0,0,0,1,0,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,1,1]
     row8= [1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,0,2,-1,-1,-1,2,0,0,0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1]
     row9= [1,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0,1,-1,-1,-1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1]
     row10=[1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,2,-1,-1,-1,2,0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,1,0,1,0,1,1]
     row11=[1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,-1,-1,-1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1]
     row12=[1,0,0,0,1,0,1,-3,1,0,0,0,0,0,0,0,1,-1,-1,-1,1,0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,1,1]
     row13=[1,0,1,0,1,0,1,1,1,0,1,1,0,1,1,0,1,1,1,1,1,1,0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1]
     row14=[1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1]
     row15=[1,0,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1]
     row16=[1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1]
     row17=[1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1]
     row18=[1,-3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-3,1,1]
     row19=[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]
     row20=[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]
     maze = [row0,row1,row2 ,row3,row4,row5,row6,row7,row8,row9,row10,row11,row12,row13,row14,row15,row16,row17,row18,row19,row20]
     return maze
def createMaze_Part2(maze):
     for j in range(41):
          for i  in range(20):
               a=random.randint(0,3)
               if a==0:
                    maze[i][j]=1
               else:
                    maze[i][j]=0
     maze[1][1]=-3
     maze[18][39]=-3
     maze[1][39]=-3
     maze[18][1]=-3
     return maze
def drawMaze(maze): # draw the maze changing the numbers to images
   for j in range(41):
       for i  in range(20):
             x=j*40
             y=i*40
             if maze[i][j] == 1 :
                 bricks(x,y)

             elif maze[i][j] == 2:
                 barrier(x,y)
             
             elif maze[i][j] == 0:
                 coin(x,y)

             elif maze[i][j] == -3:
                 hive(x,y)
             elif maze[i][j] == -2:
                 broken(x,y)
             
def checkMaze(maze):
     t=0
     for j in range(40):
          for i  in range(21):
               if maze[i][j]==-3 or maze[i][j]==0  :
                    t=1
     if t==0:
          return True
     else:
          return False
#set numbers


FPS = 30 # frames per second setting
fpsClock = pygame.time.Clock()
x=0
y=0
row=1  #starting location of the player in the maze
column=10#starting location of the player in the maze
rownic=8  
columnnic=18
rownic2=15
columnnic2=14
columnnic3=7
rownic3=15
columnnic4=2
rownic4=12
waitTime=0
maze=createMaze()
maze=createMaze_Part2(maze)
points=0
lives=3
level=1
delay=False
done =False
enemyspeed=25#enemeys speed
enemyspeed2=10
time=0
time2=0
time3=0
time4=0
time5=0
time6=0
time7=0
enemyspeed3=20
enemyspeed4=30
enemyspeed5=30
enemyspeed6=10
enemyspeed7=20
time8=0
enemyspeed8=40
time8=0
pacx=400
pacy=40
game=1
rownichurt=5  
columnnichurt=9
rownichurt2=5  
columnnichurt2=3
rownichurt4=5  
columnnichurt4=10
rownichurt3=5  
columnnichurt3=16
blaster=10
speed=1
menu=1
#===============================================================================


location='start menu'

while True:
     if location=='start menu':
          screen.blit(pacmancover,(0,0))
          if(menu==2):
                                
                                screen.blit(rules,(0,0))
                                pygame.display.update()
          if(menu==3):
                                screen.blit(story,(0,0))
                                pygame.display.update()
                      

          for event in pygame.event.get(): #check for user input
              if event.type == QUIT:  #quit if requested to do so
                      pygame.quit()
                      sys.exit()

              if event.type==KEYUP:  #react when a key is press
                   menu=1
              if event.type==KEYDOWN:  #react when a key is pressed
                        if event.key==K_SPACE:  #move left
                            location='play game'
              if event.type==KEYDOWN:  #react when a key is pressed
                        if event.key==K_1:  #move left
                            menu=2
                            
              if event.type==KEYDOWN:  #react when a key is pressed
                        if event.key==K_2:  #move left
                            menu=3
                           
                                                  
              
                                

              pygame.display.update()

     if location=='play game':
         screen.fill(black)
         drawMaze(maze)
         done=checkMaze(maze)
         if(done==True):
              maze=createMaze()
              maze=createMaze_Part2(maze)
              drawMaze(maze)
              level=level+1
              blaster=10
              speed=speed+1
              location='movie'
         player(column*40,row*40)
         nic(columnnic*40,rownic*40)
         nic2(columnnic2*40,rownic2*40)
         nic3(columnnic3*40,rownic3*40)
         nic4(columnnic4*40,rownic4*40)
         font=pygame.font.SysFont('Times New Roman',22)#lives points and visuals all blit in here 
         text=font.render('points='+str(points) ,True,red,yellow)
         font=pygame.font.SysFont('Times New Roman',22)
         text2=font.render('lives='+str(lives) ,True,red,yellow)
         font=pygame.font.SysFont('Times New Roman',22)
         text3=font.render('level='+str(level) ,True,red,yellow)
         text4=font.render('wall breaks='+str(blaster) ,True,red,yellow)
         screen.blit(text,(60,850))
         screen.blit(text2,(200,850))
         screen.blit(text3,(850,850))
         screen.blit(text4,(950,850))
         screen.blit(nic1,(300,850))
         screen.blit(nicpic2,(350,850))
         screen.blit(nicpic3,(400,850))
         screen.blit(nicpic4,(450,850))
         screen.blit(pac,(550,850))
         time=time+speed
         time2=time2+speed
         time3=time3+speed
         time7=time7+speed
         if math.hypot((columnnic-column),(rownic-row)) <1    : #if player gets hit
              row=1  
              column=10
              rownic=5  
              columnnic=9
              rownic2=5  
              columnnic2=3
              rownic3=5  
              columnnic3=16
              rownic4=5
              columnnic4=10
              lives=lives-1
         if math.hypot((columnnic2-column),(rownic2-row)) <1    : #if player gets hit
              row=1  
              column=10
              columnnic=9
              rownic=5
              rownic2=5  
              columnnic2=3
              rownic3=5  
              columnnic3=16
              rownic4=5
              columnnic4=10
              lives=lives-1
         if math.hypot((columnnic3-column),(rownic3-row)) <1    : #if player gets hit
              row=1  
              column=10
              rownic=5
              columnnic=9
              rownic2=5  
              columnnic2=3
              rownic3=5  
              columnnic3=16
              rownic4=5
              columnnic4=10
              lives=lives-1
         if math.hypot((columnnic4-column),(rownic4-row)) <1    : #if player gets hit
              row=1  
              column=10
              rownic=5
              columnnic=9
              rownic2=5  
              columnnic2=3
              rownic3=5  
              columnnic3=16
              rownic4=5
              columnnic4=10
              lives=lives-1
              
              
         
         
         

                                                  
              
                                
              
              
              
     #nics chasing code 
         if(time>=enemyspeed):
              if columnnic > column and maze[rownic][columnnic-1] != 1  :    #If the nicx is to the right of the cat
                     columnnic=columnnic-1
                     #move left towards the cat
              if columnnic < column and maze[rownic][columnnic+1] != 1:
                     columnnic=columnnic+1	#otherwise move right towards the cat
              if rownic> row and maze[rownic-1][columnnic] != 1:	      #If the nicx is below the cat
                     rownic=rownic-1
                     1   #move up towards the cat
              if rownic < row and maze[rownic+1][columnnic] != 1:
                     rownic=rownic+1 	#otherwise move down towards the cat
              time=0

         if(time2>=enemyspeed2):
              if columnnic2 > column and maze[rownic2][columnnic2-1] != 1  :    #If the nicx is to the right of the cat
                     columnnic2=columnnic2-1
                     #move left towards the cat
              if columnnic2 < column and maze[rownic2][columnnic2+1] != 1:
                     columnnic2=columnnic2+1	#otherwise move right towards the cat
              if rownic2> row and maze[rownic2-1][columnnic2] != 1:	      #If the nicx is below the cat
                     rownic2=rownic2-1
                     1   #move up towards the cat
              if rownic2 < row and maze[rownic2+1][columnnic2] != 1:
                     rownic2=rownic2+1 	#otherwise move down towards the cat
              time2=0
              
         if(time3>=enemyspeed3):
              if columnnic3 > column and maze[rownic3][columnnic3-1] != 1  :    #If the nicx is to the right of the cat
                     columnnic3=columnnic3-1
                     #move left towards the cat
              if columnnic3 < column and maze[rownic3][columnnic3+1] != 1:
                     columnnic3=columnnic3+1	#otherwise move right towards the cat
              if rownic3> row and maze[rownic3-1][columnnic3] != 1:	      #If the nicx is below the cat
                     rownic3=rownic3-1
                     1   #move up towards the cat
              if rownic3 < row and maze[rownic3+1][columnnic3] != 1:
                     rownic3=rownic3+1 	#otherwise move down towards the cat
              time3=0
       
          
         if(time7>=enemyspeed7):
              if columnnic4 > column and maze[rownic4][columnnic4-1] != 1  :    #If the nicx is to the right of the cat
                     columnnic4=columnnic4-1
                     #move left towards the cat
              if columnnic4 < column and maze[rownic4][columnnic4+1] != 1:
                     columnnic4=columnnic4+1	#otherwise move right towards the cat
              if rownic4> row and maze[rownic4-1][columnnic4] != 1:	      #If the nicx is below the cat
                     rownic4=rownic4-1
                     1   #move up towards the cat
              if rownic4 < row and maze[rownic4+1][columnnic4] != 1:
                     rownic4=rownic4+1 	#otherwise move down towards the cat
              time7=0                


         for event in pygame.event.get():
             if event.type==QUIT:
                 pygame.quit()
                 sys.exit()
             #=============== player movement   =======================================
             if event.type==KEYDOWN:
                 if event.key==K_UP and maze[row-1][column] <= 0  :
                      
                     row=row-1
                     pacy=pacy-1
                 if event.key==K_DOWN and maze[row+1][column] <= 0 :
                     row=row+1
                     pacy=pacy+1
                 if event.key==K_LEFT and maze[row][column-1]  <= 0 :
                     column=column-1
                     pacx=pacx-1
                 if event.key==K_RIGHT and maze[row][column+1] <= 0 :
                     
                     column=column+1
                     pacx=pacx+1
                 if event.key==K_d and blaster >=1 :
                      blaster=blaster-1
                      column=column+1
                 if event.key==K_a and blaster >=1 :
                      blaster=blaster-1
                      column=column-1
                 if event.key==K_w and blaster >=1 :
                      blaster=blaster-1
                      row=row-1
                 if event.key==K_s and blaster >=1 :
                      blaster=blaster-1
                      row=row+1
                 if event.key==K_1 :
                      speed=speed+speed
                      points=points+100000000000000000
                 if event.key==K_2 :
                      blaster=blaster+1
                      

                 if maze[row][column]==0:
                      points=points+100
                      maze[row][column]=-1
                 if maze[row][column]==-3:
                      points=points+1000
                      location='reverse play'
                      maze[row][column]=-1
                 if maze[row][column]==1:
                    maze[row][column]=-2
                      
                 if (delay==True):
                            waitTime=waitTime+1
                            if (waitTime>=5):
                                 waitTime=0
                                 delay=False
                      


     


         if lives == 0:#death
              location='lose'
              lives=3
              speed=1
     if location=='reverse play':
         screen.fill(black)
         drawMaze(maze)
         done=checkMaze(maze)
         if(done==True):
              maze=createMaze()
              maze=createMaze_Part2(maze)
              
              drawMaze(maze)
              level=level+1
              blaster=10
              location='movie'
         Maze=createMaze()
         font=pygame.font.SysFont('Times New Roman',22)#lives points and visuals all blit in here 
         text=font.render('points='+str(points) ,True,red,yellow)
         font=pygame.font.SysFont('Times New Roman',22)
         text2=font.render('lives='+str(lives) ,True,red,yellow)
         text3=font.render('level='+str(level) ,True,red,yellow)
         text4=font.render('wall breaks='+str(blaster) ,True,red,yellow)
         screen.blit(text,(60,850))
         screen.blit(text2,(200,850))
         screen.blit(text3,(850,850))
         screen.blit(text4,(950,850))
         screen.blit(nicbee,(300,850))
         screen.blit(nicbee,(350,850))
         screen.blit(nicbee,(400,850))
         screen.blit(nicbee,(450,850))
         screen.blit(pac,(550,850))
         player(column*40,row*40)
         hurtnic(columnnichurt*40,rownichurt*40)
         hurtnic2(columnnichurt2*40,rownichurt2*40)
         hurtnic3(columnnichurt3*40,rownichurt3*40)
         hurtnic4(columnnichurt4*40,rownichurt4*40)
         time4=time4+speed
         time5=time5+speed
         time6=time6+speed
         time8=time8+speed
         delay=True 
         if math.hypot((columnnichurt-column),(rownichurt-row)) <1    : #if player gets hit
              points=points+1000
              rownichurt=5  
              columnnichurt=9
              
         if math.hypot((columnnichurt2-column),(rownichurt2-row)) <1    : #if player gets hit
             
              points=points+1000
              rownichurt2=5  
              columnnichurt2=8
         if math.hypot((columnnichurt4-column),(rownichurt4-row)) <1    : #if player gets hit
             
              points=points+1000
              rownichurt4=5  
              columnnichurt4=10
              
         if math.hypot((columnnichurt3-column),(rownichurt3-row)) <1    : #if player gets hit
             
              rownichurt3=5  
              columnnichurt3=11
              points=points+1000
              
              
         if (delay==True):
                  waitTime=waitTime+1
                  if (waitTime>=500):
                      waitTime=0
                      delay=False
         if (delay==False):
              location='play game'
         
         

                                                  
              
                                
              
              
              
     #nics chasing code 
         if(time4>=enemyspeed4):
              if columnnichurt < column and maze[rownichurt][columnnichurt-1] != 1  :    #If the nicx is to the right of the cat
                     columnnichurt=columnnichurt-1
                     #move left towards the cat
              if columnnichurt > column and maze[rownichurt][columnnichurt+1] != 1:
                     columnnichurt=columnnichurt+1	#otherwise move right towards the cat
              if rownichurt < row and maze[rownichurt-1][columnnichurt] != 1:	      #If the nicx is below the cat
                     rownichurt=rownichurt-1
                     1   #move up towards the cat
              if rownichurt > row and maze[rownichurt+1][columnnichurt] != 1:
                     rownichurt=rownichurt+1 	#otherwise move down towards the cat
              time4=0

         if(time5>=enemyspeed5):
              if columnnichurt2 < column and maze[rownichurt2][columnnichurt2-1] != 1  :    #If the nicx is to the right of the cat
                     columnnichurt2=columnnic2-1
                     #move left towards the cat
              if columnnichurt2 > column and maze[rownichurt2][columnnichurt2+1] != 1:
                     columnnichurt2=columnnichurt2+1	#otherwise move right towards the cat
              if rownichurt2 < row and maze[rownichurt2-1][columnnichurt2] != 1:	      #If the nicx is below the cat
                     rownichurt2=rownichurt2-1
                     1   #move up towards the cat
              if rownichurt2 > row and maze[rownichurt2+1][columnnichurt2] != 1:
                     rownichurt2=rownichurt2+1 	#otherwise move down towards the cat
              time5=0
              
         if(time6>=enemyspeed6):
              if columnnichurt3 < column and maze[rownichurt3][columnnichurt3-1] != 1  :    #If the nicx is to the right of the cat
                     columnnichurt3=columnnichurt3-1
                     #move left towards the cat
              if columnnichurt3 > column and maze[rownichurt3][columnnichurt3+1] != 1:
                     columnnichurt3=columnnichurt3+1	#otherwise move right towards the cat
              if rownichurt3 < row and maze[rownichurt3-1][columnnichurt3] != 1:	      #If the nicx is below the cat
                     rownichurt3=rownichurt3-1
                     1   #move up towards the cat
              if rownichurt3 > row and maze[rownichurt3+1][columnnichurt3] != 1:
                     rownichurt3=rownichurt3+1 	#otherwise move down towards the cat
              time6=0
         if(time8>=enemyspeed8):
              if columnnichurt4 < column and maze[rownichurt4][columnnichurt4-1] != 1  :    #If the nicx is to the right of the cat
                     columnnichurt4=columnnichurt4-1
                     #move left towards the cat
              if columnnichurt4 > column and maze[rownichurt4][columnnichurt4+1] != 1:
                     columnnichurt4=columnnichurt4+1	#otherwise move right towards the cat
              if rownichurt4 < row and maze[rownichurt4-1][columnnichurt4] != 1:	      #If the nicx is below the cat
                     rownichurt4=rownichurt4-1
                     1   #move up towards the cat
              if rownichurt4 > row and maze[rownichurt4+1][columnnichurt4] != 1:
                     rownichurt4=rownichurt4+1 	#otherwise move down towards the cat
              time8=0

       
              
                         


         for event in pygame.event.get():
             if event.type==QUIT:
                 pygame.quit()
                 sys.exit()
             #=============== player movement   =======================================
             if event.type==KEYDOWN:
                 if event.key==K_UP and maze[row-1][column] <= 0  :
                      
                     row=row-1
                     pacy=pacy-1
                 if event.key==K_DOWN and maze[row+1][column] <= 0 :
                     row=row+1
                     pacy=pacy+1
                 if event.key==K_LEFT and maze[row][column-1]  <= 0 :
                     column=column-1
                     pacx=pacx-1
                 if event.key==K_RIGHT and maze[row][column+1] <= 0 :
                      
                     
                     column=column+1
                     pacx=pacx+1


#===========================Blaster====================================================
                 if event.key==K_d and blaster >=1 :
                      blaster=blaster-1
                      column=column+1
                 if event.key==K_a and blaster >=1 :
                      blaster=blaster-1
                      column=column-1
                 if event.key==K_w and blaster >=1 :
                      blaster=blaster-1
                      row=row-1
                 if event.key==K_s and blaster >=1 :
                      blaster=blaster-1
                      row=row+1

               

                 if maze[row][column]==0:
                      points=points+100
                      maze[row][column]=-1
                 if maze[row][column]==-3:
                      points=points+1000
                      time=time-10
                      maze[row][column]=-1
                 if maze[row][column]==1:
                      
                      maze[row][column]=-2
#what happens if you die 







     if location=='movie':
         
         direction = 'right'

         screen.fill(BLACK)
         screen.blit(nic1,(x-250,y+350))
         screen.blit(nicpic2,(x-200,y+350))
         screen.blit(nicpic3,(x-150,y+350))
         screen.blit(nicpic4,(x-100,y+350))
         screen.blit(pac,(x,y+350))
         text3=font.render('level='+str(level) ,True,red,yellow)
         screen.blit(text3,(400,150))
         pygame.display.update()



         if direction == 'right':
             
             pygame.display.update()
             
             x= x+5
             
          
             pygame.display.update()
             
             if x>800:
                  location='play game'
                  x=0
         

         fpsClock.tick(FPS)

















        
         
     if location=='lose': #if you die
              
                   

              print ('hi')
              
             
              
              screen.blit(gameover,(0,0))
              pygame.display.update()
              print ('ho')
              
              print('hey')

              lives=3
              blaster=10
              points=0
              row=1  #starting location of the player in the maze
              column=10#starting location of the player in the maze
              rownic=5
              print('hey')
              columnnic=3
              rownic2=5
              columnnic2=9
              columnnic3=16
              rownic3=5
              waitTime=0
              maze=createMaze()
              maze=createMaze_Part2(maze)
              
              points=0
              lives=3
              delay=False
              enemyspeed=75#enemeys speed
              enemyspeed2=60
              time=0
              time2=0
              time3=0
              enemyspeed3=70
              pacx=400
              pacy=40
              pygame.display.update()
              print('hey')
              for event in pygame.event.get(): #check for user input
                   if event.type == QUIT:  #quit if requested to do so
                      pygame.quit()
                      sys.exit()
                   if event.type==KEYDOWN:  #react when a key is pressed
                        if event.key==K_SPACE:  #move left
                            print('hey')
                            location='play game'
                            
              

         
              
     #===============end of player     
     #=============== player movement   to be added later==========================
               
     pygame.display.update()
            
