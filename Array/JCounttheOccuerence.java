package Java_PW.Array;

public class JCounttheOccuerence {
    public static void main(String[] args) {
        int arr[] = {1,2,3,45322,46,2,4,3,2,5} ;
        int key = 2 ;
        int count = 0 ;
        for(int i = 0 ;i<arr.length; i++) {
            if(arr[i] == key) {
                count++;
            }
        }
        System.out.println("Occuernece of "+key+" in array is "+ count);

    }
}
