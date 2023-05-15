import java.util.*;

public class SwappingNodesInALinkedList{
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head, first = null, last = null;
        int size = 0;
        while(temp!=null){
            size++;
            if(size==k){
                first = temp;
            }
            temp = temp.next;
        }
        temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            if(count==size-k+1){
                last = temp;
            }
            temp = temp.next;
        }
        int x = first.val;
        first.val = last.val;
        last.val = x;
        return head;
    }
}

/*
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */