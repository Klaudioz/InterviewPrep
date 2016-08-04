package leetcode;

/**
 * Created by Klaudioz on 03-Aug-16.
 */
public class Solution02 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // check if the linked list is null
        if (l1 == null && l2 == null)
            return null;
        // convert digits into integer
        long num1 = toInteger(l1);
        long num2 = toInteger(l2);
        // calculate the sum
        long sum = num1 + num2;
        // construct new linked list
        ListNode result = new ListNode(0);
        ListNode head = result;
        do {
            int digit = (int)(sum % 10);
            sum /= 10;
            // Append the digit to the linked list
            ListNode node = new ListNode(digit);
            head.next = node;
            head = node;
        } while (sum != 0);
        return result.next;
    }

    // convert digits to integers
    private static long toInteger(ListNode list) {
        long num = 0;
        int i = 0;
        while (list != null) {
            num += list.val * Math.pow(10, i++);
            list = list.next;
        }
        return num;
    }
    // Create ListNode from an Array. (Used only in main)
    public static ListNode fromArray(int[] arr){
        ListNode res = new ListNode(0);
        ListNode current = res;
        for(int i = 0; i < arr.length; i++){
            ListNode node = new ListNode(arr[i]);
            current.next = node;
            current = node;
        }
        return res.next;
    }
}

