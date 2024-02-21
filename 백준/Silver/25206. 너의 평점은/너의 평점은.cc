#include <iostream>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main() {
    string sInputScoreArray[20];
    double dTotalSum = 0;
    double dScoreSum = 0;
    double dAverage;
    string sGradeArray[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
    double dGradeScoreArray[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

    for (int i = 0; i < 20; i++) {
        getline(cin, sInputScoreArray[i]);
        stringstream ss(sInputScoreArray[i]);
        string sSubject;
        double dScore;
        string sGrade;

        ss >> sSubject >> dScore >> sGrade;

        for (int j = 0; j < 10; j++) {
            if (sGrade == sGradeArray[j]) {
                dTotalSum += dScore * dGradeScoreArray[j];
                if (j != 9) {
                    dScoreSum += dScore;
                }
            }
        }
    }

    dAverage = dTotalSum / dScoreSum;
    cout << fixed;
    cout.precision(6);
    cout << dAverage << endl;

    return 0;
}