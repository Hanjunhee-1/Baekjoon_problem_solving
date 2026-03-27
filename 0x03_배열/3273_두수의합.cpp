#include <bits/stdc++.h>
using namespace std;

/**
 * https://www.acmicpc.net/problem/3273
 * 
 * n개의 서로 다른 양의 정수 a1, a2, ..., an으로 이루어진 수열이 있다. ai의 값은 1보다 크거나 같고, 100000보다 작거나 같은 자연수이다. 
 * 자연수 x가 주어졌을 때, ai + aj = x (1 ≤ i < j ≤ n)을 만족하는 (ai, aj)쌍의 수를 구하는 프로그램을 작성하시오.
 */

int main() {
    // O(n log n) 에 끝내기 가능. -> 시간초과
    vector<int> digits;
    int n, a, x, sum, left, right, cnt=0;
    cin >> n;

    for (int i=0; i<n; i++) {
        cin >> a;
        digits.push_back(a);
    } cin >> x;

    sort(digits.begin(), digits.end());
    left = 0, right = digits.size() - 1;

    while (left < right) {
        sum = digits.at(left) + digits.at(right);

        if (sum == x) {
            cnt++;
            left++;
            right--;
        } else if (sum < x) {
            left++;
        } else {
            right--;
        }
    }

    cout << cnt;

    // O(n^2) 에 끝내기 가능. -> 시간초과
    // vector<int> digits;
    // int n=0; int a=0; int x=0; int cnt=0;

    // cin >> n;
    // for (int i=0; i<n; i++) {
    //     cin >> a;
    //     digits.push_back(a);
    // } cin >> x;

    // for (int i=digits.size()-1; i>0; i--) {
    //     for (int j=i-1; j>=0; j--) {
    //         if (digits.at(i) + digits.at(j) == x) cnt++;
    //     }
    // }

    // cout << cnt << "\n";
}