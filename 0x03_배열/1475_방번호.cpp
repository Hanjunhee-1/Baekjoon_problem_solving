#include <bits/stdc++.h>
using namespace std;

/**
 * https://www.acmicpc.net/problem/1475
 * 
 * 다솜이는 은진이의 옆집에 새로 이사왔다. 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.

다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 
다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 출력하시오. (6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)
 */

int main() {
    int digit[10] = {0,};
    string s; int max = 0;
    cin >> s;
    for (auto c: s) {
        if (c-48 == 9) digit[c-51]++;
        else digit[c-48]++;
    }
    digit[6] = (digit[6] + 1) / 2;

    for (int i=0; i<sizeof(digit)/sizeof(int); i++) {
        if (digit[i] > max) max = digit[i];
    }
    cout << max << "\n";
}