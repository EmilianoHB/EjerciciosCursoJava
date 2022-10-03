package ejercicio_2;

import java.util.Scanner;

    /*
    Leer un número e indicar si es positivo o negativo.
    El proceso se repetirá hasta que se introduzca un 0.
    */
// @author Emili
public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
	int numero;
	
	numero= entrada.nextInt();
	
	while(numero!=0){
	if(numero>0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
	}
        
	numero= entrada.nextInt();
        }
    }
}
