#include <iostream>
#include <string>
using namespace std;

int main() {
    string sString;
    getline(cin, sString);
    int iCount = 0;

    for (int i = 0; i < sString.length(); i++) {
        switch (sString[i]) {
            case 'A': case 'B': case 'C':
                iCount += 3;
                break;

            case 'D': case 'E': case 'F':
                iCount += 4;
                break;

            case 'G': case 'H': case 'I':
                iCount += 5;
                break;

            case 'J': case 'K': case 'L':
                iCount += 6;
                break;

            case 'M': case 'N': case 'O':
                iCount += 7;
                break;

            case 'P': case 'Q': case 'R': case 'S':
                iCount += 8;
                break;

            case 'T': case 'U': case 'V':
                iCount += 9;
                break;

            case 'W': case 'X': case 'Y': case 'Z':
                iCount += 10;
                break;
        }
    }

    cout << iCount;

    return 0;
}