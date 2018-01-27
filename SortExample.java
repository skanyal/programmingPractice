package code.daybyday.test.medium;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by skanyal on 1/14/18.
 */
public class SortExample {

    public static void main(String[] args)
    {

    // Our arr contains 8 elements
    int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};

        //sort a full array in ascending order
    Arrays.sort(arr);
        //sort an array of sub array
        Arrays.sort(arr, 1, 5);

        //sort in descending order
        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.

        Integer[] arr1 = {13, 7, 6, 45, 21, 9, 2, 100};

        Arrays.sort(arr1, Collections.reverseOrder());


     System.out.printf("Modified arr[] : %s",
            Arrays.toString(arr));
}
}
