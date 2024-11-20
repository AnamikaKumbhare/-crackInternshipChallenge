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
    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }

        List<Integer> binaryDigits = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            binaryDigits.add(curr.val);
            curr = curr.next;
        }
        int ans = 0;
        int size = binaryDigits.size();

        for (int i = 0; i < size; i++) {
            ans += binaryDigits.get(i) * Math.pow(2, size - i - 1);
        }

        return ans;
    }
}

