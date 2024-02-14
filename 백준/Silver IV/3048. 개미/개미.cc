#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;


int main() {
	int iNum1 = 0, iNum2 = 0, iCountTime = 0;
	int iTime;
    string sRightAnt, sLeftAnt, sAnt;

	cin >> iNum1 >> iNum2;
	cin >> sRightAnt;
	cin >> sLeftAnt;
	cin >> iTime;
	reverse(sRightAnt.begin(), sRightAnt.end());
	sAnt = sRightAnt + sLeftAnt;
    
	while (iCountTime < iTime) {
		for (int i = 0; i < iNum1 + iNum2 - 1; i++) { //CBADEF(RRRLLL)
			if (sRightAnt.find(sAnt[i]) != string::npos && sLeftAnt.find(sAnt[i + 1]) != string::npos) {
				swap(sAnt[i], sAnt[i + 1]);
				i++;
            }
		}
		iCountTime += 1;
	}
	cout << sAnt;
	
	return 0;
}