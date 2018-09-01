//Page 150: 9
package icse;

import java.util.Scanner;

public class TaxiBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter taxi number and distance coveed");
		int taxiNo=sc.nextInt();
		int dist=sc.nextInt();
		int tmp=dist;
		int fare=0;
		fare=100;
		dist=dist-5;
		if(dist>10){
			fare=fare+10*10;
			dist=dist-10;
			if(dist>10){
				fare=fare+10*8;
				dist=dist-10;
				fare=fare+dist*5;
			}
			else{
				fare=fare+dist*8;
			}
		}
		else{
			fare=fare+dist*10;
		}
		System.out.println("Taxi no:"+taxiNo+"\nDistance Covered:"+tmp+"\nAmount:"+fare);
	}

}
