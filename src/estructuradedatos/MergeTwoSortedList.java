/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

import estructuradedatos.interfaces.IAlgoritm;
import java.util.Arrays;

/**
 *
 * @author arueda
 */
public class MergeTwoSortedList implements IAlgoritm {

    /**
     * En este desafío vas a recibir 4 elementos:
     * 2 arrays de números enteros (nums1 y nums2) ordenada de forma ascendente.
     * 2 números enteros (m y n) con la cantidad de elementos de cada una de las listas anteriores (nums1 y nums2 respectivamente).
     * Importante: la longitud de nums1 es de m + n, siendo m los primeros elementos de la lista (los números que posteriormente se deben combinar) y n los últimos elementos (teniendo todos el valor de 0 y que deben ser ignorados en la combinación).
     * La función merge_lists debe retornar 1 único array con la combinación de nums1 y nums2 ordenado de forma ascendente.
     */
    public MergeTwoSortedList() {

    }

    @Override
    public void run() {
        int[] nums1 = {1,2,3,0,0,0,0};
        int n = 3;
        int[] nums2 = {-4,2,3,9};
        int m = 4;

        mergeLists(nums1, n, nums2, m);

        System.out.println(Arrays.toString(nums1));
    }

    public static void mergeLists(int[] nums1, int n, int[] nums2, int m) {
        int p1 = n - 1;
        int p2 = m - 1;
        int p = nums1.length - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[p] = nums2[p2];
                p2--;
            } else {
                nums1[p] = nums1[p1];
                p1--;
            }
            p--;
        }

        if (m > 0) {
            System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
        }
    }

}
