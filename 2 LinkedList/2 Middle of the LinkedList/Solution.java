// Program 2: Middle of the LinkedList
// https://leetcode.com/problems/middle-of-the-linked-list/submissions/

// Naive approach:
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
    public ListNode middleNode(ListNode head) {
        ListNode t = head;
        if( t == null)
            return null;
        
        int count = 0;
        while( t != null){ //Finding the length of the LinkedList
            count++;
            t = t.next;
        }
        int mid = count/2;
    
        int m=1;
        while( m < mid+1 &&  head !=  null){ //Traversing till the middle node using head and return it.
            m++;
            head = head.next;
        }
        return head;        
    }
}


// Tortoise method:( Efficient solution)

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
    public ListNode middleNode(ListNode head) {

        ListNode next = head;
        ListNode current = head;
        
        while(next != null && next.next != null){
            current = current.next;
            next=next.next.next;
        }
        
        return current;
        
    }
}

