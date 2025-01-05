package Java_PW.Array;

public class OTargetSumofTwoElement {
    public static void main(String[] args) {
        int arr[] = {2,8,3,4,5,6,7,8,9,1} ;
        int sum = 10 ;
        for(int i = 0 ; i <arr.length ; i++) {
            for(int j = i+1; j<arr.length; j++ ) {
                if((arr[i] +arr[j])== sum) {
                    System.out.println(arr[i] + " and "+ arr[j]+ " sum is equal to "+sum);
                }
            }
        }
    }
}
