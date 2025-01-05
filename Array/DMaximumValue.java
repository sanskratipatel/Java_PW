package Java_PW.Array;

import java.sql.SQLOutput;

public class DMaximumValue {
    public static void main(String[] args) {
        int arr[] = {1,33,54,2,57,89,435} ;
        int max = arr[0] ;
        for(int i = 0 ; i<arr.length ; i++) {
            if(arr[i] >max) {
                max = arr[i] ;
            }
        }
        System.out.println("Maximum value is = "+ max);
    }
}
