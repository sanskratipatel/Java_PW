package Java_PW.Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class ArraylistReverse {
    static void reverse(ArrayList<Integer>list) {

    }
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(54);
        a1.add(55);
        a1.add(534);
        a1.add(544);
        a1.add(5);
        a1.add(4);
        a1.add(154);
        System.out.println("Original list = "+a1);
        Collections.reverse(a1);
        System.out.println("Reverse list "+a1);
        System.out.println("Before Sorting = "+a1);
        Collections.sort(a1);
        System.out.println("After Sorting = "+a1);
        Collections.sort(a1,Collections.reverseOrder());
        System.out.println("Sorting in reverse Order = "+a1);


    }
}
