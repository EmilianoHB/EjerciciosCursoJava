package ejercicio_5;

import java.util.Scanner;
import javax.swing.JOptionPane;

    /*
    Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y
    de cada columna.
    */
// @author Emili
public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int matriz[][],nf, nc, sumaf, sumac;
        
        nf = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas"));
        nc = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas"));
        
        matriz = new int[nf][nc];
        
        System.out.println("Digite la matriz:");
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.print("matriz("+i+")("+j+")");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("La matriz es: ");
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        for (int i = 0; i < nf; i++) {
            sumaf = 0;
            for (int j = 0; j < nc; j++) {
                sumaf += matriz[i][j];
            }
            System.out.println("La suma de la fila "+i+" es : "+sumaf);
        }
        System.out.println("");
        
        for (int j = 0; j < nc; j++) {
            sumac = 0;
            for (int i = 0; i < nf; i++) {
                sumac += matriz[i][j];
            }
            System.out.println("La suma de la columna "+j+" es : "+sumac);
        }
        System.out.println("");
    }
}
