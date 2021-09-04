Dynamic Programming - Fibonacci


This is a learning attempt to demonstrate what difference implementing memoization
does to run time.

In this demonstration, I used memoization to calculate a specific index by user input,
of the famous Fibonacci sequence.

How it works:
We use a Java HashMap to store the memoized values. Each key is represented by n (starting from 0), 
and the corresponding value will be the result of that Fibonacci number. Then, whenever we need to calculate a number,
if it’s already been calculated, we can retrieve the value from the map in O(1) time.

Run Main.java to try it yourself.