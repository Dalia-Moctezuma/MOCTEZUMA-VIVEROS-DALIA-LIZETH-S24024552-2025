import java.util.Scanner;
	public class Tienda7{
	public static void main (String args[]){
	Scanner leer= new Scanner (System.in);
	double descuento=0,tc,pagofinal=0;
		System.out.println ("Ingrese el total de su compra");
		tc=leer.nextDouble();
		descuento=tc*.15;
		pagofinal=tc-descuento;
		System.out.println ("Pagara finalmente por su compra: " + pagofinal + " pesos");
	}
}