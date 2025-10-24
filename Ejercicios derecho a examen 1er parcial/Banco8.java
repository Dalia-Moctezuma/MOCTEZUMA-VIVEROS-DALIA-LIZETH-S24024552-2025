import java.util.Scanner;
	public class Banco8{
	public static void main (String args[]){
	Scanner leer= new Scanner (System.in);
	double interes=0,c,cfinal=0;
		System.out.println ("Ingrese el capital que desea invertir mensualmente");
		System.out.println ("La tasa de interes es del 2%");
		c=leer.nextDouble();
		interes=c*.02;
		cfinal=c+interes;
		System.out.println ("Su capital final es: " + cfinal + " pesos");
	}
}