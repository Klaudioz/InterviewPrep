import codekata.fizzbuzz.FizzBuzz;
import leetcode.ListNode;
import static leetcode.ListNode.*;
import static leetcode.Solution02.*;
import static sorting.BinarySearch.binarySearch;

/**
 * Created by Klaudioz on 02-Aug-16.
 */
public class Main {
    public static void main(String[] args) {
        //===============CODE KATA=================
        //----------------FizzBuzz-----------------
        //FizzBuzz.main("");
        //================SORTING==================
        //----------------Binary-------------------
        binarySearch(new int[]{5,10,77,88}, 0, 3, 77);
        //================LEETCODE==================
        //---------------Solution 01------------------
//        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
//        System.out.println(Arrays.toString(twoSum(new int[]{0,4,3,0}, 0)));
        //-------------- Solution 02------------------
//        ListNode list_a = fromArray(new int[]{2,4,3,5});
//        ListNode list_b = fromArray(new int[]{5,6,4,5});
//        System.out.println(addTwoNumbers(list_a,list_b));
    }
}
