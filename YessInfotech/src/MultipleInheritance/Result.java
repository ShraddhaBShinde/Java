package MultipleInheritance;

public class Result implements Student,Exam {

	@Override
	public void percent_call() {
		double percent=(marks1+marks2/200)*100;
		System.out.println("Percentage is: "+percent);

		
	}

	@Override
	public void get_details() {
		{
			String name="Shraddha";
			int roll=24;
			System.out.println("Name is: "+name);
			System.out.println("Roll No is: "+24);
			
		}
		
	}	
	public static void main(String args[])
	{
		Result r=new Result();
		r.get_details();
		r.percent_call();
	}
	
}
