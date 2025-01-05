package Java_PW.Recursion;

public class DFibonacciNumber {
    static int fibonacci(int n ) {
        if(n==0 || n==1) {
         return n;
        }
        int previous = fibonacci(n-1) ;
        int preprevious = fibonacci(n-2) ;
        return (preprevious+previous) ;
    }
    public static void main(String[] args) {
       for(int i = 0 ; i<=10 ; i++) {
           System.out.println(fibonacci(i));
       }
    }
}
