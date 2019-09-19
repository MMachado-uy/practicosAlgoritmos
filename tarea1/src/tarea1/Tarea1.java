package tarea1;

import java.util.Arrays;
/*
 * PRE: Dos vectores unidimensionales con enteros ordenados de menor a mayor
 * POS: Un vector de largo v1 + v2 con los contenidos de v1 y v2 ordenados de menor a mayor
 */
public class Tarea1 {

    public static void main(String[] args) {
        int[] vector1 = {1,3,5,7,11};
        int[] vector2 = {2,4,6,8,9,10,12,13,14};
        
        System.out.println(Arrays.toString(mergeVectors(vector1, vector2)));
        
        int[] vector3 = {2,5,5,7,11,12,13,14};
        int[] vector4 = {8,9,15,23};
        
        System.out.println(Arrays.toString(mergeVectors(vector3, vector4)));

        int[] vector5 = {6,6,6,6,6,6,6,6};
        int[] vector6 = {6,6,6,6};
        
        System.out.println(Arrays.toString(mergeVectors(vector5, vector6)));
    }
    
    private static int[] mergeVectors(int[] v1, int[] v2) {
        int[] result = new int[v1.length + v2.length];
        int j = 0, k = 0;

        for (int i = 0; i < result.length; ) {
        	if (j < v1.length && k < v2.length) {
                while (j < v1.length && k < v2.length && v1[j] <= v2[k]) {
                    result[i++] = v1[j++];
                }

                while (j < v1.length && k < v2.length && v2[k] <= v1[j]) {
                    result[i++] = v2[k++];
                }
        	} else if (j < v1.length) {
                result[i++] = v1[j++];
            } else if (k < v2.length) {
                result[i++] = v2[k++];
            }
        }
        
        return result;
    }
}
