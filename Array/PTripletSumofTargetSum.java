package Java_PW.Array;

public class PTripletSumofTargetSum {
    public static void main(String[] args) {
        int arr[] = {2,8,3,4,5,6,7,8,9,1} ;
        int sum = 15;
        for(int i = 0 ; i <arr.length ; i++) {
            for(int j = i+1; j<arr.length; j++ ) {

                    for(int k = j+1 ; k<arr.length; k++) {
                        if((arr[i] +arr[j] +arr[k])== sum) {
                        System.out.println(arr[i] + " and " + arr[j] + " and "+arr[k] +" sum is equal to " + sum);
                    }
                }
            }
        }
    }
}
