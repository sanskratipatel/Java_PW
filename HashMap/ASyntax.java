package Java_PW.HashMap;

import java.util.*;

public class ASyntax {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("Abhi" , 1) ;
        mp.put("Ram" , 2);
        mp.put("Anu" , 23) ;
        mp.put("ANI" ,22) ;
        System.out.println(mp.get("Abhi"));
        System.out.println(mp.get("Aman"));
        mp.put("Abhi",45) ; //Update the value
        System.out.println(mp.remove("Ani") );
        System.out.println("Contain key method = "+mp.containsKey("Abhi"));
        System.out.println("Contain key method for non existing key = "+mp.containsKey("Aman"));
        System.out.println("Add if not exists already");
        mp.putIfAbsent("Sanskrati" ,100);

        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        for(String key : mp.keySet()) {
            System.out.printf("Integer of %s is %d \n" , key , mp.get(key));
        }
        for(Map.Entry<String ,Integer> e :mp.entrySet()) {
            System.out.printf("Interger of %s is %d \n ",e.getKey(), e.getValue());
        }
        System.out.println();

        for(var e : mp.entrySet()) {
            System.out.printf("Integer of %s is %d \n" , e.getKey(),e.getValue());
        }
    }
}
