import pygame, sys
from pygame.locals import *
pygame.init()
screen=pygame.display.set_mode((1920,1300))

#2. Declare any colours that you wish to use

RED=(255,0,0)
BLUE=(0,0,255)
BLACK=(0,0,0)
WHITE=(255,255,255)
GREEN=(0,255,0)
YELLOW=(255, 255,   0)
PINK=(255,0,255)

#3. Draw things
screen.fill(GREEN)
pygame.draw.rect(screen, BLUE,[635,500,50,90],15)#rectangle
circle=pygame.draw.circle(screen, YELLOW,(850,550),40)  # head
pygame.draw.ellipse(screen, BLACK,[500,500,50,90],25)  # elipse
pygame.draw.polygon(screen, WHITE    ,[[750,500],[750,600],[800,600],[750,500]], 5)
pygame.draw.rect(screen, RED,[900,550,50,50],10)
pygame.draw.polygon(screen, PINK    ,[[1000,550],[850,900],[1000,1250],[1150,950]], 5)


pygame.display.update()  #update image


#4. Add a loop so that the screen stays visible until you click the x to close the program

while True:
    for event in pygame.event.get():
        if event.type==QUIT:
            pygame.quit()
            sys.exit()
