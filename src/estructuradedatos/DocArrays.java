/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradedatos;

import estructuradedatos.interfaces.IAlgoritm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author arueda
 */
public class DocArrays implements IAlgoritm{
    
    public DocArrays(){
    }

    @Override
    public void run() {
        // declares an Array of integers.
        int[] arr;
        int[] arr2;
        int[] arr3;

        // allocating memory for 5 integers.
        arr = new int[3];
        arr2 = new int[3];
        arr3 = new int[3];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        
        arr3 = arr.clone(); // permite copiar el  array 
        
        System.out.println(Arrays.toString(arr)) ; //Para convertir en String:
        System.out.println(arr.getClass()); // Salida: class [I (I significa int array
        System.out.println(arr.hashCode()); // Código hash único
        System.out.println(Arrays.equals(arr, arr3)); // Para comparar contenido de los  arrays
        List<int[]> listArray = Arrays.asList(arr); // convierte un array en una lista
        System.out.println(listArray.getClass()); // Salida:  class java.util.Arrays$ArrayList
        System.out.println(Arrays.binarySearch(arr,30 )); //  busca binaria y retorna el indice donde esta el valor
    }
    
    
    
}
