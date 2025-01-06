#input() 입력받기
#숫자 입력 시 int 정수형을 자료형 변환하기
name = input("이름을 입력하세요")
major = input("전공을 입력하세요")
year = int(input("출생년도를 입력하세요"))
age = 2023-year

print("안녕~ 만나서 반가워")
print("지금부터 내 소개를 시작할게")
print("내 이름은 %s이야" %name)
print("나는 %s전공이야~" %major)
print("그리고 나는 %d살이야" %age)
