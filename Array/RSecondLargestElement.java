package Java_PW.Array;

public class RSecondLargestElement {
    static int maxval(int arr[]) {
        int mx = Integer.MIN_VALUE;
        for(int i = 0 ; i <arr.length ; i++) {
            if(arr[i] > mx) {
                mx = arr[i] ;
            }
        }
        return mx;
    }
    static int SecondMax(int arr[]) {
        int max = maxval(arr) ;
        for(int i = 0 ; i <arr.length; i++) {
            if(arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;

            }
        }
        int secondMax = maxval(arr) ;
        return secondMax;

    }
    public static void main(String[] args) {
       int arr[] = {1,2,32,5,3,6,3,6,53,3,53,8,3} ;
        System.out.println(SecondMax(arr));
    }
}
