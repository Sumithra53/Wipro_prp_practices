import java.util.*;
public class RemDup {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		String res="";
		int count=0;
		for(int i=0;i<str.length();i++){
		count=0;
		for(int j=0;j<str.length();j++){
		if(str.charAt(i)==str.charAt(j)){
		count++;
		}
		}
		if(count==1){
		res=res+str.charAt(i);
		}
		}
		System.out.println(res);
		}

		}

