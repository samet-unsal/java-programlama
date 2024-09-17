import java.util.Scanner;

public class if_yapisi {

	public static void main(String[] args) {
		Scanner konsoldanOku = new Scanner(System.in);//sistemin konsolundan okuma işlemi yapar.
		System.out.print("Lütfen yaşınızı giriniz: ");
		int yas = konsoldanOku.nextInt();
		System.out.println("Yaşınız:" + yas);
		if (yas < 18) {
			int fark = 18 - yas;
			System.out.println("Ehliyet alabilmek için " + fark +
								" yıl beklemeniz gerekir.");
		}
		else if (yas>=18 && yas<65){
			System.out.println("Ehliyet alabilirsiniz!");
		}
		else {
			System.out.println("Yaşınız ehliyet almak için uygun değil!");
		}
	
		konsoldanOku.close();
	}

}
