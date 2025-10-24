import java.util.Scanner;
	public class Edad4{
	public static void main (String args []){
	Scanner leer= new Scanner (System.in);
	int añon,añop,edad=0;
		System.out.println ("Ingresa tu año de nacimiento");
		añon=leer.nextInt();
		System.out.println ("Ingresa el año presente");
		añop=leer.nextInt();
		edad=añop-añon;
		System.out.println ("Tu edad es: " + edad + " años");
	}
}
