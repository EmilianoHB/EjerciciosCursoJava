package ejercicio16;

import java.util.Scanner;

    /*
    Queremos desarrollar una aplicacion que nos ayude a destionar las notas
    de un centro. Cada grupo (o clase) esta compuesto por 5 alumnos.
    Se pide leer las notas del primer, segundo y tercer trimestre de un grupo.
    Debemos mostrar al final: la nota media del grupo en cada trimestre,
    y la media del alumno que se encuentra en la posicion n.
    */
// @author Emili
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
	float p[], s[], t[];
	p= new float[5];
	s= new float[5];
	t= new float[5];
	float mediap=0, medias=0, mediat=0, promedioa=0;
	int posicion;
	
	System.out.println("digite las notas del primer trimestre");
	for(int i=0;i<5;i++){
            System.out.println("digite las notas del primer trimestre");
            p[i]= entrada.nextFloat();
            mediap+=p[i];
        }
        for(int i=0;i<5;i++){
            System.out.println("digite las notas del segundo trimestre");
            s[i]= entrada.nextFloat();
            medias+=s[i];
        }
        for(int i=0;i<5;i++){
            System.out.println("digite las notas del tercer trimestre");
            t[i]= entrada.nextFloat();
            mediat+=t[i];
        }
        
        mediap/=5;
        medias/=5;
        mediat/=5;

        do{
            System.out.println("Digite la posicion del alumno");
            posicion=entrada.nextInt();
            for(int i=0;i<5;i++){
                promedioa = (p[posicion] + s[posicion] + t[posicion]);
            }
        }while(posicion<0||posicion>4);
        
        promedioa /= 3;
        System.out.println("El promedio del primer trimestre es: "+mediap);
        System.out.println("El promedio del segundo trimestre es: "+medias);
        System.out.println("El promedio del tercer trimestre es: "+mediat);
        System.out.println("El promedio del alumno "+posicion+" es :"+promedioa);
    }
}
