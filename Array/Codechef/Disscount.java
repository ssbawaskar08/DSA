/*
Problem: Take Discount or Not -->https://www.codechef.com/practice/course/arrays/ARRAYS/problems/DISCOUNTT

There are N items in a shop. The price of the i-th item is Ai. 
Chef wants to buy all N items.

There is a discount coupon that costs X rupees and reduces the cost 
of every item by Y rupees. If the price of an item was initially ≤ Y, 
it becomes free (cost = 0).

Chef will buy the discount coupon if and only if the total price after 
using the coupon (including its cost) is strictly less than the total 
price without the coupon.

Input Format:
- First line: T (number of test cases)
- For each test case:
  - Line 1: N, X, Y
  - Line 2: N space-separated integers A1, A2, …, AN

Output Format:
- For each test case, print "COUPON" if Chef should buy the coupon, 
  otherwise print "NO COUPON".
- Output is case-insensitive (e.g., coupon, CouPoN, COUPON are all valid).
*/
class Solution {
    public String checkCoupon(int n, int x, int y, int[] prices) {
        // write your code here 
        int sumwithoutdis = 0;
        int sumwithdis = x;
        for(int i = 0;i<n;i++){
            sumwithdis = prices[i]>y ? sumwithdis+prices[i]-y : sumwithdis+0;
            sumwithoutdis += prices[i];
        }
        if(sumwithdis < sumwithoutdis) return "COUPON"; 
        return "NO COUPON";
    }
}
