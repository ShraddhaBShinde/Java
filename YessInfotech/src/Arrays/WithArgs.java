package Arrays;

public class WithArgs {
	public static void arr_display(char  c[]) {
		for(char i:c) {
			System.out.print(i+" ");
		}
	}
	public static void main(String args[]) {
		char ch[]= {'a','e','i','o','u'};
		arr_display(ch);
	}
}
