import pygame, sys
from pygame.locals import *
pygame.init()
screen=pygame.display.set_mode((1920,1080))

RED=(255,0,0)
BLUE=(0,0,255)
BLACK=(0,0,0)
WHITE=(255,255,255)
GREEN=(0,255,0)
YELLOW=(255, 255,   0)
PINK=(255,0,255)

#road
screen.fill(PINK)
pygame.draw.line(screen, BLACK,[0,900],[1920,900],25)#rectangle
pygame.draw.line(screen, BLACK,[0,950],[1920,950],25)#rectangle
pygame.draw.line(screen, YELLOW,[0,925],[1920,925],20)#rectangle

#guy
pygame.draw.line(screen, BLACK,[900,600],[900,800],25)#BODY
pygame.draw.line(screen, BLACK,[900,800],[850,900],25)#LEG
pygame.draw.line(screen, BLACK,[900,800],[950,900],25)#LEG
pygame.draw.line(screen, BLACK,[900,650],[950,800],25)#ARM
pygame.draw.line(screen, BLACK,[900,650],[850,800],25)#ARM
circle=pygame.draw.circle(screen, BLACK,(900,600),40)  # head

#4. Add a loop so that the screen stays visible until you click the x to close the program

pygame.display.update()  #update image

