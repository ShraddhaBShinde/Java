package innerclassdemo;

interface Addable
{
	public void add(int a,int b);
	public void sub(int x,int y);
}

public class Anonymous {
	public static void main(String args[])
	{
		Addable ad=new Addable() {

			@Override
			public void add(int a, int b) {
				System.out.println("Addition is: "+(a+b));
				
			}

			@Override
			public void sub(int x, int y) {
				System.out.println("Subtraction is: "+(x-y));
				
			}
			
		};
		ad.add(2, 10);
		ad.sub(10, 0);
	}
}
