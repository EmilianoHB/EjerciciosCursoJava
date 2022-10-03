package ejercicio15;

import javax.swing.JOptionPane;

    /*
    Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura
    media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos
    que miden más de 1.75.
    */
// @author Emili
public class Ejercicio15 {

    public static void main(String[] args) {
        int edad, acumE=0, acumA=0;
	float edadM=0, altura, alturaM=0;
	
	for(int i=1; i<=5; i++){
            edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
            altura=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura"));
            edadM +=edad;
            alturaM +=altura;
            if(edad>18){
                acumE++;
            }
            if(altura>1.75){
                acumA++;
            }
        }
        edadM/=5;
        alturaM/=5;
        System.out.println("La edad media es: "+edadM);
        System.out.println("La altura media es: "+alturaM);
        System.out.println("La cantidad de alumnos mayores a 18 es: "+acumE);
        System.out.println("La cantidad de alumnos con más de 1.75 es : "+acumA);

    }
}
