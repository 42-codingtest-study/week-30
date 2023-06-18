# 10강 _ 정수 삼각형

n = int(input())
rec = [0] * 1001
rec[1] = 1

if n >= 2:
    rec[2] = 3
    for i in range(3, n + 1) :
        rec[i] = (rec[i - 2] * 2) + rec[i - 1]

print(rec[n] % 10_007)