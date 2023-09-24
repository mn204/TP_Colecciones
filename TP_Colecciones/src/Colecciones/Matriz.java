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
 * 6. Codifique la clase celda con los atributos:
int fila;
int columna;
String valor;
 Crea una clase Matriz que contenga una variable global
ArrayList<Celda>
ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
 Codifique un programa que solicite al usuario un valor para la
celda y que solicite la posición donde se desea almacenar el valor,
cree una instancia de la clase Celda, asigne los valores cargados
por el usuario y agregue la instancia a la lista matrizCuadrada;
repita este proceso hasta que el usuario ingrese como valor la
cadena “FIN”.
 Muestre por pantalla los valores cargados en matrizCuadrada.
 Codifique un método que reciba como parámetro los valores fila y
columna y retorne el valor almacenado, en caso de que la fila y la
columna no exista retorne el mensaje “La fila y columna indicada
no ha sido asignada”
 */
public class Matriz {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        matriz.asignarCeldas();
        matriz.mostrarPantalla();
        System.out.println("Ingrese de fila y columna desea saber el valor:");
        System.out.print("Fila: ");
        int fil = sc.nextInt();
        System.out.print("Columna: ");
        int col = sc.nextInt();
        matriz.buscador(fil, col );
    }
    
    public void asignarCeldas() {
            while (true) {
                System.out.print("Ingrese un valor para la celda ('FIN' para salir): ");
                String valor = sc.nextLine();

                if (valor.equals("FIN")) {
                    break;
                }

                System.out.print("Ingrese fila: ");
                int fila = sc.nextInt();
                System.out.print("Ingrese columna: ");
                int columna = sc.nextInt();

                matrizCuadrada.add(new Celda(fila, columna, valor));
                sc.nextLine();
            }
        }    

        public void mostrarPantalla() {
        System.out.println("Los valores de la matriz son: ");
        for (Celda celda : matrizCuadrada) {
            System.out.println("Fila: " + celda.fila + ", Columna: " + celda.columna + ", Valor: " + celda.valor);
        }
       }
        public void buscador(int fila, int columna) {
            boolean seEncontro = false;

            for (Celda celda : matrizCuadrada) {
                if (celda.fila == fila && celda.columna == columna) {
                    System.out.println("El valor en la fila " + fila + ", columna " + columna + " es : " + celda.valor);
                    seEncontro = true;
                    break;
                }
            }

            if (!seEncontro) {
                System.out.println("La fila y columna indicada no ha sido asignada.");
            }
        }    
}
