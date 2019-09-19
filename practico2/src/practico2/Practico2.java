package practico2;

public class Practico2 {

	public static void main(String[] args) {
		ej3(8, 4);
		ej5(30,14);
		
		System.out.println(esCapicua(1235321));
	}

	private static void ej3(int a, int b) {
		int cont = 0;

		while (a >= b) {
			cont++;
			a -= b;
		}
		
		System.out.println("Cociente: " + cont);
		System.out.println("Resto: " + a);
	}
	
	private static int ej4(int a, int b) {
		int max = (a >= b) ? a : b;
		int min = (a <= b) ? a : b;
		
		while (min > 0) {
			int aux = max;
			max = min;
			min = aux % min;
		}
		
		return max;
	}
	
	private static void ej5(int num, int den) {
		int mcd = ej4(num, den);
		System.out.println("" + num/mcd + ((den/mcd > 1) ? "/" + den/mcd : ""));
	}
	
	private static boolean esCapicua(int num) { //Ej6
		String str = "" + num;
		boolean esCapicua = false;
		int i = 0;
		
		while (i < str.length() / 2 && !esCapicua) {
			esCapicua = str.charAt(i) == str.charAt(str.length() - 1 - i);
			i++;
		}
		
		return esCapicua;
	}
	
//	private static int maxVector(int[] v, int desde, int hasta) {
//		
//	}
}
