
public class Faktoriyel_recursive {
	
	
	public static int faktoriyel(int sayi){
		
		if (sayi<0) {
			return -1;
		}
		
		else if (sayi == 0) {
			return 1;
		}
		else {
			return sayi*faktoriyel(sayi-1);
		}
		
	}

	public static void main(String[] args) {
		
		for (int i = -3;i<10;i++) {
			System.out.println(i+"! = "+faktoriyel(i));
		}
	}

}
