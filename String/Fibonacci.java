package Java_PW.String;

public class Fibonacci {
    static int fibonaaci (int num) {
        if(num == 1 || num ==0) {
            return num;
        }
        int pr = fibonaaci(num-1) ;
        int pre = fibonaaci(num -2) ;
        return (pr +pre ) ;
    }
    public static void main(String[] args) {
        System.out.println(fibonaaci(6));
    }
}
