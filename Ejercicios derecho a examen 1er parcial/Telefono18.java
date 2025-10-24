import java.util.Scanner;
	public class Telefono18{
	public static void main (String args[]){
	Scanner leer=new Scanner (System.in);
	int t,cantidad;
		System.out.println("Ingresa el tiempo de la llamada");
		t=leer.nextInt();
		if (t<=3){
			cantidad=10;
			System.out.println("La cantidad a pagar es: "+ cantidad);
		}
		else{ 
			cantidad = 10 + (t - 3);
			System.out.println("La cantidad a pagar es: "+ cantidad);
		}
	}
}
		
		