#turtle 모듈 사용하기
#모듈 종류는 turtle, random, time, calender, numpy, pandas 등등 매우 많음
import turtle

turtle.shape("turtle")

#삼각형
turtle.forward(200)
turtle.left(120) #왼쪽 120도
turtle.forward(200)
turtle.left(120) #왼쪽 120도
turtle.forward(200)
turtle.left(120) #왼쪽 120도

#사각형
turtle.forward(200)
turtle.right(90)
turtle.forward(200)
turtle.right(90)
turtle.forward(200)
turtle.right(90)
turtle.forward(200)
turtle.right(90)

#별
#별을 그릴 때는 360도를 2번 도는 것임
#720도/5개 꼭지점 = 144
turtle.forward(200)
turtle.right(144)
turtle.forward(200)
turtle.right(144)
turtle.forward(200)
turtle.right(144)
turtle.forward(200)
turtle.right(144)
turtle.forward(200)
turtle.right(144)


#module 간소화 사용하기
import turtle as t

t.shape("turtle")

#삼각형
t.forward(200)
t.left(120) #왼쪽 120도
t.forward(200)
t.left(120) #왼쪽 120도
t.forward(200)
t.left(120) #왼쪽 120도
