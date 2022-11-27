package HybridInheritance;

public class F extends C {
	public void f_method()
	{
		System.out.println("Class F method");
	}
	public static void main(String args[])
	{
		F obj_f=new F();
		obj_f.a_method();
		obj_f.b_method();
		obj_f.c_method();
		obj_f.f_method();
		System.out.println();
		
		D obj_d=new D();
		obj_d.a_method();
		obj_d.b_method();
		obj_d.c_method();
		obj_d.d_method();
		System.out.println();
		
		E obj_e=new E();
		obj_e.a_method();
		obj_e.b_method();
		obj_e.c_method();
		obj_e.e_method();
		System.out.println();
	}
}
