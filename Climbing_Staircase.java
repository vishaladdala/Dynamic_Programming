/*
Leetcode
70. Climbing Stairs
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.


Example 1:

Input: 2
Output:  2
Explanation:  There are two ways to climb to the top.

1. 1 step + 1 step
2. 2 steps

*/


class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n+2];
        
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 2;
        
        if(n > 2){
            for(int i =3; i<=n; i++){
                memo[i] = memo[i-1] + memo[i-2];
            }
        }
        return memo[n];
    }
}