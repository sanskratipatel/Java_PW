package Java_PW.Array;

public class KLastOccuerence {
    public static void main(String[] args) {
        int arr[] = { 1,5,3,4,5,6,2,5,6,5,78} ;
        int key = 5 ;
        int count = 0 ;
        for(int i = 0 ;i <arr.length ;i++ ) {
            if(arr[i] == key) {
              count = i ;
            }
        }
        System.out.println("last occuerence of  "+key+" is " +count);
        int arr2 [] = {1,2,3,4,56,3,5,2,12,12,7,88,2} ;
        int key1 = 2 ;
        int count1 = 0;
        for(int i =( arr.length-1) ; i>=0; i--) {

            if(arr[i] == key1) {
                System.out.println("last occuerence of  "+key1+" is " +count1);
                break;
            }
        }

    }
}
