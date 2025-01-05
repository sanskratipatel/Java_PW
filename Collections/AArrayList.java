package Java_PW.Collections;

import java.util.ArrayList;

public class AArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(12);
        a1.add(13);
        a1.add(14);
        a1.add(15);
        a1.add(16);
        System.out.println("Get Method = " +a1.get(2)) ;
        for(int i = 0 ; i <a1.size() ; i++) {
            System.out.println(a1.get(i));
        }
        System.out.println("Print all list = "+ a1);
        a1.add(2,10);
        System.out.println("Add method in any index = "+a1 );
        a1.set(1,1000);
        System.out.println("Change Array value any index I change in 1st index = "+a1);
        a1.remove(3);
        System.out.println("Remove Array value by  Index= "+a1);
        a1.remove(Integer.valueOf(12));
        System.out.println("Remove Array value using remove value = "+a1);
        

    }
}
