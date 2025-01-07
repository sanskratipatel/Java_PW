package Java_PW.Exception;

public class BthrowsKeyWord {
    static int myfile(int a) throws Exception{
      return a/0;
    }
    static int newEx(int salary , int expense) throws Exception {

        if(expense> salary) {
            throw new Exception("You spend more money than your salary") ;
        }
        return 1;
    }

    public static void main(String[] args)
    {
       try {
//           System.out.println(myfile(5));
           System.out.println(newEx(1000, 2000));
       } catch(Exception e) {
           System.out.println(e.getMessage());

       }
    }
}
