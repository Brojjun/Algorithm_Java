#include <iostream>
#include <vector>
#include <algorithm>


using namespace std;

int main() {
	int n; cin >> n;
	vector<pair<int, int>> data;

	for (int i = 0; i < n; i++) {
		int a, b; cin >> b >> a;
		data.push_back(pair<int,int>(a,b));
	}
	sort(data.begin(), data.end());

	
	int count = 0;
	int check = 0;
	for (int i = 0; i < n; i++) {
		if (check <= data[i].second) {
			count++;
			//cout << data[i].second << "   2   " << data[i].second << endl;
			check = data[i].first;
		}
	}
	cout << count;
	
	return 0;
}