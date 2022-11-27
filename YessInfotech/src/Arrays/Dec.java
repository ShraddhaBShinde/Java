package Arrays;

public class Dec {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6,7,8};      //declaration
		System.out.println("8th element: "+arr[7]);  //arr[7]-> array with index no.
		System.out.println("6th element: "+arr[5]);
		System.out.println();
		
		System.out.println("Length of the array is "+arr.length);
		
		System.out.println("All elements:");
		for(int i=0;i<arr.length;i++) {  //length=8
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		double arr2[]=new double[5];  //for each loop
		arr2[0]=2.7;
		arr2[1]=3.5;
		arr2[2]=3.78;
		arr2[3]=4.5;
		arr2[4]=9.5;
		
		System.out.println("All elements(for each loop):");
		for(double d:arr2) {
			System.out.print(d+" ");
		}
	}
}
