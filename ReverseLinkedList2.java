package basic03;
import java.util.*;
//Recursive method

public class ReverseLinkedList2 {
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverse(head.next);
        ListNode tail = head.next;
        tail.next = head;
        head.next = null;
        return newHead;
    }
}
