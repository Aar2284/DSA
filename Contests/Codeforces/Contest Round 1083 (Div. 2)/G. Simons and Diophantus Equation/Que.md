# Description

Simons has given you two integers n and m.

Count the number of ordered tuples (i,j,k), such that:

0≤i,j,k≤m, and There exist two integers x and y, such that (i⊕j)⋅x+(j⊕k)⋅y=n, where ⊕ denotes the bitwise XOR operation.

Input :- 

Each test contains multiple test cases. The first line contains the number of test cases t (1≤t≤104). The description of the test cases follows.

The only line contains two integers n and m (1≤n≤109, 1≤m≤3⋅105) — the given integers.

It is guaranteed that the sum of m over all test cases does not exceed 3⋅105.

Output:- 

For each test case, output a single integer — the number of ordered tuples (i,j,k) that satisfy the condition.

## Example

**Input :-**
```
5
3 2
4 6
1 1
7 20
720 2025
```

**Output :-**
```
18
254
6
5558
7864357450
```

Note :-

In the first test case, there are 18 tuples that satisfy the conditions. For example:

(2,1,2) is a valid tuple because the equation (2⊕1)⋅x+(1⊕2)⋅y=3 has an integer solution x=3, y=−2.

(1,1,0) is also a valid tuple because the equation (1⊕1)⋅x+(1⊕0)⋅y=3 has an integer solution x=100, y=3.

(2,0,2) is not a valid tuple because the equation (2⊕0)⋅x+(0⊕2)⋅y=3 has no integer solution.

(1,1,1) is not a valid tuple because the equation (1⊕1)⋅x+(1⊕1)⋅y=3 has no integer solution.

(3,2,1) is not a valid tuple because 3>2.