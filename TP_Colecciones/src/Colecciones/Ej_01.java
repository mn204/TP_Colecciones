/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Manuel
 * 1. Crea un ArrayList<Integer>, asignar los valores numéricos manualmente
(los que tú quieras) hasta ingresar un valor menor a 0, mostrar los
números por pantalla. Solicite los números mediante un bucle. 
 */
public class Ej_01 {
    public static void main(String[] args) {
        ArrayList<Integer>  lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean salida= true;
        do{
            System.out.println("Ingrese un numero para llenar la lista: (Si ingresa un numero menor a 0 se dejara de llenar)");
            int numero = sc.nextInt();
            lista.add(numero);
            for(Integer n : lista){
                if (n<0){
                    salida = false;
                }
            }
        } while (salida);
            
        
    }
}
