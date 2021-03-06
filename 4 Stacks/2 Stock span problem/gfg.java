// Program 2: Stock span problem
// https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1/?track=ppc-stack&batchId=221#

import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}// } Driver Code Ends





class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(0); 
        int[] result = new int[n];
        result[0] = 1; // First element span will always be 1
        for(int i=1; i<price.length; i++){
            while( stack.isEmpty() == false && price[stack.peek()] <= price[i])
                stack.pop();
            result[i] = stack.isEmpty() ? (i+1) : (i- stack.peek());
            stack.push(i);
        }
        return result;
    }
    
}