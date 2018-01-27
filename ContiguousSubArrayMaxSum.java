package code.daybyday.test.medium;

/**
 * Created by skanyal on 1/11/18.
 */
public class ContiguousSubArrayMaxSum {


    static int maxSum() {
        int input[] = {1, 2, -3, 4, 5, 2, -1};
        int maxSum = 0;
        int maxSum1 = 0;
        for (int i = 0; i < input.length; i++) {

            for (int j = i + 1; j < input.length - 1; j++) {

                maxSum1 = input[i] + input[j];
            }
        }
        if (maxSum1 > maxSum) {
            System.out.println("max sum print :" + maxSum1);
        } else {
            System.out.println("max sum print :" + maxSum);
        }
        return maxSum;
    }

    public static void main(String [] args){

        ContiguousSubArrayMaxSum obj = new ContiguousSubArrayMaxSum();
        obj.maxSum();

    }
}
