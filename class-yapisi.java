
public class Kutu {
	
	private float genislik;
	private float yukseklik;
	private float derinlik;
	
	public Kutu(float genislik, float yukseklik, float derinlik) {//parantez içindekiler lokal değişkendir, this keywordü ile bu değişkeni
																//class içindeki global değişken olduğunu işaret ediyoruz.
		/*this.genislik=genislik; //bu şekilde tanım yaparsak ilk atamada negatif değerler atayabiliriz.
		this.yukseklik=yukseklik;//parametreleri direkt set metotuyla atarsak kontrolü direkt yapacak.
		this.derinlik=derinlik;*/
		setGenislik(genislik);
		setYukseklik(yukseklik);
		setDerinklik(derinlik);
	}

	public float hacimHesapla() {
		return this.genislik * this.yukseklik * this.derinlik;
	}
	
	public void setGenislik(float genislik){
		if (genislik > 0) {
			this.genislik = genislik;
		}
		else {
			this.genislik = 1;
		}
	}
	
	public float getGenislik() {
		return this.genislik;
	}
	
	public void setYukseklik(float yukseklik){
		if (yukseklik > 0) {
			this.yukseklik = yukseklik;
		}
		else {
			this.yukseklik = 1;
		}
	}
	
	public float getYukselik() {
		return this.yukseklik;
	}
	
	public void setDerinklik(float derinlik){
		if (derinlik > 0) {
			this.derinlik = derinlik;
		}
		else {
			this.derinlik = 1;
		}
	}
	
	public float getDerinlik() {
		return this.derinlik;
	}
}
