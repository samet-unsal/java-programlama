
public class TestSinifi2 {

	public static void main(String[] args) {
		
		/*
		Animal2 a;
		
		a = new Cat2();
		a.makeNoise();
		
		a = new Dog2();
		a.makeNoise();
		*/
		Animal2 [] hayvanDizi = new Animal2[2];// oluşturduğumuz nesneleri Animal2 sınıfı katmanı üzerinden gösteriyoruz ve dolayısıyla
											   // alt sınıflarda tanımlamış olduğumuz sınıfa özel metotlara erişmek için nesneyi en özel (hiyerarşideki en alt sınıf)
		                                       // sınıf katmanı üzerinden göstermemiz (casting) gerekiyor.
		
		hayvanDizi[0] = new Dog2();
		hayvanDizi[1] = new Cat2();
		
		
		
		for (int i = 0; i<hayvanDizi.length;i++) {
			hayvanDizi[i].makeNoise();
			if (hayvanDizi[i] instanceof Dog2) {// casting işlemi yaparak Dog2 sınıfına ait olan metotu çağırmayı sağladık.
				Dog2 a = (Dog2) hayvanDizi[i];// Dog2 sınıfında oluşturduğumuz nesne Animal2 katmanı üzerinden gösteriliyordu ancak biz onun gösterdiği katmanı
											  // Dog2 sınıfı katmanı üzerinden göstermiş olduk.
				a.bark();
			}
			
		}
		
	}

}
