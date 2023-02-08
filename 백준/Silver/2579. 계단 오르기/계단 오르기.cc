#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int memo[305] = { 0 };
int dis[305] = { 0 };
int bn = 0;

void input() {
	cin >> bn;
	for (int i = 0; i < bn; i++) {
		cin >> dis[i];
	}
	memo[0] = dis[0];
	memo[1] = dis[0] + dis[1];
	memo[2] = max(dis[0] + dis[2], dis[1] + dis[2]);
}


int main(void) {
	input();
	for (int i = 3; i < bn; i++) {
		memo[i] = max(memo[i-3] + dis[i-1] + dis[i], memo[i - 2] +dis[i]);
	}
	/*
	cout << endl;
	for (int i = 0; i < bn; i++) {
		cout << memo[i] << endl;
	}
	*/
	cout << memo[bn - 1];
	return 0;
}