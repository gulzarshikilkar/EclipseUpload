import java.util.*;
public class EquilateralTriangleApp{

    public static void main(String x[]){
           double a,area ;
           
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter the length of side for an equilaeral triangle");

             a=sc.nextDouble();
        
             area=(1.7320/4)*(a*a);
           System.out.println("The Area of Equilateral Traingle  is "+area);
          
    }

}