
public class BILOgrenci {
	private String isim;
	private int ogrNo;
	private BILOgrenci labArkadasi;
	
	public BILOgrenci(String isim,int ogrNo) {
		this.isim=isim;
		this.ogrNo=ogrNo;
		
	}
	
	public void labArkadasiAta(BILOgrenci labArkadasi) {
		this.labArkadasi=labArkadasi;
	}
	
	public void bilgileriYaz() {
		System.out.println("-------------------");
		System.out.println("Öğrencinin;");
		System.out.println("İsmi: " + isim);
		System.out.println("Numarası: "+ ogrNo);
		if(labArkadasi != null) {
			System.out.println("Lab Arkadaşı: "+ labArkadasi.getIsim());
		}
		else {
			System.out.println("Lab arkadaş yok");}
	}
			
	
	public String getIsim() {
		return this.isim;
	}
	
	public int getOgrNo() {
		return ogrNo;
	}

	public BILOgrenci getLabArkadasi() {
		return labArkadasi;
	}
	
	
}
