
public class BILOgrenciDemo {

	public static void main(String[] args) {
		
		BILOgrenci ogr1 = new BILOgrenci("Ahmet", 1234);
		BILOgrenci ogr2 = new BILOgrenci("Mehmet", 1235);
		BILOgrenci ogr3 = new BILOgrenci("Ayşe", 1236);
		
		ogr1.labArkadasiAta(ogr2);
		ogr2.labArkadasiAta(ogr1);
		
		
		ogr1.bilgileriYaz();
		ogr2.bilgileriYaz();
		ogr3.bilgileriYaz();

	}

}
