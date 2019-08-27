package practicosAlgoritmos;
import Triangulo;

public class PracticosAlgoritmos {

	public static void main(String[] args) {
		p1e1();
		p1e2(12, 14);
		p1e3(1234);
		p1e4(35, 16);
		p1e5();
	}

	private static void p1e1() {
		int result = 0;

		for (int i = 1; i <= 50; i+= 2) {
			result += i;
		}

		System.out.println("Ejercicio 1: " + result);
	}

	private static void p1e2(int num1, int num2) {
		double promedio = (num1 + num2) / 2;
		int absol = Math.abs(num1) + Math.abs(num2);
		int cantPares = 0;
		
		if (num1 % 2 == 0) cantPares++;
		if (num2 % 2 == 0) cantPares++;

		System.out.println("Ejercicio 2:");
		System.out.println("    Promedio: " + promedio);
		System.out.println("    Suma Absoluta: " + absol);
		System.out.println("    Cantidad de Pares: " + cantPares);
	}

	private static void p1e3(int num) {
		String numStr = num + "";
		
		System.out.println("Ejercicio 3:");

		for (int i = 0; i < numStr.length(); i++) {
			System.out.println("    " + numStr.charAt(i));			
		}
	}
	
	private static void p1e4(int a, int b) {
		int suma = 0;

		System.out.println("Ejercicio 4:");
		System.out.print("    Mayor :");
		if (a > b) {
			System.out.println(" " + a);
			suma = (a * (a + 1)) / 2;
		} else {
			System.out.println(" " + b);
			suma = (b * (b + 1)) / 2;
		}
		System.out.println("    Suma:" + suma);
	}
	
	private static void p1e5() {
		Triangulo trngl = new Triangulo();
		trngl.lado1 = 10;
	}
}
