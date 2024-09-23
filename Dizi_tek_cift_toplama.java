
public class Dizi_tek_cift_toplama {

	public static void main(String[] args) {
		int[] dizi = {3,5,7,-9,0};
		int tekToplam = 0;
		int ciftToplam = 0;
		
		for(int i=0;i<dizi.length;i++) {
			if (i%2 == 0) {
				ciftToplam+=dizi[i];
			}
			else {
				tekToplam+=dizi[i];
			}
		}
		
		System.out.println("Tek indislerin değerleri toplamı: "+tekToplam);
		System.out.println("Çift indislerin değerleri toplamı: "+ciftToplam);
		System.out.println("Tek Toplamlar ile Çift toplamların farkı: "+(tekToplam-ciftToplam));
		
		if (tekToplam>ciftToplam) {
			System.out.println("Tek indislerin değerleri toplamı büyüktür.");
		}
		else if (ciftToplam>tekToplam){
			System.out.println("Çift indislerin değerleri toplamı büyüktür.");
		}
		else {
			System.out.println("İki toplam birbirine eşittir.");
		}
}
}