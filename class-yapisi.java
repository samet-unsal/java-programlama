
public class Kutu {
	
	private float genislik;
	private float yukseklik;
	private float derinlik;
	
	public Kutu(float genislik, float yukseklik, float derinlik) {//parantez içindekiler lokal değişkendir, this keywordü ile bu değişkeni
																//class içindeki global değişken olduğunu işaret ediyoruz.
		this.genislik=genislik;
		this.yukseklik=yukseklik;
		this.derinlik=derinlik;
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
}
