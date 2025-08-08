import java.util.*;
public class SwapwithoutApp{

    public static void main(String x[]){
              int a=10,b=20;
              
            System.out.println("before swap");
            System.out.println("A is"+a);
            System.out.println("B is"+b);
               a=a+b;
               b=a-b;
               a=a-b;
           
          System.out.println("After swap");
            System.out.println("A is"+a);
            System.out.println("B is"+b);
    }

}