package code.daybyday.test.medium;

import java.util.HashMap;

/**
 * Created by skanyal on 1/13/18.
 * Time Complexity: O(n^2) in worst case.
 */
public class SubarrayWithGivenSum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};
        int[] arr2 = {1, -2, 3, -7, -5};
        int Sum = 4;
        int n = arr.length;
        int n2 = arr2.length;
        SubarrayWithGivenSum obj = new SubarrayWithGivenSum();
        obj.sumOfArray(arr, n, Sum);
        obj.subArrayForNegativeNumbers(arr2,n2,Sum);

    }

    static int sumOfArray(int a[], int n, int s) {

        int i, j, cur_sum;
        //pick starting point
        for (i = 0; i < n; i++) {
            cur_sum = a[i];

            //try all sub array starting with i
            for (j = i + 1; j < n; j++) {

                if (cur_sum == s) {
                    int p = j - 1;
                    System.out.println("Sum found between" + i + " and " + p);
                }
                if (cur_sum > s || j > n) break;
                cur_sum = cur_sum + a[j];
            }

        }
        System.out.println("No subarray found");
        return 0;
    }

    int subArraySumBetter(int a[], int n, int sum) {

        int curr_sum = a[0];
        int i, j, p, start = 0;
        for (i = 1; i <= n; i++) {

            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum) {
                curr_sum = curr_sum - a[start];
                start++;
            }

            if (curr_sum == sum) {
                p = i - 1;
                System.out.println("Sum found between" + i + " and " + p);
                return -1;
            }
            if (i < n) curr_sum = curr_sum + a[i];
        }
        System.out.println("No subarray found");
        return 0;
    }

    int subArrayForNegativeNumbers(int a[], int n, int sum) {

        //create an empty map

        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum = curr_sum + a[i];
            if (curr_sum == sum) {
                System.out.println("Sum found between" + 0 + " and " + i);
                return -1;
            }
            if (m.containsValue(curr_sum - sum) != m.isEmpty()) {
                System.out.println("Sum found between" + "and " + i);
                return -1;
            }

        }
        return -1;
    }
}