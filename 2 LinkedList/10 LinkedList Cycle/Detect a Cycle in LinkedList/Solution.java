//  Program 10: LinkedList Cycle
//  https://leetcode.com/problems/linked-list-cycle/submissions/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if( head == null || head.next == null)
            return false;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while( fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next; 
            
           if( slow == fast) // This condition is checked only after moving slow by one step and fast by two step, 
                return true; // Otherwise both slow and fast both points to head which is true.
            
        }
        return false;
    }
}