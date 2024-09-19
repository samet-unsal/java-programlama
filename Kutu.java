
public class Kutu {
	float genislik;
	float derinlik;
	float yukseklik;
	
	public Kutu(float genislik,float derinlik,float yukseklik) {
		this.genislik=genislik;
		this.derinlik=derinlik;
		this.yukseklik=yukseklik;
	}
	
	public float hacimHesapla() {
		return genislik * yukseklik * derinlik;
	}

}
