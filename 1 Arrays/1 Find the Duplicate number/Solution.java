// Program 1: https://leetcode.com/problems/find-the-duplicate-number/

// Approach: Cycle Detection method                                                                                                  

class Solution {
    public int findDuplicate(int[] nums) {
        int sp = nums[0];
        int fp = nums[0];
        do{
            sp = nums[sp];
            fp = nums[nums[fp]];
        }while( sp != fp);
        
        fp = nums[0];
        
        
        
        while(sp != fp ){
            sp = nums[sp];
            fp = nums[fp];
        }
        return sp;
    }
}