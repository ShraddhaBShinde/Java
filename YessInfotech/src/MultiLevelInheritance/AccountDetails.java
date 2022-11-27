package MultiLevelInheritance;

import java.util.Scanner;

public class AccountDetails extends SavingAccount {
	public void deposits()
	{
		System.out.println("You deposited 2154");
	}
	public void withdrawals()
	{
		System.out.println("You withdrawed 7855");
	}
	
	public static void main(String args[])
	{
		AccountDetails ad=new AccountDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String n=sc.next();
		ad.Cust_name(n);
		System.out.println("Enter your acc no.: ");
		int num=sc.nextInt();
		ad.acc_no(num);
		ad.Min_bal();
		ad.saving_bal();
		ad.deposits();
		ad.withdrawals();
	}
}
