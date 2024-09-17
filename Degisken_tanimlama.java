import java.util.Scanner;

public class Degisken_tanimlama {

	public static void main(String[] args) {
		int x = 5;
		float y = 7.27f;//float tanımında değerin sonuna f ya F yazmamız gerekir
		// çünkü default olarak double türünde değişken tanımlar.
		System.out.print("Merhaba");
		System.out.print("Dünya\n");
		System.out.println("Hello");//println default olarak \n koyar.
		System.out.println("World");
		System.out.println("integer x:"+ x);
		System.out.println("float y:" + y);
		Scanner konsoldanOku = new Scanner(System.in);
		System.out.println("Lütfen bir sayı girin:");
		x = konsoldanOku.nextInt();
		System.out.println("x'in degeri:"+x);
		konsoldanOku.close();
	}

}
