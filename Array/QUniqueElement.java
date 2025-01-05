package Java_PW.Array;

public class QUniqueElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,2,1} ;
        boolean find = true;
        for(int i = 0 ; i <arr.length ; i++) {

            for(int j = i+1 ; j< args.length ; j++) {
                if(arr[i] == arr[j]) {
                    find = false;
                }
                if(find == true) {
                    System.out.println(arr[i]);
                }
            }

        }
    }
}
