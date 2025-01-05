package Java_PW.Array;

import java.util.Arrays;

public class NGetMaxMinElementInArrays {
    public static void main(String[] args) {
        int arr[] = {112,2324,243,45,6,7,8345,9} ;
        int max = arr[0];
        int min = arr[0] ;
        for(int i = 0 ; i <arr.length ; i++ ) {
            if(arr[i] > max) {
                max = arr[i] ;
            }
            if(arr[i] <min) {
                min = arr[i] ;
            }
        }
        int ans[] = {min,max} ;
        System.out.println(Arrays.toString(ans));
    }
}
