package Java_PW.Hahset;

import java.util.HashSet;

public class BStringtoHashset {
    public static void main(String[] args) {
        String str = "Hello Guys this is me" ;
        str = str.replaceAll(" ","") ;
        char[] ch = str.toCharArray();
        HashSet<Character> h1 = new HashSet<>();
        for(var i : ch) {
            h1.add(i);
        }
        System.out.println(h1.toString());
//        System.out.println(h1);
       StringBuilder str2 = new StringBuilder() ;
       for(var i : h1) {
           str2.append(i) ;
       }
        System.out.println(str2.toString());
    }
}
