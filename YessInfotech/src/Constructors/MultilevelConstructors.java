package Constructors;

class MultilevelConstructors2 {
	public MultilevelConstructors2() {
		System.out.println("MultilevelConstructors2");
	}
}

class MultilevelConstructors3 extends MultilevelConstructors2 {
	public MultilevelConstructors3() {
		System.out.println("MultilevelConstructors3");
	}
}

public class MultilevelConstructors extends MultilevelConstructors3 {
	public MultilevelConstructors() {
		System.out.println("MultilevelConstructors");
	}
	public static void main(String args[])
	{
		MultilevelConstructors c=new MultilevelConstructors();
	}
}
