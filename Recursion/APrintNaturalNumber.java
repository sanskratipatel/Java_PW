package Java_PW.Recursion;

public class APrintNaturalNumber {
    public static void NaturalNumber (int num) {
       if(num == 1) {
           System.out.println(num);
           return;
       }
       NaturalNumber(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
          int n = 5 ;
          NaturalNumber(n);
    }
}
