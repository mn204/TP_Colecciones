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
