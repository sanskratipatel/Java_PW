package Java_PW.String;

public class BInsertionSort {
    public static void main(String[] args) {
        int arr[] = {12,33,43,4,6,7,674} ;
        for(int i = 1; i <arr.length; i++) {
            int j = i;
            while ((j>0 ) && (arr[j] < arr[j-1])) {
                int temp = arr[j] ;
                arr[j] = arr[j-1] ;
                arr[j-1] = temp;
                j--;
            }
        }
        for(int i :arr) {
            System.out.println(i);
        }
    }
}
