# Description

We call an array b of length m cool if and only if:

There exists no index i (1<i<m) such that bi=max({bi−1,bi,bi+1}).
Simons has an array a of size n. Initially, the array is a permutation∗.

He must perform the following operation until the array is cool:

Choose an index i (1<i<n) such that ai=max({ai−1,ai,ai+1}).
Then, he can remove either ai−1 or ai+1 from the array. After removal, a gap appears in the array, and the left and right sides of the gap will be rejoined.
Find the minimum number of operations for Simons to perform.

∗A permutation of length n is an array onsisting of n distinct integers from 1 to n in arbitrary order. For example, [2,3,1,5,4] is a permutation, but [1,2,2] is not a permutation (2 appears twice in the array), and [1,3,4] is also not a permutation (n=3 but there is 4 in the array).

Input :-

Each test contains multiple test cases. The first line contains the number of test cases t (1≤t≤5⋅104). The description of the test cases follows.

The first line contains an integer n (3≤n≤5⋅105) — the size of a.

The second line contains n integers a1,a2,…,an (1≤ai≤n, all ai-s are distinct) — the array Simons has initially.

It is guaranteed that the sum of n over all test cases does not exceed 5⋅105.

Output :-

For each test case, print a single integer — the minimum number of operations for Simons to perform.

## Example

**Input :-**
```
5
3
1 2 3
5
4 1 3 2 5
6
4 5 3 6 2 1
7
6 5 1 7 4 2 3
15
7 4 10 12 9 14 5 3 8 11 1 15 2 13 6
```

**Output :-**
```
0
1
3
3
9
```

Note :-

In the first test case, the array is cool initially, so Simons can't perform any operation. The answer is 0.

In the second test case, Simons can perform as follows:

Choose index 3, because a3=max({a2,a3,a4}). Then, he removes a2 from the array. The array becomes [4,3,2,5].
We can see the array is cool now. Thus, the answer is 1.

In the third test case, Simons can perform as follows:

Choose index 2. Then, he removes a1 from the array. The array becomes [5,3,6,2,1].

Choose index 3. Then, he removes a2 from the array. The array becomes [5,6,2,1].

Choose index 2. Then, he removes a1 from the array. The array becomes [6,2,1].

Thus, Simons makes the array cool in 3 operations.