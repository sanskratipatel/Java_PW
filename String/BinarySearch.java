package Java_PW.String;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,8,9,10} ;
        int key = 7;
        int low = 0 ;
        int max = arr.length-1;
        int mid = (low+max)/2;
        int found = 0;
        for(int i = 0 ; i <arr.length; i++) {
          if(arr[mid]  == key) {
              found++;
              System.out.println("Key find at "+ mid);
              break;
          } else if (arr[mid] > key) {
              max = mid - 1;
              mid = (low+max)/2;

          } else  {
              low = mid+1;
              mid = (low+max)/2;
          }

        }
        if(found == 0) {
            System.out.println("Key is not found");
        }
    }
}
