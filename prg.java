import java.util.Scanner;  
public class Prg {  
   public static void main(String[] args)   
   {  
       int  temp, sum=0, n;  
       Scanner sc = new Scanner(System.in);  
       n=sc.nextInt();  
       temp=n;  
       while(n>0)  
       {  
           int r = n%10;  
           sum = sum*10+r;  
           n = n/10;  
       }  
       System.out.println("Reverse of Number is:-" +sum);  
       if(temp==sum)  
       {  
           System.out.println("Palindrom");  
       }  
       else  
       {  
           System.out.println("Not Palindrom");  
       }  
   }  
}  
