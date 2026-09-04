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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        if(head == null){
            return head;
        }
        
        while(node.next != null){
            // this will check if current node value is equal lto next node value
            if(node.next.val == node.val){
                node.next = node.next.next;
               
            }else{
                node=node.next;
            }
        }
       return head;
    }
}