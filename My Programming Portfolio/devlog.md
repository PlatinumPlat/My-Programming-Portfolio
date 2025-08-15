This work session, I completed 11 problems on DMOJ and USACO combined and I am still in the process of finishing two more USACO questions. Again I will provide insight into my problem-solving journey for 5 significant problems.

1. [USACO] Sleepy Cow Herding
To complete this problem, I test-solved countless test cases which I made up by myself and stimulated the solve such that it resembled my program. This was extremely beneficial as I was able to engineer a well-thought out solution easily, and in the end, the question didn't turn out to be as hard as I previously thought it would be; it only required a simple greedy solution.

2. Back To School '18: Letter Frequency
Although I originally strugged to come up with a memory and time efficient solution for this problem, I eventually combined a PSA solution with some data structures knowledge in order to form a satisfactory solution. My program was similar to a mass PSA for all the letters of the alphabet! This solution helped me develop my core implementation skills.

3. DMOPC '15 Contest 6 P3 - Harvest
This was a another PSA problem that stressed time efficiency. After using multiple PSA techniques I have mentioned previously in other devlogs (eg. double PSA), I used a O(N) double-pointer approach to finish my program.

4. Mock CCC '22 1 S2 - IU
After looking at the time requirement, I realized that 0.25s was only enough for one O(N) sweep of the String. After brainstorming possible shortcuts and greedy solutions, I settled with summing up the absolute differences of the position displacements across the 'I' characters. Although I didn't immediately AC, I changed an integer variable to long to avoid Integer Overflow and solved the problem. To further immerse myself in this problem, I checked the Best Accepted Java Solutions for this problem and discovered that everyone used the same method, yet their implementation varied from time to time.

5. The Cosmic Era P2 - Uneven Sand
Uneven Sand was a classic Binary Search problem. Having played this math game countless times in my early childhood, I immediately knew that Binary Search was the strategy that would allow me to easily search a large interval of integers for the answer. Bascially, my program tested the middle of the interval repeatedly and adjusted the interval`s largest and smallest values after receiving the result to narrow down the interval until the program guessed the integer correctly. Having already completed one other interactive problem, the syntax for flushing was not as unfamiliar!

As an overall summary, I implemented data structure, PSA, and binary search techniques to solve most these questions! I have attached proof of my accepted solutions for [USACO] Sleepy Cow Herding and DMOPC '15 Contest 6 P3 - Harvest.