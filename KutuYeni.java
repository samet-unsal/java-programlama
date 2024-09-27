public class KutuYeni implements Comparable<KutuYeni> {
	
	private float genislik;
	private float yukseklik;
	private float derinlik;
	
	public KutuYeni(float genislik, float yukseklik, float derinlik) {
		setGenislik(genislik);
		setYukseklik(yukseklik);
		setDerinlik(derinlik);
	}
	
	public KutuYeni(float boyut) {
		this(boyut, boyut, boyut);
		/*
		setGenislik(boyut);
		setYukseklik(boyut);
		setDerinlik(boyut);
		*/
	}
	
	public KutuYeni(KutuYeni ornekKutu) {
		setGenislik(ornekKutu.getGenislik());
		setYukseklik(ornekKutu.getYukseklik());
		setDerinlik(ornekKutu.getDerinlik());
	}
	
	public float hacimHesapla() {
		float hacim = this.genislik * this.yukseklik * this.derinlik;
		return hacim;
	}
	
	public void setGenislik(float genislik) {
		if(genislik > 0) {
			this.genislik = genislik;
		}
		else {
			this.genislik = 1;
		}
	}
	
	public void setYukseklik(float yukseklik) {
		if(yukseklik > 0) {
			this.yukseklik = yukseklik;
		}
		else {
			this.yukseklik = 1;
		}
	}
	
	public void setDerinlik(float derinlik) {
		if(derinlik > 0) {
			this.derinlik = derinlik;
		}
		else {
			this.derinlik = 1;
		}
	}
	
	public float getGenislik() {
		return this.genislik;
	}
	
	public float getYukseklik() {
		return this.yukseklik;
	}
	
	public float getDerinlik() {
		return this.derinlik;
	}

	@Override
	public int compareTo(KutuYeni o) {
		float hacimFarki = this.hacimHesapla() - o.hacimHesapla();
		
		if (hacimFarki > 0) return 1;
		else if (hacimFarki == 0) return 0;
		else return -1;
	}

}