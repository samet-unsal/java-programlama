
public class MainSinifi {

	public static void main(String[] args) {
		// for döngüsü sıfırdan 0dan 10'a kadar dönsün ve toplamını ve ortalamasını dönen program yazalım
		int i;
		float toplam=0f;
		for (i=0;i<10;i++) {
			toplam+=i;
			System.out.println("0'dan " + i+" sayısına kadar "+ "("+i+")" +" dahil olan sayıların toplamı:"+ toplam);
			float ortalama=toplam/(i+1);
			System.out.println("0'dan "+ i + " sayısına kadar olan sayıların ortalaması:"+ ortalama);
			System.out.printf("ortalama:%.2f",ortalama);//c formatında
		}

	}

}
