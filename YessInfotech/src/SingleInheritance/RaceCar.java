package SingleInheritance;

public class RaceCar extends ThemeAutomobile{
	public void car()
	{
		System.out.println("I am racecar");
	}
	public static void main(String args[])
	{
		RaceCar rc=new RaceCar();
		rc.theme();
		rc.car();
	}
}
