#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main() {
    string s;
    cin >> s;

    vector<int> iArray(26, -1);
    for (int i = 0; i < s.length(); i++) {
        char cChar = s[i];

        if (iArray[cChar - 'a'] == -1) {
            iArray[cChar - 'a'] = i;
        }
    }
    for (int i = 0; i < 26; i++) {
        cout << iArray[i] << " ";
    }

    return 0;
}