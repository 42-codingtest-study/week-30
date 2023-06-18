for i in range (3):
    yut = list(map(int, input().split()))
    count = sum(yut)
    if count == 3:
        print('A')
    elif count == 2:
        print('B')
    elif count == 1:
        print('C')
    elif count == 0:
        print('D')
    elif count == 4:
        print('E')