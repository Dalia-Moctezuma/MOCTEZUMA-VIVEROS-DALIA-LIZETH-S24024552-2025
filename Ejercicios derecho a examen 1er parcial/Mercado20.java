import java.util.Scanner;
	public class Mercado20{
	public static void main (String args[]){
	Scanner leer=new Scanner (System.in);
	int num;
	double descuento,compra,pagot;
		System.out.println ("Ingresa el numero que escogiste al azar :");
	        num=leer.nextInt();
		System.out.println("Ingresa el total de tu compra:");
		compra=leer.nextDouble();
			if (num<74){
				descuento=compra*.15;
				pagot=compra-descuento;
				System.out.println("El pago total de tu compra es : " + pagot);
			}
			else{
				descuento=compra*.20;
				pagot=compra-descuento;
				System.out.println("El pago total de tu compra es : " + pagot);
			}
	}
}