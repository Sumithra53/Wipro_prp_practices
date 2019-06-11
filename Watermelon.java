import java.util.Scanner;

public class Watermelon {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int wght=sc.nextInt();
		if(wght<=100){
			if(wght%2==0){
				if((wght/2)%2==0){
					System.out.println("yes");
				}
				else{
					System.out.println((wght/2+1)+" "+(wght/2-1));
				}
			}
			else{
				System.out.println("no");
			}
			
		}
		else{
			System.out.println("Invalid");
		}
	}

}
