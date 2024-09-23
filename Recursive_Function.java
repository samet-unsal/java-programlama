
public class Recursive_Function {
	
	public static int fib(int num) {//main içinde kullanabilmek için bu şekilde yazdık
		if (num < 0) {
			return -1;
		}
		else if (num == 0) {
			return 0;
		}
		else if (num == 1) {
			return 1;
		}
		else {
			return fib(num-1)+fib(num-2);
		}
	}
	
	public static void main(String[] args) {
		for (int i=-3;i<10;i++) {
			System.out.println(i+". fibonacci degeri: "+fib(i));
		}
	}
}