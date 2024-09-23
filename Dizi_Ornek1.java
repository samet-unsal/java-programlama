
public class Dizi_Ornek1 {

	public static void main(String[] args) {
		int[] dizi = {3,5,7,-9,0};
		System.out.print("Dizinin başlangıç değer: [");
		for (int i=0;i<dizi.length;i++) {
			System.out.print(dizi[i] + " ");
		}
		System.out.println("]");
		
		for (int i=0;i<dizi.length/2;i++) {
			int sagIndex = dizi.length-1-i;
			int temp = dizi[i];
			dizi[i]=dizi[sagIndex];
			dizi[sagIndex]=temp;	
		}
		
		System.out.print("Dizinin başlangıç değer: [");
		for (int i=0;i<dizi.length;i++) {
			System.out.print(dizi[i] + " ");
		}
		System.out.println("]");
}
}