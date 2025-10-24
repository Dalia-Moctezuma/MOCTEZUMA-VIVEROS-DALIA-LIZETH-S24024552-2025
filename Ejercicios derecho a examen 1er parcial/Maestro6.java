import java.util.Scanner;
	public class Maestro6{
	public static void main (String args []){
	Scanner leer= new Scanner (System.in);
	double t,porcentaje=0;
	int m,h;
		System.out.println ("Ingrese el total de alumnos");
		t=leer.nextDouble();
		System.out.println ("Ingrese el total de estudiantes mujeres");
		m=leer.nextInt();
		System.out.println ("Ingrese el total de estudintes hombres");
		h=leer.nextInt();
		porcentaje=(m*100)/t;
		System.out.println ("El porcentaje de mujeres en su salon es: " + porcentaje);
		porcentaje=(h*100)/t;
		System.out.println ("El porcentaje de hombres en su salon es: " + porcentaje);
	}
}
