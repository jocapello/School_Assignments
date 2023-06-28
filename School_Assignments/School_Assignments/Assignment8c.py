import pygame, sys, math,time
from pygame.locals import *
pygame.init()
screen=pygame.display.set_mode((1920,1080))

Directed=pygame.image.load('Directed by.png').convert()

FPS = 30 # frames per second setting
fpsClock = pygame.time.Clock()

#colours
GREEN = (0,255,0)
BLUE = (0,0,128)
WHITE = (255,255,255)

dotdirectionX=100
dotdirectionY=0
dotdirection='right'
Shark5x=0
Shark4x=0
BackwardsX=1800
BackwardsY=400
Fishx2=0
y=0
x=0
Shark2x=0
Shark3x=0
Shark3y=0
Fishx=1500
Shark2y=450
Fishy=500
test=False
direction = 'Right1'
direction3 = 'left'
scene=1
Fishyyy=0
Far=1900
Shark4y=550
Shark5y=100
whichfish=1

Dot3=pygame.image.load('Dot3.png')
Eat=pygame.image.load('Eat2.jpg')
Shark=pygame.image.load('Shark.png')
Dot=pygame.image.load('Dot.png')
Fish2=pygame.image.load('Fish2.png')
Fish=pygame.image.load('Fish.png')
back=pygame.image.load('Ocean.png')
Shark2=pygame.image.load('Shark2.png')
Shark3=pygame.image.load('Shark2.png')
Lost=pygame.image.load('Lost.jpg')

GREY=(50,50,50)
BLUE=(28,83,174)
WHITE=(0,0,0)
counter=0
while True: # the main game loop      

 
    if scene==1:
        screen.blit(Directed,(0,0))
        screen.blit(Dot,(x-60,y+2))
        if direction == 'Right1':
                x = x+20
                if x>1900:
                    scene=3
                    direction='left'
    
    if scene==3:  #happy fish swims towards shark
            screen.blit(back,(0,0))
        #Shark
            screen.blit(Shark3,(Shark2x-150,Shark2y+250))
            screen.blit(Shark3,(Shark2x-200,Shark2y-300))
            screen.blit(Shark2,(Shark2x,Shark2y))
            if direction == 'left':
                Shark2x = Shark2x-5
            if Shark2x<100:
                    direction='right'
            if direction == 'right':
                Shark2x = Shark2x+5  
            if Shark2x>1600:
                    direction='left'
                    
        #Fish
            
            screen.blit(Fish,(Fishx,Fishy))
            
            if direction3 == 'left':
                Fishx = Fishx-5
                
            if math.hypot((Shark2x-Fishx),(Shark2y-Fishy))<500:
                    scene=4
                    direction3 = 'right'
                    Fishyyy==1
         
                   
            
                    
             
    if scene==4:  #unhappy fish swims away from shark
            screen.blit(back,(0,0))
            screen.blit(Shark3,(Shark2x-150,Shark2y+250))
            screen.blit(Shark3,(Shark2x-200,Shark2y-300))
            screen.blit(Shark2,(Shark2x,Shark2y))
            font = pygame.font.SysFont('Times New Roman', 32)
            text1 = font.render('SHARKS!!!', True, GREEN, BLUE)
            screen.blit(text1,(1200,450))
            
            if direction == 'right':
                Shark2x = Shark2x+5  
            if Shark2x>1600:
                screen.blit(Fish2,(Fishx,Fishy))
            if direction3 == 'right':
                screen.blit(Fish2,(Fishx,Fishy)) 
                Fishx = Fishx+10
            if Fishx > 2000:
                scene = 5
                direction3 = 'right'
                
    if scene==5: #fish gets lost 
        screen.blit(Lost,(0,0))
        screen.blit(Fish2,(Fishx2,Fishy))  
        if Fishx2 < 1000:
                font = pygame.font.SysFont('Times New Roman', 32)
                text1 = font.render('Oh no, Im lost!', True, GREEN, BLUE)
                screen.blit(text1,(1200,450))
        if Fishx2 > 650:
                font = pygame.font.SysFont('Times New Roman', 32)
                text1 = font.render('How will I get home?', True, GREEN, BLUE)
                screen.blit(text1,(1200,450))
                
        if direction3 == 'right':
            screen.blit(Fish2,(Fishx2,Fishy)) 
            Fishx2 = Fishx2+5 
        if Fishx2 > 900:
            direction3 = 'stop'
            scene = 6
            Shark2x = -300
            Shark3x = -300
            Shark2y = 550
            
    if scene == 6:
        
        screen.blit(Lost,(0,0))
        screen.blit(Fish2,(Fishx2,Fishy))
        screen.blit(Shark3,(Shark5x-200,Shark5y))
        screen.blit(Shark2,(Shark4x-200,Shark4y))
        screen.blit(Shark,(BackwardsX,BackwardsY))
        Shark5x = Shark5x+5
        Shark4x = Shark4x+5
        BackwardsX = BackwardsX-5
        if Shark5x > 500:
            Shark5x=Shark5x-5
        if Shark4x > 500:
            Shark4x=Shark4x-5
        if BackwardsX < 1300:
            BackwardsX = BackwardsX+5
            scene = 7
    if scene == 7:
        screen.blit(Lost,(0,0))
        screen.blit(Shark3,(Shark5x-200,Shark5y))
        screen.blit(Shark2,(Shark4x-200,Shark4y))
        screen.blit(Shark,(BackwardsX,BackwardsY))
        if whichfish==1:
             screen.blit(Fish,(Fishx2,Fishy))
             whichfish=2
        else:
             screen.blit(Fish2,(Fishx2,Fishy))
             whichfish=1
        time.sleep(0.3)
        font = pygame.font.SysFont('Times New Roman', 60)
        text1 = font.render('Please let me go', True, GREEN, BLUE)
        screen.blit(text1,(1000,250))
        if dotdirection == 'right':
            dotdirectionX = dotdirectionX+25
        if dotdirectionX >= 500:
            dotdirection = 'left'
        if dotdirection == 'left':
            dotdirectionX = dotdirectionX-25
            scene = 8
    if scene ==8:
        counter=counter+1
            
        screen.blit(Dot3,(dotdirectionX,dotdirectionY))
        if dotdirection == 'left':
            dotdirectionX = dotdirectionX-25
        screen.blit(Lost,(0,0))
        screen.blit(Fish2,(Fishx2,Fishy))
        screen.blit(Shark3,(Shark5x-200,Shark5y))
        screen.blit(Shark2,(Shark4x-200,Shark4y))
        screen.blit(Shark,(BackwardsX,BackwardsY))
  
        if counter>=3*FPS:
        
            font = pygame.font.SysFont('Times New Roman', 60)
            text1 = font.render('Cant we be friends', True, GREEN, BLUE)
            screen.blit(text1,(1300,250))
            pygame.display.update()
            direction = 'right'
            scene = 9
            time.sleep(2)
            counter=0
    if scene ==9:
        screen.blit(Lost,(0,0))
        screen.blit(Fish2,(Fishx2,Fishy))
        screen.blit(Shark3,(Shark5x-200,Shark5y))
        screen.blit(Shark2,(Shark4x-200,Shark4y))
        screen.blit(Shark,(BackwardsX,BackwardsY))
        screen.blit(Dot3,(dotdirectionX,dotdirectionY))
        if dotdirectionX < 0:
            font = pygame.font.SysFont('Times New Roman', 80)
            text1 = font.render('Just kidding', True, GREEN, BLUE)
            screen.blit(text1,(1300,250))
            counter=counter+1
            if counter>=3*FPS:
                scene = 10
    if scene ==10:
        screen.blit(Eat,(0,0))
            

 

                
    for event in pygame.event.get():
         if event.type == QUIT:
            pygame.quit()
            sys.exit()
    pygame.display.update()
    fpsClock.tick(FPS)  
