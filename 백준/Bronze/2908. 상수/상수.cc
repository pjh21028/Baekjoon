#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main() {
    string input;
    getline(cin, input);

    // 입력된 문자열을 공백을 기준으로 나누기
    size_t pos = input.find(' ');
    string num1_str = input.substr(0, pos);
    string num2_str = input.substr(pos + 1);

    // 문자열을 뒤집고 정수로 변환
    reverse(num1_str.begin(), num1_str.end());
    reverse(num2_str.begin(), num2_str.end());
    int num1 = stoi(num1_str);
    int num2 = stoi(num2_str);

    // 큰 수 출력
    if (num1 > num2) {
        cout << num1;
    } else {
        cout << num2;
    }

    return 0;
}