package Java_PW.Array;

public class MCheckSortTheArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1} ;
        boolean check = true ;

        for(int i = 0 ; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1] ) {
                check = false ;
                break;
            }
        }
       if(check == false) {
           System.out.println("Not Sorted");
        }
       else {
           System.out.println("Sorted");
       }
    }
}
