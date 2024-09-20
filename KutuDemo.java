
public class KutuDemo {

	public static void main(String[] args) {
		
		Kutu kutu1= new Kutu(5,2,3);
		
		System.out.println("Kutu genişliği: "+kutu1.getGenislik());
		System.out.println("Kutunun hacmi: "+kutu1.hacimHesapla());
		
		kutu1.setGenislik(-2.7F);//kontrol kısmında genişlik atarken 0'dan küçük bir değer girdiğimiz için metot genişliği direkt 1 olarak atadı.
		System.out.println("Kutu genişliği: "+kutu1.getGenislik());
		System.out.println("Kutunun hacmi: "+kutu1.hacimHesapla());

	}

}
