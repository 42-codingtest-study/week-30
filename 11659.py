# 10강 _ 구간 합 구하기 4

import sys
input = sys.stdin.readline

n, m = map(int,input().split())
idx = list(map(int, input().split()))
for i in range(n - 1):
    idx[i + 1] += idx[i]
idx = [0] + idx

for _ in range(m):
    a, b = map(int,input().split())
    print(idx[b] - idx[a - 1])