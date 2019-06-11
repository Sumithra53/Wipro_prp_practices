/*		OTP GENERATION RULES
1. The length of the OTP is exactly 8
2. The OTP starts with first two characters of the account type (Case sensitive)
3. The third character is first digit of the account number
4. The fourth character is the sum of first five digits of account number (if the sum
exceeds single digit then sum of digits should be done to form a single digit.
Repeat if necessary)
5. The fifth character is the first character of the account holder’s name
6. The sixth character is the sum of sixth to tenth digit positions of the account
number (if the sum exceeds single digit then sum of digits should be done to
form a single digit. Repeat if necessary)
7. The seventh character is the last character of the account holder’s name
8. The eighth character is the last digit of the account number
9. All characters should be same case of the input string*/
 package prp;

import java.util.Scanner;

public class OTPGenerate {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account holder name: ");
		String ach=sc.nextLine();
		System.out.println("enter account number: ");
		long acn=sc.nextLong();
		System.out.println("enter account type: ");
		String aty=sc.next();
		String otp=" ";
		int sum=0;
		int sum1=0;
		String acc_no=acn+"";
		if(acc_no.length()==11){
			 otp=aty.substring(0,2);
			otp+=acc_no.substring(0,1);
			
			int n=Integer.parseInt(acc_no.substring(0,5));
						int r=0;
			while(n!=0 ||sum>9){
				if(n==0){
					n=sum;
					sum=0;
				}
				r=n%10;
				sum=sum+r;
				n=n/10;
				}
			 otp+=sum;
			 otp+=ach.substring(0,1);
			 System.out.println(otp);
			 int n1=Integer.parseInt(acc_no.substring(5,10));
			    int r1=0;
				while(n1!=0 ||sum1>9){
					if(n1==0){
						n1=sum1;
						sum1=0;
					}
					r1=n1%10;
					sum1=sum1+r1;
					n1=n1/10;
					
					
				}
				otp+=sum1;
				otp+=ach.substring(ach.length()-1);
				otp+=acc_no.substring(acc_no.length()-1);
				System.out.println("OTP Generated: ");
				 System.out.println(otp);
		}
	}

}
