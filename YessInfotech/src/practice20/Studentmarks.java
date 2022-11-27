package practice20;

public class Studentmarks {
	public int MarksSum(int english, int maths, int science)
	{
		int sum=english+maths+science;
		return sum;
	}
	public int MarksAvg(int english, int maths, int science)
	{
		int per=english+maths+science/3;
		return per;
	}
	public static void main(String args[])
	{
		Studentmarks cal=new Studentmarks();
		System.out.println("Sum is: "+cal.MarksSum(70, 80, 50));
		System.out.println("Avg is: "+cal.MarksAvg(70, 80, 50));
	}
}
