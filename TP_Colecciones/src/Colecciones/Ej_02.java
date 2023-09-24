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
 * 2. Escriba una aplicación que:
a) lea 20 números decimales ingresados por teclado por el usuario y los
coloque en un ArrayList<Integer>.
b) determine y muestre el mayor de los números en el arreglo
c) determine y muestre el menor de los números del arreglo calcule y
muestre el rango (diferencia entre el mayor y el menor) de los
elementos en el arreglo 
 */
public class Ej_02 {
        public static void main(String[] args) {
        ArrayList<Double>  listaDecimales = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Double mayor= Double.MIN_VALUE, menor= Double.MAX_VALUE, rango;
        System.out.println("Ingrese 20 numeros para llenar la lista: ");
            for (int i = 0; i < 20; i++) {
            Double decimal = sc.nextDouble();
            listaDecimales.add(decimal);
            }
            for (Double num : listaDecimales) {
                
            if (num >mayor) {
                mayor = num;
            }
            if (num< menor) {
                menor = num;
            }
            }
             rango = mayor - menor;            
            System.out.println("Nro mayor: " + mayor);
            System.out.println("Nro menor: " + menor);
            System.out.println("El rango es: " + rango);
    }
}
