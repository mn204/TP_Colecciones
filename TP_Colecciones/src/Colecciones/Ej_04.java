/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Manuel
 * 4. Realice una búsqueda secuencial en un ArrayList<Integer> que contenga
50 elementos generados aleatoriamente mediante la función java random.
Realice una búsqueda secuencial de la siguiente forma:
- se lee el valor que se desea buscar,
- se compara la primera posición;
- si son iguales,
- fin de la búsqueda.
- De lo contrario, compararlo con la segunda posición, y así
sucesivamente.
- Si se llega al final del arreglo y no se encontró el valor, debe indicarlo
con un mensaje apropiado.
- Si se encuentra, se debe especificar la posición que ese valor ocupa en
la lista por primera vez. 
 */
public class Ej_04 {
    public static void main(String[] args) {
            ArrayList<Integer>  listaNumeros = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int contador = 0;
            Random aleatorio = new Random();
            for (int i = 0; i < 50; i++){
                int numero = aleatorio.nextInt(100) + 1;
                listaNumeros.add(numero);
            }
            System.out.print("Ingrese el valor que desea buscar: ");
            int valor = sc.nextInt();
            for (int i = 0; i < listaNumeros.size(); i++) {
                if (valor == listaNumeros.get(i)){
                    contador = i;
                    System.out.println("El nro se encuentra en la posicion " +  contador);
                }
            }
            if (valor!= listaNumeros.get(contador)){
                System.out.println("El nro  no se encuentra en ninguna posicion");
            }
    }
}