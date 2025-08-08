import java.util.*;
public class CircleApp{

    public static void main(String x[]){
           float a ;
           float b=3.14f;
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter the radius  of circle");

             a=sc.nextFloat();
           
           System.out.println("The diameter of circle is "+a*2);
           
           System.out.println("The Circumference of circle is "+2*b*a);
    }

}