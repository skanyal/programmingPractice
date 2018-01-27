package code.daybyday.test.medium;

import java.util.Scanner;

class LinearSearch {
    public static void main (String[] args) {

        int [] arr = new int[100];

        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();

        //one by one run for each test case
        while(testCase>0)
        {
            int n = in.nextInt();
            for(int i=0; i<n;i++)


                arr[i] = in.nextInt();
            //print result , linearSearch(length of array,
            //n = size of array, searched element)
            int x = in.nextInt();
            System.out.println(linearSearch(arr, n,x ));

            testCase--;

        }

    }

    static int linearSearch(int arr[], int n, int x ){

        for(int i=0;i<n;i++){
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
}