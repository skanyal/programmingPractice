package code.daybyday.test.medium;

/**
 * Created by skanyal on 1/14/18.
 */
public class SortArrayWithZeroOneTwo {

    public static void main(String[] args) {

        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = 12;
        sortArray(arr, n);
    }

    static void sortArray(int arr[], int n) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0++;
            }
            if (arr[i] == 1) {
                count1++;
            }
            if (arr[i] == 2) {
                count2++;

            }
            // Putting the 0's in the array in starting.
            for (i = 0; i < count0; i++)
                arr[i] = 0;

            for (i = count0; i < (count0 + count1); i++)
                arr[i] = 1;


            for (i = (count0 + count1); i < n; i++)
                arr[i] = 2;

            printArray(arr, n);
        }
    }

    public static void printArray(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}