#include <iostream>
using namespace std;

int main() {
	for (int i = 0; i < 3; i++) {
		int iNum1, iNum2, iNum3, iNum4, iSum;
        
		cin >> iNum1 >> iNum2 >> iNum3 >> iNum4;
		iSum = iNum1 + iNum2 + iNum3 + iNum4;
        
		if (iSum == 0)
            cout << 'D' << endl;
		else if (iSum == 1) 
            cout << 'C' << endl;
		else if (iSum == 2)
            cout << 'B' << endl;
		else if (iSum == 3)
            cout << 'A' << endl;
		else if (iSum == 4) 
            cout << 'E' << endl;
	}
}