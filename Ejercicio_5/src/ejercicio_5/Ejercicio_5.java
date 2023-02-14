/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

import Servicios.serviciosPaices;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 *
 * @author droa
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<String> Paices = new HashSet<>();
        serviciosPaices sP = new serviciosPaices();
        sP.crearPaís(Paices);
        System.out.println(Paices.toString());
        //Ordenar Conjunto Antes de Presentar
        System.out.println("Ordenando Paíces (A-Z) ... ");
        ArrayList<String> paicesAux = new ArrayList<>(Paices);
        Collections.sort(paicesAux);
        System.out.println(paicesAux);
        System.out.println("Borrando Paíces (A-Z) ... ");
        sP.borrarPaís(Paices);
        System.out.println(Paices);
        
        
    }
    
}
