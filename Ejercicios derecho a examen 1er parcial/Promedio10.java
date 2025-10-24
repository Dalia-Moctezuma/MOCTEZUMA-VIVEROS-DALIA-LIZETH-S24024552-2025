import java.util.Scanner;
	public class Promedio10{
	public static void main (String args[]){
	Scanner leer=new Scanner (System.in);
	double cf1,cf2,cf3,promedio=0;
		System.out.println ("Ingresa tu primera calificacion");
		cf1=leer.nextDouble();
		System.out.println ("Ingresa tu segunda calificacion");
		cf2=leer.nextDouble();
		System.out.println ("Ingresa tu tercera calificacion");
		cf3=leer.nextDouble();
		promedio=(cf1+cf2+cf3)/3;
		System.out.println ("Tu promedio general es " + promedio);
	}
}