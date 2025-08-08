import java.util.*;
public class SimpleinterstApp{

    public static void main(String x[]){
               float principalAmt,rate,time,si;
                Scanner sc=new Scanner(System.in);
                  System.out.println("Enter the principal amount");
                  principalAmt=sc.nextFloat();
                 System.out.println("enter the rate of interest");
                   rate=sc.nextFloat();
                 System.out.println("Enter the Duartion in years");
                     time=sc.nextFloat();
                  si=(principalAmt*rate*time)/100;
                 System.out.println("The Simple interest is "+si);



    }

}