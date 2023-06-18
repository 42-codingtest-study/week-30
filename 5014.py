# bfs 푸는법 잊어먹을까바,,

import sys
from collections import deque
input = sys.stdin.readline

F, S, G, U, D = map(int, input().split())
visited = [False for _ in range (F + 1)]
count = [0 for _ in range (F + 1)]

def bfs(start) :
	q = deque()
	q.append(start)
	visited[start] = True
	
	while q :
		v = q.popleft()
		if v == G :
			return count[G]
		for i in (v + U, v - D) :
			if 0 < i <= F and visited[i] == False :
				visited[i] = True
				count[i] = count[v] + 1
				q.append(i)
	if count[G] == 0:
		return "use the stairs"

print(bfs(S))