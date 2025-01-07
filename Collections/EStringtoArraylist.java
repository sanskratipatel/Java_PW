package Java_PW.Collections;

import java.util.ArrayList;

public class EStringtoArraylist {
    public static void main(String[] args) {
      String str = "Hello guys this is me";
      String ch[] = str.split(" ") ;
      ArrayList<String> a1 = new ArrayList<>();
      for(var i: ch) {
          a1.add(i) ;
      }
        System.out.println(a1);
    }

}
