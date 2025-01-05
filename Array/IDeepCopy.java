package Java_PW.Array;

import java.util.Arrays;

public class IDeepCopy {
    public static void printArray(int arr[]) {
        System.out.print("[");
        for(int i = 0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.println("]");
//        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7} ;
        int arr2 []= arr.clone() ;
        System.out.print("Original Array = ");
        printArray(arr);
        System.out.println("Copied Array = ");
        printArray(arr2);
        arr2 [0]= 23;
        arr2[1] = 24 ;
        arr2[2] =25;
        System.out.println("Original array after change copied array ");
        printArray(arr);
        System.out.println("Copied Array After change = ");
        printArray(arr2);

//        Another method
        int arr3[] = Arrays.copyOf(arr,arr.length) ;
        System.out.print("Original Array = ");
        printArray(arr);
        System.out.println("Copied Array = ");
        printArray(arr3);
        arr3 [0]= 23;
        arr3[1] = 24 ;
        arr3[2] =25;
        System.out.println("Original array after change copied array ");
        printArray(arr);
        System.out.println("Copied Array After change = ");
        printArray(arr3);
    }
}
