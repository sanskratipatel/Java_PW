package Java_PW.Array;

import java.util.Arrays;

public class WOslsShortNormalApproach {
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,0,0} ;
        int zerocount = 0 ;

        for(int i = 0 ; i<arr.length ; i++) {
            if(arr[i] == 0) {
                zerocount ++ ; //Now zerocount hava that number or index jaha tak humhe usme zero fill karna hai

            }
        }
        for(int i = 0 ; i< arr.length ; i++) {
            if(i < zerocount) {
                arr[i] = 0;
            }
            else{
                arr[i] = 1  ;

            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i = 0 ; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
//    output == [0, 0, 0, 0, 1, 1, 1]
}
