package Java_PW.String;

import java.util.Arrays;

public class BUbbleSor {
    public static void main(String[] args) {
        int arr[] = {1,67,34,54,2,56,8,56,54,4} ;
        for(int i = 0 ; i <arr.length ; i++) {
            boolean find = true;
            for(int j = 0 ; j<arr.length-1 ; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp;
                    find = false;
                }
            }


        }
        for(int i = 0 ; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
