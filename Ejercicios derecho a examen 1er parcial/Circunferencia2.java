import java.util.Scanner;
	public class Circunferencia2{
	public static void main (String args []){
	Scanner leer= new Scanner (System.in);
	double radio=0,pi=3.1416,longitud,area;
		System.out.println ("Ingresa el radio de tu circunferencia");
		radio=leer.nextDouble();
		longitud=2*pi*radio;
		System.out.println ("La longitud de la circunferencia es: " + longitud);
		area=pi*(radio*radio);
		System.out.println ("El area de la circunferencia es: " + area);
	}
}