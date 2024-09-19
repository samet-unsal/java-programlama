
public class KutuTest {

	public static void main(String[] args) {
		
		Kutu kutu1 = new Kutu(1,1,1);
		System.out.println("Kutunun genişliği: " + kutu1.genislik);
		System.out.println("Kutunun hacmi: " + kutu1.hacimHesapla());
		System.out.println("-------------");
		
		kutu1.genislik = 4.7F;
		System.out.println("Kutunun genişliği: " + kutu1.genislik);
		System.out.println("Kutunun hacmi: " + kutu1.hacimHesapla());
		

	}

}
