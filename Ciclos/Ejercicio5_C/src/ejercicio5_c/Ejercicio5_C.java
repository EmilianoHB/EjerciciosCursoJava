package ejercicio5_c;

import javax.swing.JOptionPane;

    /*
    Realizar un juego para adivinar un número. Para ello generar un número
    aleatorio entre 0 - 100, y luego ir pidiendo numeros indicando “es mayor”
    o “es menor” según sea mayor o menor con respecto a N.
    El proceso se termina cuando el usuario acierta y mostrar el número
    de intentos.
    */
// @author Emili
public class Ejercicio5_C {

    public static void main(String[] args) {
        int random, acumulador=0, numero;
        
        random= (int)(Math.random()*100);
        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            
            if (random>numero) {
                System.out.println("El numerop es mayor");
            }else{
                System.out.println("El numero es menor");
            }
            acumulador++;
        } while (numero != random);
        System.out.println("A adivinado el numero con "+acumulador+" intentos");
    }
}
