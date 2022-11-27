package HeirarchicalInheritance;

public class Cat extends Animal {
	public void cat()
	{
		System.out.println("Cat eat rat");
	}
	public static void main(String args[])
	{
		Cat c=new Cat();
		c.cat();
		c.animal_eats();
		
		Dog d=new Dog();
		d.dog();
		d.animal_eats();
	}
}
