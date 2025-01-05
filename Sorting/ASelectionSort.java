package Java_PW.Sorting;

public class ASelectionSort {
    public static void main(String[] args) {
        int arr[] = {12,34,54,7,23,54,2,4} ;
         int len = arr.length;
         for(int i = 0 ; i < len-1 ; i++) {
             int min_index = i ;
             for(int j = i+1; j <len; j++) {
                 if(arr[j] <arr[min_index]) {
                     min_index = j ;
                 }
             }
             int temp = arr[i] ;
             arr[i] =arr[min_index];
             arr[min_index] = temp ;
         }
        for (int k : arr) {
            System.out.println(k);
        }
    }
}
