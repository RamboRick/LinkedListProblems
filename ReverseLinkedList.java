package basic03;
import java.util.*;
//time complexiy: O(n)
//space complexity: O(1)
public class ReverseLinkedList {
    public ListNode reverse(ListNode head){
        ListNode prev = null, cur = head, next = null;
        while(cur != null){
            next = cur.next;
            cur.next=prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
