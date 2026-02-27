# Description 

Simons has n friends and a huge amount of cakes. To divide the cakes fairly, you are asked to help him solve the following problem:

Find the minimum positive integer k such that n is a divisor of kn. It can be proved that the answer always exists under the given constraints.

Input:-
Each test contains multiple test cases. 

The first line contains the number of test cases t (1≤t≤100). The description of the test cases follows.

The only line of each test case contains a single integer n (2≤n≤109) — the number of friends Simons has.

Output:-
For each test case, output a single integer — the minimum k you found.

## Example :-

**Input :-**

```
4
8
12
369
55635800
```

**Output :-**

```
2
6
123
2090
```

**Note :-**

In the first test case:

18=1, and 8 is not a divisor of 1;
28=256, and 8 is a divisor of 256, because 256=8⋅32
.
Thus, the minimum possible k is 2.

In the second test case, 12 is a divisor of 612=2176782336, because 2176782336=12⋅181398528