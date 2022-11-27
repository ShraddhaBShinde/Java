package Arrays;

public class WithArgsAndReturn {
	public int[] display(int [] i)
	{
		return i;
	}
	public static void main(String args[])
	{
		WithArgsAndReturn obj=new WithArgsAndReturn();
		int i[]= {1,2,3};
		int []arr=obj.display(i);   //object creation as method is without static
		for(int n:arr)
		{
			System.out.println(n);
		}
	}
}
