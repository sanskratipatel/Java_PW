package Java_PW.Hahset;

import java.util.HashSet;

public class AIntro {
    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<>() ;
        h1.add("Abhi");
        h1.add("nahi") ;
        h1.add("Anu") ;
        h1.add("Anu");
        for(var i : h1) {
            System.out.println(i);
        }
    }

    public static class FStringtoHashset {
    }
}
