/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Manuel
 * Escriba una aplicación que solicite y cargue en una ArrayList<Integer> 10
dígitos enteros, luego cree dos nuevas ArrayList<Integer> y asigne a la
primera los números ingresados por el usuario de forma ascendente y en la
segunda de forma descendente. Muestre las 2 listas por pantalla.
Investigue como ordenar una Lista(List<>)
 */
public class Ej_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Lista1 = new ArrayList<>();
        System.out.println("Ingrese 10 valores enteros: ");
        for (int i = 0; i < 10; i++) {
            Lista1.add(sc.nextInt());
        }
        ArrayList<Integer> Ascendente = new ArrayList<>(Lista1);
        ArrayList<Integer> Descendente = new  ArrayList<>(Lista1);
        Collections.sort(Ascendente);
        Collections.sort(Descendente, Collections.reverseOrder());
        System.out.println("Lista Original: ");
        for (Integer numero : Lista1) {
            System.out.println(numero);
        }
        System.out.println("-----------------------");
        System.out.println("Lista ordenada Ascendente:");
        for (Integer numero : Ascendente) {
            System.out.println(numero);
        }
        System.out.println("-----------------------");
        System.out.println("Lista ordenada Descendente:");
        for (Integer numero : Descendente) {
            System.out.println(numero);
        }
    }
    
}

