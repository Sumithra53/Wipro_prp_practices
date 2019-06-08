import java.util.*;
	public class Reverse {
		public static void main(String[]args){
			String s="ab#c,d";
	 //StringBuffer sb=new StringBuffer(s);
			//System.out.println(sb.reverse());
			char a[]=s.toCharArray();
			String str="";
			String str1="";
			for(int i=0;i<s.length();i++){
				if(a[i]>='a'&&a[i]<='z')str+=a[i];
				//System.out.print(str+"");
				else
					  str1+=a[i];
			}
			StringBuffer sb=new StringBuffer(str);
			String rev=sb.reverse().toString();
			int l=0,k=0;
			for(int i=0;i<s.length();i++){
				if(a[i]>='a'&& a[i]<='z'){
					System.out.print(rev.substring(l,l+1));
					l++;
				}
				else{
					System.out.print(str1.substring(k,k+1));
					k++;
				}
				
			}
			
		}

	}

