package Java_PW.Array;

public class LStrictlyGreater {
    public static void main(String[] args) {
        int arr [] = {1,22,22,4,6,7,78} ;
        int key = 22 ;
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++) {
            if (arr[i] > key) {
                count ++;
            }
        }
        System.out.println(count +" element is stricktly greater than "+key);
    }
}
