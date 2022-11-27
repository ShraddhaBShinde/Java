package SingleInheritance;

import java.util.Scanner;

public class Dimension {
	int dial,dial2;
	Scanner sc=new Scanner(System.in);
	public void user_input()
	{
		System.out.println("Enter dial and dial2 ");
		dial=sc.nextInt();
		dial2=sc.nextInt();
	}
}
