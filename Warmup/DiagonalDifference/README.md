#####Problem Statement
You are given a square matrix of size <b>N×N</b>. Calculate the absolute difference of the sums across the two main diagonals.

#####Input Format
The first line contains a single integer <b>N</b>. The next <b>N</b> lines contain <b>N</b> integers (each) describing the matrix.

#####Constraints
<b>1≤N≤100<br>
−100≤A[i]≤100</b>

#####Output Format
Output a single integer equal to the absolute difference in the sums across the diagonals.

#####Sample Input
`3`<br>
`11 2 4`<br>
`4 5 6`<br>
`10 8 -12`<br>

#####Sample Output
`15`

#####Explanation
The first diagonal of the matrix is:

`11       `<br>
`    5    `<br>
`      -12`<br>

Sum across the first diagonal = 11+5-12= 4

The second diagonal of the matrix is:

`        4`<br>
`    5    `<br>
`10       `<br>

Sum across the second diagonal = 4+5+10 = 19<br>
Difference: |4-19| =15

