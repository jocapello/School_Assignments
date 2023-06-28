import pygame, sys,random
from pygame.locals import *
pygame.init()
screen=pygame.display.set_mode((1920,1080))
def Fish_1(x,y,r):
    RCOLOR=(r,r,r)  
    pygame.draw.polygon(screen,RCOLOR,[[300+x,675+y],[300+x,725+y],[350+x,700+y],[300+x,675+y]])
    pygame.draw.ellipse(screen, RCOLOR,[350+x,675+y,90,50])
    
def Fish_2(r,w,z):
    RCOLOR=(r,r,r) 
    pygame.draw.polygon(screen,RCOLOR, [[1400+z,150+w],[1400+z,200+w],[1350+z,175+w],[1400+z,150+w]])
    pygame.draw.ellipse(screen, RCOLOR,[1275+z,150+w,90,50])
def Starfish(x,y,r):
    pygame.draw.line(screen, GREEN,[1000+x,990+y],[1110+x,1090+y],25)
    pygame.draw.line(screen, GREEN,[1000+x,1090+y],[1080+x,990+y],25)
    pygame.draw.line(screen, GREEN,[1045+x,1030+y],[1050+x,1090+y],25)
def Shark(x,y,r):
    pygame.draw.ellipse(screen, GREY,[450+x,520+y,500,175])  # elipse
    pygame.draw.polygon(screen,GREY,[[350+x,500+y],[350+x,750+y],[500+x,600+y],[350+x,500+y]])
    pygame.draw.polygon(screen,GREY,[[775+x,550+y],[650+x,375+y],[650+x,550+y],[750+x,550+y]])
    pygame.draw.polygon(screen,GREY,[[800+x,680+y],[700+x,800+y],[700+x,680+y],[800+x,680+y]])
    circle=pygame.draw.circle(screen, WHITE,(875+x,575+y),5)  # head
    pygame.draw.arc(screen, WHITE,(870+x,600+y,80,40),3.14,6.28,3) #mouth
def Nemo(x,y,r):
    pygame.draw.polygon(screen,BLACK,[[300+x,675+y],[300+x,725+y],[350+x,700+y],[300+x,675+y]])
    pygame.draw.ellipse(screen, BLACK,[350+x,675+y,90,50])
    pygame.draw.line(screen, ORANGE,[310+x,680+y],[310+x,720+y],5)
    pygame.draw.line(screen, ORANGE,[320+x,685+y],[320+x,715+y],5)
    pygame.draw.line(screen, ORANGE,[330+x,690+y],[330+x,710+y],5)
    pygame.draw.line(screen, ORANGE,[340+x,695+y],[340+x,705+y],5)
    pygame.draw.line(screen, ORANGE,[360+x,685+y],[360+x,715+y],5)
    pygame.draw.line(screen, ORANGE,[370+x,680+y],[370+x,720+y],5)
    pygame.draw.line(screen, ORANGE,[380+x,675+y],[380+x,725+y],5)
    pygame.draw.line(screen, ORANGE,[390+x,675+y],[390+x,725+y],5)
    pygame.draw.line(screen, ORANGE,[400+x,675+y],[400+x,725+y],5)
    pygame.draw.line(screen, ORANGE,[410+x,675+y],[410+x,725+y],5)
    pygame.draw.line(screen, ORANGE,[420+x,680+y],[420+x,720+y],5)
    pygame.draw.line(screen, ORANGE,[430+x,685+y],[430+x,715+y],5)
def Nemo_2(r,w,z):
    pygame.draw.polygon(screen,BLACK, [[1400+z,150+w],[1400+z,200+w],[1350+z,175+w],[1400+z,150+w]])
    pygame.draw.ellipse(screen, BLACK,[1275+z,150+w,90,50])
    pygame.draw.line(screen, ORANGE,[1400+z,150+w],[1400+z,200+w],5)
    pygame.draw.line(screen, ORANGE,[1390+z,155+w],[1390+z,195+w],5)
    pygame.draw.line(screen, ORANGE,[1380+z,160+w],[1380+z,190+w],5)
    pygame.draw.line(screen, ORANGE,[1370+z,165+w],[1370+z,185+w],5)
    pygame.draw.line(screen, ORANGE,[1360+z,165+w],[1360+z,185+w],5)
    pygame.draw.line(screen, ORANGE,[1350+z,155+w],[1350+z,195+w],5)
    pygame.draw.line(screen, ORANGE,[1340+z,150+w],[1340+z,200+w],5)
    pygame.draw.line(screen, ORANGE,[1330+z,150+w],[1330+z,200+w],5)
    pygame.draw.line(screen, ORANGE,[1320+z,150+w],[1320+z,200+w],5)
    pygame.draw.line(screen, ORANGE,[1310+z,150+w],[1310+z,200+w],5)
    pygame.draw.line(screen, ORANGE,[1300+z,150+w],[1300+z,200+w],5)
    pygame.draw.line(screen, ORANGE,[1290+z,155+w],[1290+z,195+w],5)



    
#Colours

RED=(255,0,0)
BLUE=(0,0,255)
BLACK=(0,0,0)
WHITE=(255,255,255)
GREEN=(0,100,0)
YELLOW=(255, 255,0)
PINK=(255,0,255)
LIME=(156,223,66)
LBLUE=(50,177,220)
GREY=(60,60,60)
ORANGE=(230,90,0)
#Back ground

screen.fill(LBLUE)
RCOLOR=0

#loops

for i in range (15):
#fish 1
    y=random.randint(-700,800)
    x=random.randint(-500,1000)
    r=random.randint(0,255)
    Fish_1(x,y,r)
for i in range (20):
#fish 2
    r=random.randint(0,255)  
    w=random.randint(-200,900)
    z=random.randint(-900,550)
    Fish_2(r,w,z)
for i in range(2):
    y=random.randint(-1200,1500)
    x=random.randint(-1500,1500)
    Shark(x,y,r)
for i in range(500):
    y=random.randint(0,0)
    x=random.randint(-1500,1500)
    Starfish(x,y,r)
for i in range(5):
    y=random.randint(-700,800)
    x=random.randint(-500,1000)
    Nemo(x,y,r)
for i in range(5):
    z=random.randint(0,255)
    w=random.randint(-200,900)
    Nemo_2(r,w,z)




#Don't touch

pygame.display.update()  #update image

while True:
    for event in pygame.event.get():
        if event.type==QUIT:
            pygame.quit()
            sys.exit()
