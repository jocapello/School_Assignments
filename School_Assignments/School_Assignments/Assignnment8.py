import pygame, sys
from pygame.locals import *
pygame.init()
screen=pygame.display.set_mode((1100,900))

pic=pygame.image.load('PIC.jpg').convert()

FPS = 30 # frames per second setting
fpsClock = pygame.time.Clock()

RED=(255,0,0)
BLUE=(0,0,255)
BLACK=(0,0,0)
WHITE=(255,255,255)
GREEN=(0,255,0)
YELLOW=(255, 255,   0)
RANDOM=(121,96,47)

#4. Initialize the starting location and direction of your object.
x = 10
y = 100
direction = 'down'

while True: # the main game loop
     screen.fill(WHITE)     # erase
     pygame.draw.circle(screen,RANDOM,(x,y),100)    #draw
     if direction == 'right':
         x = x+5  #move to the right
         y = y+5
         if y>800:
              direction='up'
     if direction == 'up':
         x = x-5  #move to the right
         y = y-5
         if y<100:
             direction='down'
     if direction == 'down':
         x = x+10  #move to the right
         y = y+5
         if x>1100:
             direction='up'

        
     for event in pygame.event.get():
         if event.type == QUIT:
            pygame.quit()
            sys.exit()
     pygame.display.update()
     fpsClock.tick(FPS)  
