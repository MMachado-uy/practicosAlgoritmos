package practico4;

import java.util.Arrays;
import java.util.Date;

public class Practico4 {

	public static void main(String[] args) {
		System.out.println(factorial(19));
		System.out.println(potencia(85,0));
		System.out.println(potencia(2,-3));
		System.out.println(potencia(2,3));
		listar(10);
		System.out.println("===========");
		
		long[] v = new long[93];
		v[1] = 1;
		
		Date ini = new Date(), actual, next = ini;
		long diffTotal = 0, diffAnt = 0;
		
		for (int i = 0; i < 93; i++) {
			System.out.print("fib("+i+")  = " + fibonacci(v,i));
			
			actual    = new Date();
			diffTotal = actual.getTime() - ini.getTime();
			diffAnt   = actual.getTime() - next.getTime();

			System.out.print(" Diff: "+miliFormat(diffAnt));
			System.out.println(" Total: "+miliFormat(diffTotal));

			next = actual;
		}
		
		int[] v2 = randomArray(8, 0, 30);

		System.out.println(Arrays.toString(v2));
		System.out.println(minimo(v2, 0, v2.length -1));
		System.out.println(x(2,5));
	}
	
	private static String miliFormat(long millisTotal){
		long min, seg, millis;
		min = millisTotal / 1000 / 60;
		seg = millisTotal / 1000 % 60;
		millis = millisTotal % 1000;
		return String.format("%2sm:%2ss:%3sss",min,seg,millis).replace(' ', '0');
	}
	
	private static int[] randomArray(int len, int min, int max) {
		int[] v = new int[len];
		
		for (int i = 0; i < v.length; i++) {
			v[i] = (int)(Math.random() * (max - min+1)) + min;		
		}
		
		return v;
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

	private static void listar(int n) {
		if (n > 0) {
			System.out.println(n);
			listar(n-1);
		}
	}

	private static long fibonacci(long[]v, int n) {
		if (n <= 1) {
			return n;
		} else {
			if(v[n] == 0)
				v[n] = fibonacci(v,n-1) + fibonacci(v,n-2);

			return v[n];
		}
	}
	
	private static int minimo(int[] v, int desde, int hasta) {
		if (desde == hasta) {
			return v[desde];
		} else {
			int medio = (desde + hasta) / 2;
			int minimoIzq = minimo(v, desde, medio);
			int minimoDer = minimo(v, medio+1, hasta);
			
			return Math.min(minimoIzq, minimoDer);
		}
	}
	
	static int x(int n, int k) {
		int x1;
		
		if (n < 1) {
			return k;
		} else {
			x1 = x(n-1, k);
			return (x1*2);
		}
	}	
}
