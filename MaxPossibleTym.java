import java.util.*;
public class MaxPossibleTym {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 System.out.println("Enter 4 digits ");
	 int arr[]=new int[4];
	 int clock [] = new int[4];
	 String s="";
	 for (int i = 0; i < 4; i++) {
	  arr[i]=scan.nextInt();
	  s+=arr[i];
	}
	 if(arr[0]==arr[1] && arr[0]==arr[2] && arr[0]==arr[3] && arr[0]>=3) {
	 System.out.println("-1 ..args. exiting to main menu");
	 main(new String [] {});
	 }
	 scan.close();
	Arrays.sort(arr);
	int temp =0;
	int index =0;
	for (int i = 0; i < arr.length; i++) {
	if(arr[i]<=2) {
	temp=arr[i];
	index=i;
	}
	}
	arr[index]=0;
	s=s.replaceFirst(String.valueOf(temp), "");	
	clock[0]=temp;
	Arrays.sort(arr);
	if(clock[0]==2) {
	temp =0;
	index =0;
	for (int i = 0; i < arr.length; i++) {
	if(arr[i]<=3) {
	temp=arr[i];
	index=i;
	}
	}
	arr[index]=0;
	s=s.replaceFirst(String.valueOf(temp), "");	
	clock[1]=temp;
	Arrays.sort(arr);
	}else{
	temp =0;
	index =0;
	for (int i = 0; i < arr.length; i++) {
	if(arr[i]<=9) {
	temp=arr[i];
	index=i;
	}
	}
	arr[index]=0;
	s=s.replaceFirst(String.valueOf(temp), "");	
	clock[1]=temp;
	Arrays.sort(arr);
	}	
	temp =0;
	index =0;
	for (int i = 0; i < arr.length; i++) {
	if(arr[i]<=5) {
	temp=arr[i];
	index=i;
	}
	}
	arr[index]=0;
	s=s.replaceFirst(String.valueOf(temp), "");	
	clock[2]=temp;
	Arrays.sort(arr);

	temp =0;
	index =0;
	for (int i = 0; i < arr.length; i++) {
	if(arr[i]>0) {
	temp=arr[i];
	index=i;
	}
	}	
	clock[3]=temp;
	Arrays.sort(arr);
	System.out.println("Time : "+clock[0]+clock[1]+" : "+clock[2]+clock[3]);
	}
	}


