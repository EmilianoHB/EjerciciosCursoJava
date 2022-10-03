package ejercicio_7;
    /*
    Crear una matriz 5x5 en que los bordes de la matriz sean 1 y el interior
    sea 0.
    */
// @author Emili
public class Ejercicio_7 {

    public static void main(String[] args) {
        int matriz[][]= new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==0 || i==4) {
                    matriz[i][j]=1;
                }else if (j==0 || j==4) {
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
