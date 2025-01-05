package Java_PW.Sorting;

public class ABubbleSort {
    public static void main(String[] args) {
        int arr[] = {12,4,34,1,45,2,56,3,2,5};
        int len = arr.length;
        for(int i = 0 ; i<len-1 ; i++) {
            boolean flag = false;
            for (int j =0; j < len-1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                   flag = true;
                }
            }
           if (flag == false ) {
             break;
           }
        }
        for(int i = 0 ; i< len ;i++) {
            System.out.println(arr[i]);
        }
    }
}