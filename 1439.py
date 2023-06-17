import sys
input = sys.stdin.readline
txt = list(map(int, list(input().rstrip())))

def count(tar) :
    cnt = 0
    flag = 0
    for num in txt :
        if flag == 0 and num != tar :
            flag = 1
            cnt += 1
        elif num == tar :
            flag = 0
    return (cnt)

print(min(count(0), count(1)))
