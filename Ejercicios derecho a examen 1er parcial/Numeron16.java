import java.util.Scanner;
	public class Numeron16{
	public static void main (String args[]){
	Scanner leer=new Scanner (System.in);
	int n;
		System.out.println("Ingresa un numero");
		n=leer.nextInt();
		if (n%2==0)
			System.out.println("Es un numero par");
		else
			System.out.println("Es un numero non");
	}
}
	