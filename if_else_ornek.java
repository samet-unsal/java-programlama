import java.util.Scanner;

public class if_else_ornek {

	public static void main(String[] args) {
		Scanner konsoldanOku = new Scanner(System.in);
		System.out.print("Lütfen ilk sayiyi giriniz:");
		float sayi1 = konsoldanOku.nextFloat();
		System.out.print("Lütfen ikinci sayiyi giriniz:");
		float sayi2 = konsoldanOku.nextFloat();
		System.out.print("Lütfen üçüncü sayiyi giriniz:");
		float sayi3 = konsoldanOku.nextFloat();
		System.out.println("Girdiğiniz sayılar:\n"+sayi1+"\n"+ sayi2+"\n"+ sayi3);
		
		if (sayi1 < sayi2 && sayi1<sayi3) {
			System.out.println("En küçük sayi:" + sayi1);
		}
		else if (sayi2<sayi3) {
			System.out.println("En küçük sayı:" + sayi2);
		}
		else {
			System.out.println("En küçük sayı:" + sayi3);
		}
		konsoldanOku.close();

	}

}
