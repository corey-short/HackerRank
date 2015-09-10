####Uneaten Leaves
K caterpillars are eating their way through N leaves. Each caterpillar falls from leaf to leaf
in a unique sequence. All caterpillars start at a twig in position 0 and fall onto the leaves at
positions between 1 and N. Each caterpillar i 'jump-number' A_i. A caterpillar with jump number j
eats leaves at positions that are multiples of j. It will proceed in order j, 2j, 3j, .... till
it reaches the end of the leaves then it stops and builds a cocoon.

Given a set A of K elements, we need to determine the number of uneaten leaves.

####Input Format
N = number of leaves

K = number of caterpillars

A = Array of integer jump numbers (one per line)

####Constraints
1 <= N <= 10^9

1 <= K <= 15

1 <= A[i] <= 10^9

####Output Format
Print an integer denoting the number of uneaten leaves.


####Sample input
'10`<br>
`3`<br>
`2`<br>
`4`<br>
`5`

####Sample Output
`4`

###Explanation
[2,4,5] is the 3-member set of jump numbers. All leaves which are multiplies of 2,4, and 5
are eaten. Only 4 leaves wc are numbered,3,7,9 are left.
