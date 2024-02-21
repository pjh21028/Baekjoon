#include <iostream>
#include <sstream>

using namespace std;

int main() {
    int iMax = 0, iRow = 1, iColumn = 1;

    for (int i = 1; i <= 9; i++) {
        string line;
        getline(cin, line);
        stringstream ss(line);
        for (int j = 1; j <= 9; j++) {
            int iNum;
            ss >> iNum;
            if (iNum > iMax) {
                iMax = iNum;
                iRow = i;
                iColumn = j;
            }
        }
    }

    cout << iMax << endl;
    cout << iRow << " " << iColumn << endl;

    return 0;
}