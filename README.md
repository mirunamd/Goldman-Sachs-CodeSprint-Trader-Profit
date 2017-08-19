# Goldman-Sachs-CodeSprint-Trader-Profit

Mike is a stock trader and makes a profit by buying and selling stocks. He buys a stock at a lower price and sells it at a higher price to book a profit. He has come to know the stock prices of a particular stock for n upcoming days in future and wants to calculate the maximum profit by doing the right transactions (single transaction = buying + selling). Can you help him maximize his profit?

**Note:** A transaction starts after the previous transaction has ended. Two transactions can't overlap or run in parallel.

The stock prices are given in the form of an array A for n days.

Given the stock prices and a positive integer k, find and print the maximum profit Mike can make in at most transactions.

For example, 5 - day stock prices are given as 12, 5, 10, 7, 17 and k = 1. For one transaction, maximum profit is 12 when stock is purchased on day 2  and sold on day 5.

**Input Format**

The first line of input contains an integer q denoting the number of queries.

The first line of each test case contains a positive integer k, denoting the number of transactions.

The second line of each test case contains a positive integer n, denoting the length of the array A.

The third line of each test case contains n space-separated positive integers, denoting the prices of each day in the array A.

**Constraints**
- 1 <= q <= 100
- 0 < k < 10
- 2 <= n <= 30
- 0 <= elements of array A < = 1000

**Output Format**

For each query print the maximum profit earned by Mike on a new line.

**Sample Input**

> 3

> 2

> 6

> 10 22 5 75 65 80

> 3

> 4

> 20 580 420 900

> 1

> 5

> 100 90 80 50 25

**Sample Output**

> 87

> 1040

> 0

**Explanation**

*Output 1:* Mike earns 87 as sum of 12 and 75 i.e. Buy at price 10, sell at 22, buy at 5 and sell at 80.

*Output 2:* Mike earns 1040 as sum of 560 and 480 i.e. Buy at price 20, sell at 580, buy at 420 and sell at 900.

*Output 3:* Mike cannot make any profit as selling price is decreasing day by day. Hence, it is not possible to earn anything.

https://www.hackerrank.com/contests/gs-codesprint/challenges/trader-profit
