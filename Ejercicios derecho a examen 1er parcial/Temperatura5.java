import java.util.Scanner;
	public class Temperatura5{
	public static void main (String args []){
	Scanner leer= new Scanner (System.in);
	double t,f=0,k=0;
		System.out.println ("Ingresa la temperature en grados centigrados");
		t=leer.nextInt();
		f=(t * 9/5) + 32;
		System.out.println ("La equivalencia a grados Fahrenheit es: " + f);
		k=t+273.15;
		System.out.println ("La Temperatura absoluta es: " + k);
	}
}
