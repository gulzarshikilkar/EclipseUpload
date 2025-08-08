import java.util.*;
public class TemperatureApp{

    public static void main(String x[]){
           float a ;
           float celsius;
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter the temperature  in Fahrenheit");

             a=sc.nextFloat();
             celsius=(a-32)*5/9;
           System.out.println("The temperature in celsius"+celsius);
          
    }

}