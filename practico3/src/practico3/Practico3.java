package practico3;

import java.util.Arrays;

public class Practico3 {

	public static void main(String[] args) {
		/*
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 */
		int[][] matriz1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		ejercicio4a(matriz1);
		ejercicio4b(matriz1);
		ejercicio4c(matriz1);
		ejercicio4d(matriz1);
	}

	private static void ejercicio4a(int[][] input) {
		int max = Integer.MIN_VALUE;
		int posX = -1;
		int posY = -1;
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[i][j] > max) {
					max = input[i][j];
					posX = i;
					posY = j;
				}
			}
		}
		
		System.out.println("Max:" + max + " // posX: " + posX + " // posY: " + posY);
	}

	private static void ejercicio4b(int[][] input) {
		int min = Integer.MAX_VALUE;
		int posX = -1;
		int posY = -1;
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[i][j] < min) {
					min = input[i][j];
					posX = i;
					posY = j;
				}
			}
		}
		
		System.out.println("Min:" + min + " // posX: " + posX + " // posY: " + posY);
	}

	private static void ejercicio4c(int[][] input) {
		int min = Integer.MAX_VALUE;
		int posX = -1;
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[i][j] < min) {
					min = input[i][j];
					posX = i;
				}
			}
		}
		
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i][posX]);
		}
		
		System.out.println("Min:" + min + " // posX: " + posX);
	}

	private static void ejercicio4d(int[][] input) {
		int max = Integer.MIN_VALUE;
		int posY = -1;
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[i][j] > max) {
					max = input[i][j];
					posY = j;
				}
			}
		}

		System.out.println(Arrays.toString(input[posY]));
		
		System.out.println("Max:" + max + " // posY: " + posY);
	}
}
