package Java_PW.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class DArraytoArrayList {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4,3,2,1} ;
        ArrayList <Integer> a1 = new ArrayList<>() ;
        for(int i : arr) {
            a1.add(i);
        }
        Collections.sort(a1);
        System.out.println(a1);
    }
}
