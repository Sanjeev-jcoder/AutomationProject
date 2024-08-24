package String;

import java.util.Scanner;

public class SwapNumbers{
	
	
	
	public static void main (String[] args)
	
	{
		int x,y, temp;
		System.out.println("Enter X an Y");
		Scanner in = new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		System.out.println("Values before swapping ="+x + y);
		temp = x;
		x=y;
		y=temp;
		System.out.println("Values after swapping ="+x + y);		
		
	}
	
	
}
