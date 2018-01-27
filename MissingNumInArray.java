package code.daybyday.test.medium;

/**
 * Created by skanyal on 1/12/18.
 */
public class MissingNumInArray {

    public static void main (String[] args) {

        int [] arr= {1,2,3,4,5,7};
        int[] arr2={5,3,1,2};
        MissingNumInArray obj = new MissingNumInArray();
        System.out.println(obj.missingNumber(arr));
        System.out.println(obj.missingNumber(arr2));
    }

    static int missingNumber(int a[]){
        int n= a.length-1;
        int sum1=0;
        for(int i=0;i<a.length;i++){

            sum1=+a[i];
        }
        int average =n*(n+1)/2;
        int missingNum = average-sum1;
        return missingNum;
    }
}
