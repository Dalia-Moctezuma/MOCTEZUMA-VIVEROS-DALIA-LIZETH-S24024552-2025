import java.util.Scanner;
	public class Calificaciones15{
	public static void main (String args[]){
	Scanner leer=new Scanner (System.in);
	double nota;
		System.out.println ("Ingresa tu nota");
		nota=leer.nextDouble();
		if ((nota>=0.0)&&(nota<=1.0)){
			System.out.println ("P (Pesimo)");
		}
		else if ((nota>=1.1)&&(nota<=2.0)){
			System.out.println ("M (Mal)");
		}
		else if ((nota>=2.1)&&(nota<=2.9)){
			System.out.println ("R (Regular)");
		}
		else if ((nota>=3.0)&&(nota<=4.0)){
			System.out.println ("B (Bien)");
		}
		else if ((nota>=4.1)&&(nota<=5.0)){
			System.out.println ("E (Excelente)");
		}

		else{
			System.out.println("Error, no ingresaste la nota correcta");
		}
	}
}