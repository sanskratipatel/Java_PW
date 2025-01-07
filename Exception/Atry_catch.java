package Java_PW.Exception;

public class Atry_catch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4} ;
        try {
            int a = 5/0;
            System.out.println(arr[6]);

        }
        catch (ArithmeticException | IndexOutOfBoundsException e ) {
            System.out.println(e.getMessage());
        }
//        try {
//            System.out.println(arr[5]);
//        }
//        catch (IndexOutOfBoundsException e ){
//            System.out.println(e.getMessage());
//        }
    }
}
