
public class Cat2 extends Animal2 implements Pet{

	public String name;

	public Cat2() {
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		
		this.name = name;
	}

	@Override
	public void makeNoise() {
		
		System.out.println("Miyav");

	}

}
