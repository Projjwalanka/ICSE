//Page 150: 10
package icse;

import java.util.Scanner;

public class Showroom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total cost:");
		int cost=sc.nextInt();
		String gift="";
		if(cost<=2000){
			cost=(cost*95)/100;
			gift="Calculator";
		}
		else if(cost>=2001 && cost<=5000)
		{
			cost=(cost*90)/100;
			gift="School Bag";
		}
		else if(cost>=5001 && cost<=10000)
		{
			cost=(cost*85)/100;
			gift="Wall Clock";
		}
		else if(cost>=10001)
		{
			cost=(cost*80)/100;
			gift="Wrist Watch";
		}
		System.out.println("Amount to be paid:"+cost+"\nGift:"+gift);

	}

}
