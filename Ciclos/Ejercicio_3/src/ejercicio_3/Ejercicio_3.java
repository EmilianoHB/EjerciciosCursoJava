package ejercicio_3;

import java.util.Scanner;

    /*
    Leer numeros hasta que se introduzca un 0. para cada uno indicar
    si es par o impar.
    */
// @author Emili
public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int numero;
	
	numero= entrada.nextInt();
	
	while(numero!=0){
            if(numero%2==0){
                System.out.println("Es par");
            }else {
                System.out.println("Es impar");
            }
            numero= entrada.nextInt();
        }
    }
}
