import java.util.Scanner;

public class ReplacezerobyOne {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number size:");
		int n=sc.nextInt();
		System.out.println("enter array size:");
		int[]a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(a[i]==0){
				a[i]=1;
			}
		}
		for(int i=0;i<n;i++){
		System.out.print(a[i]+ " ");
		}
		sc.close();
	}

}
