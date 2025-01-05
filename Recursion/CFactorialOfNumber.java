package Java_PW.Recursion;

public class CFactorialOfNumber {
    static int factorial(int n) {
        if(n==1) {

            return n;
        }
        int fac = factorial(n-1) ;
        return (n*fac);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
