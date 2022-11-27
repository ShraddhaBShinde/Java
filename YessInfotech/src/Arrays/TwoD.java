package Arrays;

public class TwoD {
	public static void main(String args[])
	{
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++)  //for row
		{
			for(int j=0;j<3;j++)  //for column
			{
				System.out.print(arr[i][j]+" ");  //space for next column
			}
			System.out.println();  //new line after completing 1 row
		}
	}
}
