package Java_PW.Array;

import java.util.Scanner;

public class GTakinInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of array = ");
        int size = sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter "+size+ " element in Array");
        for(int i = 0 ; i <arr.length ;i++ ) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing the array ");
        for(int i = 0 ; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
