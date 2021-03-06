// Program 10 b: LinkedList Cycle II
// https://leetcode.com/problems/linked-list-cycle-ii/submissions/

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
    public ListNode detectCycle(ListNode head) {
     
        if ( head == null || head.next == null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;
        
        while( fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if( slow == fast){
                while(slow != entry){ // To find the entry of loop
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;
    }
}