/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoordenamientoburbuja;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class ProyectoOrdenamientoBurbuja {

  
    public int tamaño;
    byte datos;
    byte [][]vector;
    public ProyectoOrdenamientoBurbuja(){
        
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Por favor ingrese el tamaño del vector: ");
        tamaño= entradaTeclado.nextInt();
        datos= (byte) vector.length;
        System.out.println("tamaño: "+datos);
        System.out.println("Por favor ingrese los datos del vector: ");
        
    }
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProyectoOrdenamientoBurbuja ProyectoOrdenamientoBurbuja = new ProyectoOrdenamientoBurbuja();
    }
    
}
