#include <bits/stdc++.h>
using namespace std;

// Count ugly indices: index i (1-based) is ugly if prefix_max[i] == i
int countUgly(vector<int>& p) {
    int n = p.size();
    int cnt = 0, mx = 0;
    for (int i = 0; i < n; i++) {
        mx = max(mx, p[i]);
        if (mx == i + 1) cnt++;  // 1-based index = i+1
    }
    return cnt;
}

void solve() {
    int n;
    cin >> n;
    vector<int> p(n);
    for (int& x : p) cin >> x;

    int bestCnt = countUgly(p);
    int bi = -1, bj = -1;

    // Try all O(n^2) swaps
    for (int i = 0; i < n && bestCnt > 1; i++) {
        for (int j = i + 1; j < n; j++) {
            swap(p[i], p[j]);
            int cnt = countUgly(p);
            if (cnt < bestCnt) {
                bestCnt = cnt;
                bi = i; bj = j;
            }
            swap(p[i], p[j]);
            if (bestCnt <= 1) break;  // Can't do better than 1
        }
    }

    // Apply best swap if found
    if (bi != -1) swap(p[bi], p[bj]);

    for (int i = 0; i < n; i++)
        cout << p[i] << " \n"[i == n - 1];
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin >> t;
    while (t--) solve();

    return 0;
}