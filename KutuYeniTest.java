
public class KutuYeniTest {

	public static void main(String[] args) {
		KutuYeni kutu1 = new KutuYeni(10,20,30);
		KutuYeni kutu2 = new KutuYeni(2,4,6);
		KutuYeni kutu3 = new KutuYeni(20,10,30);
		
		System.out.println(kutu1.compareTo(kutu2));
		System.out.println(kutu1.compareTo(kutu3));
		System.out.println(kutu2.compareTo(kutu3));

	}

}
