import java.util.Scanner;

public class DiziOrnek {

	public static void main(String[] args) {
		
		Scanner konsoldanOku = new Scanner(System.in);
		int[] dizi = new int[5];
		float toplam=0;
		float ortalama;
		
		for (int i=0; i < dizi.length; i++) {
			System.out.print("Lütfen "+(i+1)+".sayıyı girin:");
			dizi[i]=konsoldanOku.nextInt();
			toplam+=dizi[i];
		}
		ortalama=(toplam/dizi.length);
		
		int min = dizi[0];
		int minindex = 0;
		
		for (int i=1;i<dizi.length;i++) {
			if(dizi[i]<min) {
				min=dizi[i];
				minindex=i;
			}
		}
		System.out.println("Dizinin minimum değer: "+min);
		System.out.println("Dizinin minimum değer indexi: "+minindex);
		System.out.println("Dizinin ortalaması: "+ortalama);
		konsoldanOku.close();

	}

}
