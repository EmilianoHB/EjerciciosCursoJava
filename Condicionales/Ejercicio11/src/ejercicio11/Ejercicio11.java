package ejercicio11;

import javax.swing.JOptionPane;

    /*
    Construir un programa que simule el funcionamiento de una calculadora
    que puede realizar las cuatro operaciones aritmeticas basicas (sumas, resta,
    producto y division) con valores numericos enteros. El usuario debe especificar
    la operacion con el primer caracter del primer parametro de la linea de comandos:
    S o s para la suma, R o r para la resta, P, p, M o m para el producto y D o d
    para la division.
    */
// @author Emili
public class Ejercicio11 {

    public static void main(String[] args) {
        int numero1, numero2, suma, resta, multiplicacion, division;
	char operacion;
	
	numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
	numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
	
	operacion=JOptionPane.showInputDialog("Digite un numero: ").charAt(0);
	
	switch(operacion){
	case 's': 	
	case 'S':   suma=numero1+numero2;
                    JOptionPane.showMessageDialog(null, "La suma es: "+suma);
                    break;
	case 'r':	
        case 'R':   resta=numero1-numero2;
                    JOptionPane.showMessageDialog(null, "La resta es: "+resta);
                    break;
        case 'p':	
        case 'P':	
        case 'm':	
        case 'M':   multiplicacion=numero1*numero2;
                    JOptionPane.showMessageDialog(null, "La multiplicación es: "+multiplicacion);
                    break;
	case'd':	
	case'D':    division=numero1/numero2;
                    JOptionPane.showMessageDialog(null, "La división es: "+division);
                    break;
	default:    JOptionPane.showMessageDialog(null, "Error" );
                    break;
}

    }
}
