// Program 12: Rotate a LinkedList
// https://leetcode.com/problems/rotate-list/submissions/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0) // edge cases
            return head;
        
        int length = 1; // Must be 1
        
        ListNode temp =  head;
        while(temp.next != null){
            length++;
            temp =temp.next;
        }
        
        temp.next = head; //Making a Circular LinkedList as of now
        k = length - ( k%length);
        
        while( k-- != 0)
            temp = temp.next;
        
        head = temp.next;
        temp.next = null;
                
        return head;
    }
}