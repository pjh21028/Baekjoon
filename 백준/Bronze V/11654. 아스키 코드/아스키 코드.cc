#include <iostream>
#include <string>
using namespace std;

int main() {
    std::string s;
    std::getline(std::cin, s);
    char c = s[0];
    std::cout << (int)c;
    return 0;
}