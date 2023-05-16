import Imports.*;

public class SwapNodesInPairs {
    public ListNode solve(ListNode head){
        if(head==null){
            return null;
        }
        int count = 0;
        ListNode prev = null, cur = head, next = null;
        while(cur!=null && count<2){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            count++;
        }
        if(next!=null)
            head.next = solve(next);
        return prev;
    }
    public ListNode swapPairs(ListNode head) {
        return solve(head);
    }
}

/*
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */