package Arrays;

public class WithReturn {
	public static String[] display() 
	{
		String s[]= {"abc","def","ghi","jkl"};
		return s;
	}
	public static void main(String args[]) {
		String[] str=display();
		for(String s:str) {
			System.out.print(s+" ");
		}
	}
}
