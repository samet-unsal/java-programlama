import java.util.Scanner;

public class for_dongusu {

	public static void main(String[] args) {
		Scanner konsoldanOku = new Scanner(System.in);
		int i,sayi;
		System.out.print("Lütfen bir sayı girin:");
		sayi = konsoldanOku.nextInt();
		for (i=1;i<sayi+1;i++) {
			System.out.println((i)+" sayısının karesi: "+(i*i));
		}
	konsoldanOku.close();
	}

}
