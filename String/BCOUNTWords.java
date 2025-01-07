package Java_PW.String;

public class BCOUNTWords {
    public static void main(String[] args) {
           String str = "GEEK FOR GEEKS geek geeks" ;
           str = str.toLowerCase();
           String ch[] = str.split(" ");
//          for(int i = 0 ; i <ch.length ; i++) {
//              System.out.println(ch[i]);
//
//         }
           for(int i = 0 ; i<ch.length ; i++) {
               boolean found = false;
               for (int j = i+1 ; j <ch.length ; j++) {
                   if(ch[i].equals(ch[j])) {
                       found = true;
                   }

               }
               if(found == false) {
                   System.out.println(ch[i]);
               }

           }
    }
}
