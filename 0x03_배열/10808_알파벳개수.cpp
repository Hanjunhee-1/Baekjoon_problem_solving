#include <bits/stdc++.h>
using namespace std;

/**
 * https://www.acmicpc.net/problem/10808
 * 
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
 */

int main() {
    // 97 ~ 122 -> a ~ z
    int alpha[26] = {0,};
    string s;
    cin >> s;

    for (auto c: s) {
        alpha[c-97]++;
    }

    for (auto i: alpha) {
        cout << i << " ";
    }
}