import java.util.Scanner;

public class fordongusuornek {

	public static void main(String[] args) {
		//Bir tam sayı girin, girilen sayıyla
		//içi dolu kare
		//içi boş kare
		//eşkenar dik üçgen çizin
		Scanner konsoldanOku = new Scanner(System.in);
		System.out.println("------Kare çizdirme-------");
		//içi dolu kare
		System.out.print("Lütfen kenar uzunluğu girin:");
		
		int sayi=konsoldanOku.nextInt();
		int i,j;
		for (i=0;i<sayi;i++)
		{
			System.out.print("*");
			for (j=0;j<sayi-1;j++){
				System.out.print(" *");
			}
			System.out.println("");
		}
		
		//içi boş kare
		System.out.println("-----İçi boş kare çizdirme-----");
		for (i=0;i<sayi;i++) {
			for (j=0;j<sayi;j++) {
				if (i==0 || i== sayi-1 || j==0 || j==sayi-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
				
		}
		//eşkenar dik üçgen çizdirme
		System.out.println("-----Eşkenar Dik Üçgen Çizdirme------");
		for (i=0;i<sayi;i++){
			for (j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//tersten eşkenar dik üçgen
		System.out.println("----Tersten Eşkenar Dik Üçgen Çizdirme------");
		for(i=sayi;i>=0;i--) {
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
				
	}
}