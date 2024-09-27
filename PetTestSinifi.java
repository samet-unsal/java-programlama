
public class PetTestSinifi {


	public static void main(String[] args) {
		
		/*
		Animal2 a;
		
		a = new Cat2();
		a.makeNoise();
		
		a = new Dog2();
		a.makeNoise();
		*/
		Animal2 [] hayvanDizi = new Animal2[3];// oluşturduğumuz nesneleri Animal2 sınıfı katmanı üzerinden gösteriyoruz ve dolayısıyla
											   // alt sınıflarda tanımlamış olduğumuz sınıfa özel metotlara erişmek için nesneyi en özel (hiyerarşideki en alt sınıf)
		                                       // sınıf katmanı üzerinden göstermemiz (casting) gerekiyor.
		Dog2 d = new Dog2();
		d.setName("Pamuk");
		hayvanDizi[0] = d;
		hayvanDizi[1] = new Wolf();
		hayvanDizi[2] = new Cat2();
		
		
		
		for (int i = 0; i<hayvanDizi.length;i++) {
			if (hayvanDizi[i] instanceof Pet) {// casting işlemi yaparak Dog2 sınıfına ait olan metotu çağırmayı sağladık.
				Pet p = (Pet) hayvanDizi[i];
				System.out.print(p.getName() + ": ");
			}
			hayvanDizi[i].makeNoise();
			
		}
		
	}

}

