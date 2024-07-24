#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>
using namespace std;
int calc(string s) {
    int sum = 0;
    bool dbl = true;
    for (int i = s.length() - 1; i >= 0; i--) {
        int d = s[i] - '0';
        if (dbl) {
            d *= 2;
            if (d > 9) d -= 9;
        }
        sum += d;
        dbl = !dbl;
    }
    return (10 - (sum % 10)) % 10;
}
string gen() {
    string t = "35847631";
    string sn = "00";
    srand(time(0));
    for (int i = 0; i < 4; i++) sn += to_string(rand() % 10);
    string imei = t + sn;
    return imei + to_string(calc(imei));
}
int main() {
    cout << gen() << endl;
    return 0;
}
