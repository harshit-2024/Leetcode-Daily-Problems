import java.util.*;
import Imports.*;

public class MaximumTwinSumOfALinkedList {
    public int pairSum(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        temp = head;
        int count = 0;
        while(temp!=null && count<size/2){
            count++;
            st.push(temp.val);
            temp = temp.next;
        }
        int max = Integer.MIN_VALUE;
        while(temp!=null){
            max = Math.max(max, (st.pop()+temp.val));
            temp = temp.next;
        }
        return max;
    }
}
