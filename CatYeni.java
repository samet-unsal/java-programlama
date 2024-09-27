
public class CatYeni extends Animal2 implements Pet {
	
	public String name;

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
