## Description

There are n
 blogs. The i
-th blog mentioned li
 users in order as an array ai=[ai,1,ai,2,…,ai,li]
.

You are going to post all n
 blogs. Let us maintain a sequence Q
 that describes the list of users you have recently mentioned. You need to perform the following operation exactly n
 times:

Choose an unposted blog i
 (1≤i≤n
), then post it. This will cause the following operations for each 1≤j≤li
 in order:
If ai,j
 already exists in Q
, then move ai,j
 to the beginning of Q
.
Otherwise, insert ai,j
 at the beginning of Q
.
Find the lexicographically smallest∗
 Q
 after all n
 operations.

∗
An array x
 is lexicographically smaller than an array y
 if and only if one of the following holds:

x
 is a prefix of y
, but x≠y
; or
in the first position where x
 and y
 differ, the array x
 has a smaller element than the corresponding element in y
.
Input
Each test contains multiple test cases. The first line contains the number of test cases t
 (1≤t≤1000
). The description of the test cases follows.

The first line contains a single integer n
 (1≤n≤3000
) — the number of blogs.

Then n
 lines follow, the i
-th line starting with an integer li
 (1≤li≤3000
), describing the number of users mentioned in the i
-th blog, which is followed by li
 integers ai,1,ai,2,…,ai,li
 (1≤ai,j≤106
) — the list of users mentioned in the i
-th blog.

It is guaranteed that the sum of n
 over all test cases does not exceed 3000
.

Denote ∑i=1nli
 as L
. It is guaranteed that the sum of L
 over all test cases does not exceed 3000
.

Output
Denote m
 as the number of users mentioned in at least one blog. For each test case, output m
 integers Q1,Q2,…,Qm
 — the lexicographically smallest Q
.

## Example :-

**Input :-**

```
5
3
5 1 2 3 4 6
3 2 5 1
4 1 9 2 3
2
2 1 6
1 6
1
3 6 1 1
5
4 2 3 3 4
5 1 2 4 3 1
2 4 1
3 3 3 1
5 4 3 2 2 2
5
4 2 3 1 4
5 2 5 5 6 5
5 3 4 7 5 5
8 3 6 4 3 1 1 5 4
2 1 1
```

**Output :-**

```
1 5 2 3 9 6 4
6 1
1 6
1 3 2 4
1 4 3 2 5 6 7
```

Note
In the first test case, you can post the blogs as follows:

Post the first blog, and Q
 will become [6,4,3,2,1]
.
Post the third blog, and Q
 will become [3,2,9,1,6,4]
.
Post the second blog, and Q
 will become [1,5,2,3,9,6,4]
.
There is another method to post blogs:

Post the third blog, and Q
 will become [3,2,9,1]
.
Post the first blog, and Q
 will become [6,4,3,2,1,9]
.
Post the second blog, and Q
 will become [1,5,2,6,4,3,9]
.
We can see that [1,5,2,3,9,6,4]
 is lexicographically smaller than the other one. If we do not post the second blog at the end, the first element of the array will not be 1
, so [1,5,2,3,9,6,4]
 is the lexicographically smallest array Q
.

In the second test case, you can post the blogs as follows:

Post the first blog, and Q
 will become [6,1]
.
Post the second blog, and Q
 will keep itself [6,1]
.
In the third test case, you have to post the only blog, and Q
 will become [1,6]
.


