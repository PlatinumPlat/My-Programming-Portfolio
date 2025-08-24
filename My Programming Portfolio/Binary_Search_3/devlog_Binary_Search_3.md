Hey! I just finished 7 (and a half) problems on DMOJ which mostly tested my knowledge of Binary Search. As I'm approaching more difficult areas of programming that have questions with higher point values, I've spent more time debugging for each question and also learning by looking at other people's faster solutions.

Here are 3 significant problems that I solved!
1. ECOO '20 P2 - Online Shopping
This question was mostly a data structures problem that I solved using a custom comparator and sorting. It was purely implementation and taught me the importance of noting down your solutions before coding them in order to have a well thought out and organized plan that will be easy to program.

2. GFSSOC '15 Fall J5 - Nightmare-a-thon
Although I didn't solve this problem the way that the question writer(s) meant for it to be solved in O(N) time, I used a binary search algorithm that finds how many episodes of a certain rating are in between two indexes (start and end of skipped episodes) then calculates how many episodes with that rating are left based on the total list size. However, I decided to learn about other people's faster strategies and discovered that keeping an array that monitors the largest episode rating to the left and to the right of each episode is the fastest solution and also was easy to implement.

3. BSSPC '21 S2 - Hacker Soup
This problem was extremely meticulous because of the weird array values that the question used as I often got confused on which value was x/y because the input placed the y first before the x. I had to write out a lot of grids to test out my code and originallly made an oversight when I didn't implement a program that correctly solves the problem if the rotating subgrid doesn't have the same x/y coordinates for each of the top left/bottom right grid boxes. After becoming completely confused in my first attempt at the problem, I eventually succeeded after taking a break and debugging every single rotation in a 3x3 grid to ensure all the outputs were accurate.

Now the half problem that I am in the process of solving:
4. James_Egirl_Status
I truly haven't seen a similar problem before, so I had a lot of difficulty deriving a solution for this question. However, upon further study, I discovered that it requires a Dynamic Programming approach instead of binary search/two pointer search to find the maximum subarray sum. I am currently learning more about dynamic programming and will hopefully be able to reach an Accepted solution very soon! I'll make an update about this question in my next devlog.