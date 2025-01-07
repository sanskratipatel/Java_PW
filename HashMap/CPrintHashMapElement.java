package Java_PW.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CPrintHashMapElement {
    public static void main(String[] args) {
        Map<String,Integer> m1 = new HashMap<>() ;
        m1.put("Anu" , 1) ;
        m1.put("Pannu" , 2);
        m1.put("Abhi" , 3) ;
        m1.put("Ved" , 4) ;
        System.out.println(m1.entrySet());
        for(var i : m1.entrySet()) {
            System.out.printf("Value of %s is %d \n",i.getKey(),i.getValue());
        }

    }
}
