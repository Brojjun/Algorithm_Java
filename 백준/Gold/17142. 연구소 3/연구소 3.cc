#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>

using namespace std;

struct virus {
	int y = 0;
	int x = 0;
	int time = 0;
};

int realmap[51][51] = { 0 };
int map[51][51];
int bn, bm;
vector<virus>virusMAP;

int minT = 100030;
bool visited[50] = { 0 };
int dy[4] = { 0,0,1,-1 };
int dx[4] = { 1,-1,0,0 };

void input() {
	cin >> bn >> bm;
	for (int i = 0; i < bn; i++) {
		for (int j = 0; j < bn; j++) {
			cin >> realmap[i][j];
			if (realmap[i][j] == 2) {
				virusMAP.push_back({ i,j,0 });
				realmap[i][j] = -2;
			}
			else if (realmap[i][j] == 1)
				realmap[i][j] = -1;
		}
	}
}

void print() {
	for (int i = 0; i < bn; i++) {
		for (int j = 0; j < bn; j++) {
			cout << map[i][j] << " ";
		}
		cout << "\n";
	}
	cout << "\n\n\n\n";
}
//bfs를 통한 확장
int gameStart() {
	queue<virus>arr;
	int lastTime = 0;
	for (int i = 0; i < virusMAP.size(); i++) {
		if (visited[i] == 1) {
			arr.push(virusMAP[i]);
			map[virusMAP[i].y][virusMAP[i].x] = -3;
		}
	}
	while (!arr.empty()) {
		virus nvr = arr.front();
		arr.pop();
		for (int i = 0; i < 4; i++) {
			int nx = nvr.x + dx[i];
			int ny = nvr.y + dy[i];
			int nt = nvr.time + 1;
			if (ny < 0 || nx < 0 || ny >= bn || nx >= bn)
				continue;
			if (map[ny][nx] == -2) {
				map[ny][nx] = -3;
				arr.push({ ny,nx,nt });
			}
			else if (map[ny][nx] == 0 ) {
				map[ny][nx] = nt;
				lastTime = max(lastTime, nt);
				arr.push({ ny,nx,nt });
			}
		}
	}
	return lastTime;
}
//탐색안한 0이 있는지 확인
bool check() {
	int maxTime = 0;
	for (int i = 0; i < bn; i++) {
		for (int j = 0; j < bn; j++) {
			maxTime = max(maxTime, map[i][j]);
			if (map[i][j] == 0) 
				return 1;
		}
	}
	return 0;
}
//dfs통해 순열
void simulation(int n = 0, int cnt = 0) {
	if (cnt >= bm) {
		copy(&realmap[0][0], &realmap[0][0] + 51 * 51, &map[0][0]);
		int timing = gameStart();
		if (check()) return;
		minT = min(minT, timing);
	}
	else {
		for (int i = n; i < virusMAP.size(); i++) {
			if (visited[i] == 1)
				continue;
			visited[i] = 1;
			simulation(i, cnt + 1);
			visited[i] = 0;
		}
	}
}
int main(void) {
	input();
	
	simulation();
	if (minT > 100000)
		cout << "-1";
	else	
		cout << minT;

	return 0;
}