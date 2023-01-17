#include<iostream>
#include<stdio.h>
using namespace std;

int main(int argc, char** argv)
{
	int test_case;
	int T = 10;
	
	//freopen("input.txt", "r", stdin);
	
	for (test_case = 1; test_case <= T; ++test_case)
	{
		int map[101][101] = { 0 };
		int n, c;
		cin >> c;
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < c; j++) {
				cin >> n;
				map[i][j] = n;
			}
		}
		int deadlock = 0;
		for (int i = 0; i < c; i++) {
			bool flag = 0;

			for (int j = 0; j < c; j++) {
				if (map[j][i] == 1)
					flag = 1;
				else if (map[j][i] == 2 && flag == 1) {
					flag = 0;
					deadlock++;
				}
			}
		}
		cout << "#" << test_case << " " << deadlock << endl;

	}
	return 0;//정상종료시 반드시 0을 리턴해야합니다.
}