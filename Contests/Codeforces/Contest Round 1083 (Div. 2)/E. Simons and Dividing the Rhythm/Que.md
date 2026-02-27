# Description

Consider that Simons is given an array a of size m.

Simons must operate on the array exactly once as follows:

First, he has to select an integer k and choose k pairs of integers [l1,r1],[l2,r2],…,[lk,rk], such that:

li≤ri for each 1≤i≤k,l1=1, rk=m, and ri+1=li+1 for each i from 1 to k−1.

Then, he reverses each subarray [ali,ali+1,…,ari] independently. After this, the array will become [ar1,ar1−1,…,al1,ar2,…,alk−1,ark,ark−1,…,alk]. You are given an array T of size n. Count the number of arrays S such that Simons can transform S to T, modulo 998244353.

Input :-

Each test contains multiple test cases. The first line contains the number of test cases t (1≤t≤8000). The description of the test cases follows.

The first line contains an integer n (1≤n≤8000) — the length of T.

The second line contains n integers T1,T2,…,Tn (1≤Ti≤8000) — the elements of T.

It is guaranteed that the sum of n over all test cases does not exceed 8000.

Output :-

For each test case, output a single integer — the number of arrays S, modulo 998244353.

## Example

**Input :-**
```
5
4
1 1 2 1
4
1 2 3 1
6
1 3 2 3 3 2
10
2 3 1 4 3 1 4 3 1 2
1
8000
```

**Output :-**
```
4
7
22
383
1
```

Note :-

In the first test case, we can see only the following arrays can be transformed to T:

For S=[2,1,1,1], Simons will choose [1,3] and [4,4]. Thus, the array will become [1,1,2,1], equal to T.

For S=[1,2,1,1], Simons will choose [1,4].

For S=[1,1,2,1], Simons will choose [1,2], [3,3], and [4,4].

For S=[1,1,1,2], Simons will choose [1,2] and [3,4].

In the second test case, we can see only he following arrays can be transformed to T:

For S=[1,1,3,2], Simons will choose [1,1] and [2,4].

For S=[1,2,1,3], Simons will choose [1,1], [2,2], and [3,4].

For S=[1,2,3,1], Simons will choose [1,1], [2,2], [3,3], and [4,4].

For S=[1,3,2,1], Simons will choose [1,4].

For S=[2,1,1,3], Simons will choose [1,2] and [3,4].

For S=[2,1,3,1], Simons will choose [1,2], [3,3], and [4,4].

For S=[3,2,1,1], Simons will choose [1,3] and [4,4].