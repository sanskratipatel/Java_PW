package Java_PW.Array;

import java.util.Scanner;

public class FSecondOccuerence {
    public static void main(String[] args) {
        int arr[] = {1,23,54,21,7,8,1,23,67,4} ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the key ="  );
        int key = sc.nextInt() ;

        int found = 0 ;
        for(int i = 0 ; i <arr.length ; i++) {
            if(arr[i] == key ){
                found ++ ;
                if(found == 2) {
                    System.out.println(key + " second occuerence at " + i);
                }
            }
        }
        if(found == 0 ) System.out.println("Element not found");
    }
}
