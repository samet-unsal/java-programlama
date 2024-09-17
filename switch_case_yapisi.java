import java.util.Scanner;

public class switch_case_yapisi {

	public static void main(String[] args) {
		Scanner konsoldanOku = new Scanner(System.in);
		int aybilgisi;
		int gun;
		System.out.println("Lütfen bir sayı girin:");
		aybilgisi = konsoldanOku.nextInt();
		while (aybilgisi<1 || aybilgisi>12) {
			System.err.println("Girdiğiniz sayı 1'den küçük ya da 12'den büyük olamaz!");
			System.out.println("Lütfen [1,12] aralığında bir sayı giriniz:");
			aybilgisi = konsoldanOku.nextInt();
			}
		switch(aybilgisi) {
			case 4:
			case 6:
			case 9:
			case 11:
				gun= 30;
				break;
			case 2:
				gun= 28;
				break;
			default:
				gun=31;
				break;
		}
		System.out.println(aybilgisi + ".ay içerisinde " + gun + " gün vardır.");
		konsoldanOku.close();

	}

}
