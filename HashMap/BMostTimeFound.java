package Java_PW.HashMap;

import java.util.HashMap;
import java.util.Map;

public class BMostTimeFound {
    public static void main(String[] args) {
       int arr[] = {1,2,34,2,1,2,34,4,5,2,1};
        Map<Integer, Integer> m1 = new HashMap<>() ;
        for(int ele: arr) {
            if(!m1.containsKey(ele)) {
                m1.put(ele,1);
            }
            else{
                m1.put(ele , m1.get(ele)+1 ) ;
            }
        }
        System.out.println(m1.entrySet());
        for(var i : m1.entrySet()) {
            System.out.printf("Frequency for %d is %d \n ",i.getKey(), i.getValue());
        }
        int maxfreq = -1;
        int answerkey = -1;
        for(var e : m1.entrySet()) {
        if(e.getValue() > maxfreq) {
           maxfreq = e.getValue();
           answerkey = e.getKey();
         }
        }
        System.out.printf(" %d  key has max frequency and it occurs %d times \n",answerkey,maxfreq);
    }
}
