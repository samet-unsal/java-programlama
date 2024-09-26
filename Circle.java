
public class Circle extends Shape {
	
	public static final float PI = 3.14F;
	public int yaricap;
	
	
	public Circle (int yaricap) {
		this.yaricap = yaricap;
		name = "Daire";
	}
	
	public float area() {
		return PI * yaricap * yaricap;
	}

}
