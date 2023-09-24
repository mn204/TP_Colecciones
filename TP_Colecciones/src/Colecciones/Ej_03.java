/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Manuel
 * 3. Escriba una aplicación para almacenar en un ArrayList<Integer>
aleatoriamente 20 números enteros positivos pares del 1 al 100, de los
cuales se desea saber:
a) su promedio aritmético
b) cuántos de los números son iguales al promedio aritmético
c) cuántos de los números son mayores que el promedio aritmético
d) cuántos de los números son menores que el promedio aritmético
 */
public class Ej_03 {
       public static void main(String[] args) {
            ArrayList<Integer>  listaNumeros = new ArrayList<>();
            int suma = 0;
            int contadorMayores = 0, contadorMenores = 0, contadorIguales = 0;
            int promedio;
            Random aleatorio = new Random();
            for (int i = 0; i < 20; i++){
                int numero;
                do {
                numero = aleatorio.nextInt(100) + 1;
                } while (numero % 2 != 0);
                listaNumeros.add(numero);
            }
            for (Integer num : listaNumeros) {
                suma += num;
            }
            promedio = suma/20;
            for (Integer num : listaNumeros) {
                if (num == promedio) {
                contadorIguales++;
                } else if (num > promedio) {
                contadorMayores++;
                } else {
                contadorMenores++;
                }
            }
                
            System.out.println("Promedio: " + promedio);
            System.out.println("Cantidad de nros iguales al promedio: " + contadorIguales);
            System.out.println("Cantidad de nros mayores al promedio: " + contadorMayores);
            System.out.println("Cantidad de nros menores al promedio: " + contadorMenores);
    }
}
