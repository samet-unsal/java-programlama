
public class Dog2 extends Animal2 implements Pet{
	
	public String name;
	
	@Override
	public void makeNoise() {
		System.out.println("Hav Hav");
	}
	
	public void bark() {
		System.out.println("HAV HAV");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	
}
