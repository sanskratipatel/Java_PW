package Java_PW.Array;

public class TSwapNumber {
    public static void swap(int a , int b) {
        System.out.println("Before Swap "+ a + " and "+ b);
        int temp = a ;
        a= b ;
        b = temp;
        System.out.println("After Swap "+ a + " and "+ b);
    }
    public static void main(String[] args) {
        int a =6 ; int b = 8 ;
        swap(a,b);
        int c = 10 ; int d = 20;
        System.out.println("Before Swap "+ c + " and "+ d);
        c= c+d ;  // a = 30
        d= c-d ; //30-20 = b = 10
        c = c-d; //30 - 10 = c = 20
        System.out.println("After Swap "+ c + " and "+ d);
        int e = 2;
        int f = 4 ;
        System.out.println("Before Swap "+ e + " and "+ f);
        e = e*f ; //e = 8
        f = e/f;
        f = e/f ;
        System.out.println("After Swap "+ e + " and "+ f);

    }
}
