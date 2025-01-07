package Java_PW.String;

public class Factorial {
    static int factorial (int n ) {
        if(n == 1 ) {
            return n;
        }
        int fac = factorial(n-1) ;
        return n *fac;
    }

    public static void main(String[] args) {
        for(int i = 1 ; i<10 ; i++) {
            System.out.println(factorial(i));
        }
    }
}
