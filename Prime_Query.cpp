#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int numTestCases;
    cin >> numTestCases;

    while (numTestCases--) {
        int arraySize;
        cin >> arraySize;

        vector<long long> prefixZeroCount(arraySize + 1, 0);
        vector<long long> prefixOneCount(arraySize + 1, 0);

        for (int position = 1; position <= arraySize; position++) {
            int value;
            cin >> value;
            prefixZeroCount[position] = prefixZeroCount[position - 1] + (value == 0 ? 1 : 0);
            prefixOneCount[position]  = prefixOneCount[position - 1]  + (value == 1 ? 1 : 0);
        }

        int numQueries;
        cin >> numQueries;

        while (numQueries--) {
            int queryLeft, queryRight;
            cin >> queryLeft >> queryRight;

            long long rangeSize    = queryRight - queryLeft + 1;
            long long zerosInRange = prefixZeroCount[queryRight] - prefixZeroCount[queryLeft - 1];
            long long onesInRange  = prefixOneCount[queryRight]  - prefixOneCount[queryLeft - 1];

            long long totalPairs = rangeSize * (rangeSize - 1) / 2;
            long long badPairs   = zerosInRange * (zerosInRange - 1) / 2 + zerosInRange * onesInRange;

            cout << totalPairs - badPairs << '\n';
        }
    }

    return 0;
}
