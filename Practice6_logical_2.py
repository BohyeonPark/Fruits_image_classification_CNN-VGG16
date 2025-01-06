#관계 연산을 이용한 전기 기본 요금 계산
#논리 값 True와 False를 각각 1과 0으로 산술 연산에 활용

usage = float(input("가정의 전기 사용량(kWh)은 >>"))

less200 = usage <= 200
less400 = 200 < usage <= 400
greater400 = 400 < usage

base = 730*less200 + 1260*less400 + 6060*greater400
print("전기 사용량(kw): %d, 기본요금(원): %d" % (usage, base))
