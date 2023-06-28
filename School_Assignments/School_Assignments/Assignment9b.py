#import other files 
import pygame, sys, random, math
from pygame.locals import *

pygame.init()
#load images and set up clock
catImg = pygame.image.load('Fish.png')
dogImg = pygame.image.load('Tom.png')
FPS = 30 # frames per second setting
fpsClock = pygame.time.Clock()

# set up the window
screen = pygame.display.set_mode((1200, 700), 0, 32)
pygame.display.set_caption('Animation')
# create colours
WHITE = (255, 255, 255)
RED=(255,0,0)
#set up starting location of the cat
Fishx = 500
Fishy = 610
Sharkx = 0
Sharky = 0
con=1
count=0

while (con==1): # the main game loop
        screen.fill(WHITE)
        screen.blit(catImg, (Fishx, Fishy))
        screen.blit(dogImg, (Sharkx, Sharky))
    
        if (count==3):
                con=2
        pygame.draw.line(screen,RED,[Fishx,Fishy],[Sharkx,Sharky],2)
        if math.hypot((Fishx-Sharkx),(Fishy-Sharky))<100:
            Fishx=0
            Fishy=610
            count=count+1
        Sharky=Sharky+5

        if Sharky >900:
            Sharky=0
            Sharkx=random.randint(10,900)
        


        for event in pygame.event.get(): #check for user input
            if event.type == QUIT:  #quit if requested to do so
                pygame.quit()
                sys.exit()
            if event.type==KEYDOWN:  #react when a key is pressed
                if event.key==K_LEFT:  #move left
                    Fishx=Fishx-30
                elif event.key==K_RIGHT:   #move   right
                    Fishx=Fishx+30
        
        pygame.display.update()   #show image in new location
        fpsClock.tick(FPS)   #pause the program
