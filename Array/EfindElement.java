package Java_PW.Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EfindElement {
    public static void main(String[] args) {
        int arr[] = {12,43,6,76,3,7,34,6,2} ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element that you want to find = ");
        int find = sc.nextInt();
        int found = 0 ;
        for(int i = 0 ; i <arr.length ; i++) {
            if(arr[i] == find) {
                System.out.println(find +" Element found in "+i+ " index");
                found ++;
                break;
            }
        }
        if(found == 0){
            System.out.println("Element is not present in array ");
        }

    }
}
