package Java_PW.Array;

public class HShallowCpy {
    public static void printArray(int arr[]) {
        System.out.print("[");
        for(int i = 0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.println("]");
//        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7} ;
        int[] arr2 = arr;
        System.out.print("Original Array = ");
        printArray(arr);
        System.out.println("Copied Array = ");
        printArray(arr2);
        arr2 [0]= 23;
        arr2[1] = 24 ;
        arr2[2] =25;
        System.out.println("Original array after change copied array ");
        printArray(arr);
        System.out.println("Copied Array After change = ");
        printArray(arr2);
    }
}

//
//public static void printArray(int arr[]) {
//    System.out.print("[");
//    for(int i = 0 ; i<arr.length ; i++) {
//        System.out.print(arr[i] + " ,");
//    }
//    System.out.println("]");
////        System.out.println();
//}
//static void change_array(int arr[]) {
//    for(int i = 0; i < arr.length ; i++) {
//        arr[i] = 0;
//    }
//}
//
//public static void main(String[] args) {
//    int arr[] = new int[3] ;
//    arr[0] = 2;
//    arr[1] = 2;
//    arr[2] = 2;
//    System.out.println("original array = " );
//    printArray(arr);
//    change_array(arr);
//
//}