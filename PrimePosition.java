import java.util.Scanner;
public class PrimePosition {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,count=0;
		int  arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
			for(int i=2;i<arr.length;i++){
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						count++;
						break;
					}
				}
				if(count==0)
				sum=sum+arr[i];
			}
			System.out.println(sum);
			
		}
	}
