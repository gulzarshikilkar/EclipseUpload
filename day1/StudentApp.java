import java.util.*;
public class StudentApp{

    public static void main(String x[]){
           int a[]=new int[5];
           int sum=0;
           double per; 
          Scanner sc=new Scanner(System.in);
          for(int i=0;i<5;i++){
                  System.out.println("enter the marks ofsubject");
                   a[i]=sc.nextInt();
                     sum=sum+a[i];
             }
                     System.out.println("The total marks of students is "+sum);
                per=(sum*100)/500;
                      System.out.println("The percentage of students is "+per);

          
    }

}