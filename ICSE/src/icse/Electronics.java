package icse;

import java.util.Scanner;

public class Electronics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name amount and type");
		String name=sc.next();
		double cost=sc.nextDouble();
		char type=sc.next().charAt(0);
		if(type=='L'){
			if(cost<=25000){
				cost=(cost*100)/100;
			}
			else if(cost>=25001 && cost<=50000)
			{
				cost=(cost*95)/100;
			}
			else if(cost>=50001 && cost<=100000)
			{
				cost=(cost*92.5)/100;
			}
			else if(cost>=100000)
			{
				cost=(cost*90)/100;
			}
		}
		if(type=='D'){
			if(cost<=25000){
				cost=(cost*95)/100;
			}
			else if(cost>=25001 && cost<=50000)
			{
				cost=(cost*92.5)/100;
			}
			else if(cost>=50001 && cost<=100000)
			{
				cost=(cost*90)/100;
			}
			else if(cost>=100000)
			{
				cost=(cost*85)/100;
			}
		}
		System.out.println("Name:"+name+"\nNet Amount:"+cost);

	}

}
