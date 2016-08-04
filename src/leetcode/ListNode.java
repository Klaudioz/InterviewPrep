package leetcode;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public String toString() {
        String result = val + "";
        if (next != null) {
            result += "->" + next.toString();
        }
        return result;
    }
}
