package ejercicio9_c;
    /*
    Escribir todos los numeros del 100 al 0 de 7 en 7.
    */
// @author Emili
public class Ejercicio9_C {

    public static void main(String[] args) {
        int numero=100;
        while (numero>=0) {
            System.out.println(numero);
            numero-=7;
        }
    }
}
