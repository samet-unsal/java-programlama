
public class TestSinifi {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(6, 4);
		
		System.out.println("İsim: " + r1.name);
		System.out.println("Genişlik: " + r1.genislik);
		System.out.println("Yükseklik: " + r1.yukseklik);
		System.out.println("Alan: " + r1.area());
		System.out.println("----------------");
		
		
		Circle c1 = new Circle(8);
		System.out.println("İsim: " + c1.name);
		System.out.println("Yarıçap: " + c1.yaricap);
		System.out.println("Alan: " + c1.area());
		System.out.println("----------------");
		
	}

}
