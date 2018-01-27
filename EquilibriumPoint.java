package code.daybyday.test.medium;

/**
 * Created by skanyal on 1/15/18.
 */
public class EquilibriumPoint {

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 2, 2};
        int n = arr.length;
        System.out.println("Print size of array:" + n);
        System.out.println(findEquilibriumPoint(arr, n));
    }


    static int findEquilibriumPoint(int arr[], int n) {

        int belowCount = 0, i, j;
        int aboveCount = 0;
        for (i = 0; i < n; ++i) {

            //get left sum
            for (j = 0; j < i; j++)
                belowCount = +arr[j];

            //get right sum
            for (j = i + 1; j < n; j++)
                aboveCount = +arr[j];

            if (belowCount == aboveCount) {
                return i;
            }
        }
        return -1;
    }
}
