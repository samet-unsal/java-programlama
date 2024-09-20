
public class DiziDemo {

	public static void main(String[] args) {
		
		int[] dizi1 = new int[10];
		//dizi indekslerine değer atama
		for (int i=0; i<dizi1.length; i++) {
			dizi1[i]= i * i;
		}
		
		//dizi değerlerini ekrana bastırma
		
		for (int i=0; i<dizi1.length;i++) {
			System.out.printf("%d.index değerinin karesi:%d\n",i,dizi1[i]);
		}
		System.out.println("---------------");
		
		for (int i=0;i<dizi1.length;i++) {
			System.out.println(i+". indexteki değer: "+dizi1[i]);
		}

	}

}
