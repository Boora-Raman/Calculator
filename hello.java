import java.util.*;
public class hello
  {
    static int add(int a , int b)
    {
      return a+b;
    }

        static int subtract(int a , int b)
    {
      return a-b;
    }
  public static void main(String[] args)
    {
    // System.out.println("this is run in jenkine from the github repo");
    Scanner in = new Scanner(System.in);
    int  a = in.nextInt();
    int  b = in.nextInt();
     System.out.println("Addition Of a = "+a +" b = " +b +" is " +add(a,b) ) ;
           System.out.println("subtraction Of a = "+a +" b = " +b +" is " +subtract(a,b) ) ;
      
      
    }
  }
