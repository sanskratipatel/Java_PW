package Java_PW.Search;

import java.util.Arrays;

public class ABinarySearching {
    public static void main(String[] args) {
        int arr[] = {12,33,45,56,134} ;

        int key = 12 ;
        int low = 0 ;
        int high = arr.length-1 ;
        int mid = (low+high)/2;
        int find = 0;
        for(int i = 0 ; i <arr.length ; i++) {
            if(arr[mid] == key) {
              find ++;
              System.out.println("We found element at index = "+mid);
              break;
            } else if (arr[mid] > key) {
                high = mid -1;
                mid = (low+high)/2 ;
                
            } else if (arr[mid] <key)  {
                low = mid+1;
                mid = (low+high) /2 ;
            }
        }
        if(find == 0 ) {
            System.out.println("Element Not Found");
        }
    }
}
