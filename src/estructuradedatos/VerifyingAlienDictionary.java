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
 * Clase que proporciona métodos para verificar si una lista de palabras
 * está ordenada según un alfabeto personalizado.
 * @author arueda
 */
public class VerifyingAlienDictionary implements IAlgoritm{

    /**
     *  Método principal que ejecuta la aplicación.
     *
     * En una lengua alienígena también utilizan las letras del español, pero posiblemente en un orden diferente. Es una permutación de nuestro alfabeto.
     * Tu desafío es, dada una secuencia de palabras escritas en el idioma extranjero y el orden del alfabeto alienígena, devolver verdadero si y solo si las palabras dadas están ordenadas lexicográficamente según el orden de letras del alfabeto alienígena dado..
     */
    public VerifyingAlienDictionary() {
    }
    
    @Override
    public void run() {
        // TODO code application logic here
        List<String> words = Arrays.asList("habito", "hacer", "sonreir", "lectura");
        //List<String> words = Arrays.asList("conocer", "cono");
        String order1 = "hlabcdfgijkmnopqrstuvwxyz";

        if (ordenarLetras(words, order1)) {
            System.out.println("Ordenado");
        } else {
            System.out.println("No Ordenado");
        }
    }
    
    /**
     *  Método ordenarLetras.
     *
     * Metodo para identificar el orden de las palabras
     * 
     * @param words palabras
     * @param ordenAlfabeto alfabeto
     * @return boolean
     */
    public static boolean ordenarLetras(List<String> words, String ordenAlfabeto) {
        HashMap<Character, Integer> hastMapAlfabeto = new HashMap<>();

        for (int i = 0; i < ordenAlfabeto.length(); i++) {
            char letra = ordenAlfabeto.charAt(i); // Obtener cada letra
            hastMapAlfabeto.put(letra, i);
        }

        for (int i = 1; i < words.size(); i++) {
            String wordInit = words.get(i - 1);
            String wordFin = words.get(i);

            if (comparar(wordInit, wordFin, hastMapAlfabeto) == false) {
                return false;
            }
        }
        return true;
    }
    
    /**
     *  Método comparar.
     *
     * Metodo para comparar el orden  de las letras de las palabras
     * 
     * @param wordInit palabra inicial
     * @param wordFin palabra final
     * @param hastMapAlfabeto alfabeto
     * @return boolean
     */
    public static boolean comparar(String wordInit, String wordFin, HashMap<Character, Integer> hastMapAlfabeto) {
        int indexMin = Math.min(wordInit.length(), wordFin.length());
        char letraInit;
        char letraFin;
        for (int i = 0; i < indexMin; i++) {
            letraInit = wordInit.charAt(i);
            letraFin = wordFin.charAt(i);

            if(hastMapAlfabeto.get(letraInit) < hastMapAlfabeto.get(letraFin)) {
                return true;
            } else if(hastMapAlfabeto.get(letraInit) > hastMapAlfabeto.get(letraFin))  {
                return false;
            }
        }
        return wordInit.length() <= wordFin.length();
    }

}