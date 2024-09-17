import java.util.Scanner;

public class dowhile_yapisi {

	public static void main(String[] args) {
		Scanner konsoldanOku = new Scanner(System.in);//sistemin konsolundan okuma işlemi yapar.
		/* Kullanıcının girdiği sayının 3 katını ekrana yazan programı yazınız.
		 Kullanıcı -1 girince döngünden çık*/
		
		int deger;
		do {
			System.out.println("Değer giriniz:");
			deger = konsoldanOku.nextInt();
			int uckati= 3*deger;
			System.out.println("Girdiğiniz sayının 3 katı:"+ uckati);
		}
			
		while (deger != -1);
		System.out.println("Döngüden çıktınız!");
		konsoldanOku.close();
	}

}
