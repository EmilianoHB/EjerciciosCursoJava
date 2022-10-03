package ejercicio5;

import javax.swing.JOptionPane;

    /*
    Un obrero necesita calular su salario semanal, el cual se obtiene
    de la siguiente manera:
    +Si trabaja 40 horas o menos se le paga $16 por hora.
    +Si trabaja mas de 40 horas se le paga $16 por cada una de las
    primeras 40 horas y $20 por cada hora extra.
    */
// @author Emili
public class Ejercicio5 {

    public static void main(String[] args) {
       int horasT, salarioh=16, horasE=20 ,salarioT;
       
       horasT= Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas trabajo el obrero?"));
       
        if (horasT<=40) {
            salarioT=salarioh*horasT;
        }else{
            salarioT=(salarioh*40)+ ((horasT-40)*horasE);
        }
        JOptionPane.showMessageDialog(null, "El obrero cobrara: "+salarioT);
    }
}
