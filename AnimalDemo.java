
public class AnimalDemo {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.name = "Sürüngen";
		Dog d = new Dog();
		d.name = "Boncuk";
		Cat c = new Cat();
		c.name = "Mestan";
		
		
		a.doYourThing();
		System.out.println("----------------");
		d.doYourThing();
		System.out.println("----------------");
		c.doYourThing();

	}

}
