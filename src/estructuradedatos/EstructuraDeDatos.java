/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

import estructuradedatos.interfaces.IAlgoritm;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author arueda
 */
public class EstructuraDeDatos {

    /**
     *  Método principal que ejecuta la aplicación.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IAlgoritm verifyingAlienDictionary = new VerifyingAlienDictionary();
        verifyingAlienDictionary.run();
        
        IAlgoritm mergeTwoSortedList = new MergeTwoSortedList();
        mergeTwoSortedList.run();
        
        IAlgoritm docArrays = new DocArrays();
        docArrays.run(); 
        
        

            
    }
    

}
