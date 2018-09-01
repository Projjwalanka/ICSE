package icse;

import java.util.Scanner;

// Page 149: 3
public class Greatest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b && b==c){
			System.out.println("All numbers are equal");
		}else{
			int max=Math.max(a, b);
			max=Math.max(max, c);
			System.out.println("Max is:"+max);
		}
	}
}
