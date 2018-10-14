package medium.Nodes;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> nums = new ArrayList<>();
        int c = 0;
        int temp = 0;

        while (l2 != null && l1 != null) {
            temp = l1.val + l2.val + c;
            c = (temp >= 10) ? 1 : 0;
            nums.add(temp - c*10);
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            while (l1 != null) {
                temp = l1.val + c;
                c = (temp >= 10) ? 1 : 0;
                nums.add(temp - c*10);
                l1 = l1.next;
            }
        } else if (l2 != null) {
            while (l2 != null) {
                temp = l2.val + c;
                c = (temp >= 10) ? 1 : 0;
                nums.add(temp - c*10);
                l2 = l2.next;
            }
        }
            if (c > 0) {
                nums.add(c);
            }


        if (nums.size() == 0) {
            return new ListNode(0);
        }
        ListNode result = new ListNode(nums.get(0));
        ListNode tempNode = result;
        for (int i = 1; i < nums.size(); i++) {
            ListNode nextNode = new ListNode(nums.get(i));
            tempNode.next = nextNode;
            tempNode = nextNode;
        }
        return result;
    }
}
