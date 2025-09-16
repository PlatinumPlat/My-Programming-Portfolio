Hi! I finished 14 problems in these 6 and a half hours and managed to try out the CPH Judge & Browser extension.

This time the problems I encountered were mostly 3 or 5 pointers but still managed to program an accepted solution for several 7 and 10 pointers. The topic for these problems was Data Structures (basic graph theory, binary search), Primes (Sieve of Eratosthenes, Brute Forcing up to sqrt of a number), and Recursion (calling a function inside of itself, checking for base case). Here are 5 problems from this work session and some insights I would like to share!

# DMOPC '17 Contest 1 P1 - Fujō Neko
At first glance, one might solve the problem using an array and search every column/row for mysterious beings, however I solved this problem very easily with sets. I made two sets for both the rows/columns and added the row/column number if there is a mysterious being in that row/column. This allowed me to easily check if Saki is in the same row/column as mysterious being(s) and was time efficient! This problem truly reveals the power of sets and makes use of their O(1) searching time complexity.

# DMOPC '15 Contest 4 P4 - Great Sequence
I solved this problem using a complex strategy that combined binary search and prefix sum array. I used the same strategy from last week of testing if integer a is in the subsequence from index x-y by seeing if Collections.binarySearch(y)-Collections.binarySearch(x) is larger than 0 (I had to handle negative indexes if x/y doesn't appear in the list of occurences of a). However, after looking at other user's submissions, I discovered that a binary tree solution also works! I will learn more about binary trees and solve some of those problems in the near future.

# An Animal Contest 5 P2 - Permutations & Products
This question was an interactive problem and required the user to discover the hidden trick in order to solve it (all of these interactive ones do). Using a crucial problem solving strategy, I tried to solve the problem using smaller cases of N and realized the strategy of discovering the first 3 numbers then finding the rest by comoparing them with the first number. However, this strategy uses too many requests of interaction, so I was forced to use a set to store all the values form 1 to N, then find the last number in the sequqence as the last one remaining after I remove every number from the set once it appears in my calculations.

# CCC '04 S2 - TopYodeller
In my first attempt at this problem, I didn`t realize that ranks could be repeated, as in if you have a contest and 3 people score 10/10 and 2 other people score 9/10, then the rank of the first three people is all 1, and the rank of the next 2 people is not 4, but 2. However, after implementing a list to store people with the same rank, I was able to reach an accepted solution!

# CCC '11 J5 - Unfriend
Although I used a mostly brute force method myself, I discovered a new mathematical method and recusive algorithm that can solve the question much faster and with less code. I will be implementing a new solution very soon! This question required some basic knowledge of graph theory and implementation logic sense. 

Overall, the binary search, primes, and recursion questions for this work session did not have an extremely high level of difficulty but it was interesting to program my solutions but also look at other users's successful code!