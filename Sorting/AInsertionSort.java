package Java_PW.Sorting;

public class AInsertionSort {
    public static void main(String[] args) {
        int arr[] = {1,2,34,45,2,32,1} ;
        for(int i = 1; i <arr.length ; i++) {
            int j = i ;
            while(j >0  && arr[j] < arr[j-1]) {
                int temp = arr[j] ;
                arr[j] = arr[j-1] ;
                arr[j-1] = temp;
                 j-- ;
            }
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
