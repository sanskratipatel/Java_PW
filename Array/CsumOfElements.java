package Java_PW.Array;

public class CsumOfElements {
    public static void main(String[] args) {
        int arr[] = {1,32,4,56,76} ;
        int sum = 0 ;
        for(int i = 0 ; i<arr.length ; i++) {
            sum = arr[i] +sum ;
        }
        System.out.println(sum);
    }
}
