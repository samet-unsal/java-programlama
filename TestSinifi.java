
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
		
		System.out.println("----------------");
		System.out.println("ANIMAL FARM");
		
		Animal1[] hayvanlar = new Animal1[3];
		hayvanlar[0] = new Cat1();
		hayvanlar[1] = new Dog1();
		hayvanlar [2] = new Kus();
		
		for (int i = 0; i< hayvanlar.length; i++) {
			hayvanlar[i].makeNoise();
			if (hayvanlar[i] instanceof Dog1) {//bark() fonksiyonu sadece Dog1 sınıfına ait olduğu için nesneyi Dog1 sınıfına cast etmemiz gerekir.
				Dog1 d = (Dog1) hayvanlar[i];
				d.bark();
			}
		}
				
	}

}
