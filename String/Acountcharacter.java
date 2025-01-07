package Java_PW.String;

public class Acountcharacter {
    public static void main(String[] args) {
        String str = "Hello   Guys    this   is m me" ;
        str = str.replaceAll(" ","");
        char ch[] = str.toCharArray() ;
         int count = 0 ;
        for(int i = 0 ; i <ch.length;i++) {
            count++;
        }
    }
}
