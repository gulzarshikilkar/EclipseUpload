import java.util.*;
public class TemperaturefahApp{

    public static void main(String x[]){
           float a ;
           float fah;
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter the temperature  in Celsius");

             a=sc.nextFloat();
             fah=(a*9/5)+32;
           System.out.println("The temperature Fahrenheit is "+fah);
          
    }

}