import java.util.*;
public class VowConso {
	public static void main(String[]args){
		System.out.println("enter string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String v="";
		String c="";
		
		int count=0;
		for(int i=0;i<str.length();i++){
			String s=str.substring(i,i+1);
			if(Character.isDigit(str.charAt(i))){
				System.out.println("INVALID");
				count=1;
			    break;
			}
			if(s.equals("a")||s.equals("A")||s.equals("e")||s.equals("E")||s.equals("i")||s.equals("I")||s.equals("o")||s.equals("O")||s.equals("u")||s.equals("U")){
				v+=s;
				}
			else{
				c+=s;
			}
		}
		if(count==0){
			int choice=sc.nextInt();
		switch(choice){
		case 1:
			System.out.println(v.toUpperCase());
			System.out.println(c.toUpperCase());
			break;
		case 2:
			System.out.println(v.toLowerCase());
			System.out.println(c.toLowerCase());
			break;
		default :
			System.out.println("invalid String");
			break;
		}
		}
		
		
	}

}
