import pygame, sys
from pygame.locals import *
pygame.init()
screen=pygame.display.set_mode((1920,1080))

back=pygame.image.load('Ocean.png').convert()

FPS = 30 # frames per second setting
fpsClock = pygame.time.Clock()

x=0
direction = 'left'
Fish=pygame.image.load('Fish.png')

BLUE=(28,83,174)

while True: # the main game loop

    screen.blit(back,(0,0))

#Fish
    screen.blit(Fish,(x,200))

#Move
    if direction == 'left':
        x = x-5
        if x<100:
            direction='right'
    if direction == 'right':
        x = x+5  
        if x>1600:
            direction='left'
        

    for event in pygame.event.get():
         if event.type == QUIT:
            pygame.quit()
            sys.exit()
    pygame.display.update()
    fpsClock.tick(FPS)  
