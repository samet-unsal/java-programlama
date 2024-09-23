
public class Recursive_UsAlma {
	
	public static double usAl(double taban,int us) {
		if (us == 0) {
			return 1;
		}
		else if (us == 1) {
			return taban;
		}
		else {
			us--;
			return taban * usAl(taban,us);
		}
	}
	
	public static double usAl2(double taban,int us) {
		double sonuc = 1;
		for (int i = 0;i<us;i++) {
			sonuc*=taban;
		}
		return sonuc;
	}
	
	public static double usAl3(double taban,int us) {
		if (us == 0) {
			return 1;
		}
		else if(us == 1) {
			return taban;
		}
		else if (us%2==0){
			us/=2;
			double half = usAl3(taban, us);
			return half * half;
		}
		else {
			taban-=1;
			double oneless = usAl3(taban, us);
			return oneless * taban;
		}
	}
	public static void main(String[] args) {
		
		System.out.println("2^7= "+usAl(2, 7));
		System.out.println("2^7= "+usAl2(2, 7));
	}

}
