package ejercicio13;

import javax.swing.JOptionPane;

    /*
    Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares, con el siguiente menú de opciones:
        Ingresar dinero.
        Retirar dinero.
        Salir.

    */
// @author Emili
public class Ejercicio13 {

    public static void main(String[] args) {
        float cuenta=1000, ingresar, retirar;
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Digite la operación a realizar\n"
        +"1.Ingresar dinero: \n"
        +"2.Retirar dinero: \n"
        +"3.Salir"));
        switch(opcion){
            case 1: 
                ingresar = (float)Float.parseFloat(JOptionPane.showInputDialog("Ingrese monto a ingreasr"));
                cuenta += ingresar;
                JOptionPane.showMessageDialog(null, "su nuevo saldo es: "+cuenta );
                break;
            case 2: 
                retirar = Float.parseFloat(JOptionPane.showInputDialog("Monto a retirar: "));
                if(retirar>cuenta){
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }else{cuenta -= retirar;
                     JOptionPane.showMessageDialog(null, "su nuevo saldo es: "+cuenta );
                }
                break;
            case 3: 
                JOptionPane.showMessageDialog(null, "Saliendo.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error.");
        }	
     }
    }

