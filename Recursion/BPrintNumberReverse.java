package Java_PW.Recursion;

public class BPrintNumberReverse {
    static void ReverseNumber(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        ReverseNumber(n-1);
    }
    public static void main(String[] args) {
   ReverseNumber(6);
    }
}
