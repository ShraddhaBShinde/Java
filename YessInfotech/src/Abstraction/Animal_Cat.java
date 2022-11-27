package Abstraction;

public class Animal_Cat extends Abstraction_Animal {
	
	//it is neccessary to override both methods (its the rule)
	//but if we do not want a specific method we can keep the body empty

	@Override
	public void cat() {
		System.out.println("Cat Meow :)");		
	}

	
	//we can fill this body or keep empty according to our need
	@Override
	public void dog() {
		// TODO Auto-generated method stub
		
	}
	
}
