package HybridInheritance;

public class Heirarchical1_2 extends Heirarchical1 {
	public void heirarchicalchild2()
	{
		System.out.println("I am sibling of of child1");
	}
	public static void main(String args[])
	{
		
		Heirarchical1_2 h=new Heirarchical1_2(); //we need to create another object of sibling
		h.singleparent();
		h.heirarchicalparent();
		h.heirarchicalchild2();
		
		Heirarchical1_1 h2=new Heirarchical1_1();  //we need to create another object of the sibling
		h2.singleparent();
		h2.heirarchicalparent();
		h2.heirarchicalchild1();
		
	}
}
