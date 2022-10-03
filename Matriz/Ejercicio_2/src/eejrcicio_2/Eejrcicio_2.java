package eejrcicio_2;

import java.util.Scanner;

    /*
    Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma
    */
// @author Emili
public class Eejrcicio_2 {

    public static void main(String[] args) {
        int matriza[][] = new int[3][3];
        int matrizb[][] = new int[3][3];
        int matrizc[][] = new int[3][3];
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa los datos de la matriz a");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matriz a("+i+")("+j+")");
                matriza[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Ingresa los datos de la matriz b");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matriz b("+i+")("+j+")");
                matrizb[i][j] = entrada.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizc[i][j] = (matriza[i][j] + matrizb[i][j]);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matrizc[i][j]);
            }
        }
    }
}
