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
 * @version 1.1.2
 * 
 */
public class ProyectoOrdenamientoBurbuja {

    public int tamaño;
    public int datos,aux;
    public int vector[];
    
    public ProyectoOrdenamientoBurbuja(){
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Por favor ingrese el tamaño del vector: ");
        tamaño= entradaTeclado.nextInt();
        vector=new int[tamaño];
        for(int i=0;i<vector.length;i++){   
            System.out.println("Por favor ingrese el dato "+ (i+1) +" del vector");
            datos=entradaTeclado.nextInt();
            vector[i]=datos;
        }
        for(int i=0;i<vector.length;i++){
            for(int j=0;j<vector.length;j++){
                if(vector[j+1]<vector[i]){
                    aux=vector[i+1];
                    vector[i+1]=vector[i];
                    vector[i]=aux;
                }
            }
        }     
        System.out.println("Vector ordenado: \n");
        for(int i=0;i<vector.length;i++){
            System.out.println("\n"+vector[i]);
        }
    }
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProyectoOrdenamientoBurbuja ProyectoOrdenamientoBurbuja = new ProyectoOrdenamientoBurbuja();
    }
    
}
