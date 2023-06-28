#import other files 
import pygame, sys
from pygame.locals import *

pygame.init()
#load images and set up clock
catImg = pygame.image.load('Fish.png')
FPS = 30 # frames per second setting
fpsClock = pygame.time.Clock()

# set up the window
screen = pygame.display.set_mode((1200, 700), 0, 32)
pygame.display.set_caption('Animation')
# create colours
WHITE = (255, 255, 255)
#set up starting location of the cat
catx = 10
caty = 10
while True: # the main game loop
     screen.fill(WHITE)			#display the background and the cat
     screen.blit(catImg, (catx, caty))
     #--------------------------------------------------------------
     for event in pygame.event.get(): #check for user input
         if event.type == QUIT:  #quit if requested to do so
            pygame.quit()
            sys.exit()
         if event.type==KEYDOWN:  #react when a key is pressed
              if event.key==K_LEFT:  #move left
                   catx=catx-10
              elif event.key==K_RIGHT:   #move   right
                   catx=catx+10
              elif event.key==K_UP:   #move   up
                   caty=caty-10
              elif event.key==K_DOWN:   #move  down
                   caty=caty+10
     pygame.display.update()   #show image in new location
     fpsClock.tick(FPS)   #pause the program
