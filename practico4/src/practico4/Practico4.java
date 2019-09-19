package practico4;

public class Practico4 {

	public static void main(String[] args) {
		System.out.println(factorial(19));
		System.out.println(potencia(85,0));
		System.out.println(potencia(2,-3));
		System.out.println(potencia(2,3));
	}
	
	private static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
	
	private static double potencia(int base, int exponente) {
		if (exponente == 0) {
			return 1;
		} else if (exponente < 0) {
			return 1 / potencia(base, -exponente);
		} else {
			return base * potencia(base, exponente -1);
		}
	}
}
