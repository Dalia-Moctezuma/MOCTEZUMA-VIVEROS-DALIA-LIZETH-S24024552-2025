import java.util.Scanner;
	public class Metros1{
	public static void main (String args []){
	Scanner leer= new Scanner (System.in);
	double metros=0,conversion=0,pies=3.28084,pulgadas=39.3701;
		System.out.println ("Ingresa los metros para convertir en pies y pulgadas");
		metros=leer.nextDouble();
		conversion=metros*pies;
		System.out.println ("La conversion de metros a pies es: " + conversion);
		conversion=metros*pulgadas;
		System.out.println ("La conversion de metros a pulgadas es: " + conversion);
	}
}