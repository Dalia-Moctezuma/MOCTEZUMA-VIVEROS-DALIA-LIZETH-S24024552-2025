import java.util.Scanner;
	public class Hospital{
	public static void main (String args[]){
	Scanner leer=new Scanner (System.in);
	String opcion;
	double presupuestoanual,presupuesto;
		System.out.println("Areas del hospital");
		System.out.println("ginecologia");
		System.out.println("traumatologia");
		System.out.println("pediatria");
		System.out.println ("Ingresa la opcion a la que perteneces :");
	        opcion=leer.next();
		System.out.println("Ingresa tu presupuesto anual:");
		presupuestoanual=leer.nextDouble();
	        switch (opcion){
			case "ginecologia":
				presupuesto=presupuestoanual*.40;
				System.out.println("Tu presupuesto por area es: " + presupuesto);
				break;
			case "traumatologia":
				presupuesto=presupuestoanual*.30;
				System.out.println("Tu presupuesto por area es: " + presupuesto);
				break;
			case "pediatria":
				presupuesto=presupuestoanual*.30;
				System.out.println("Tu presupuesto por area es: " + presupuesto);
				break;
			default:
				System.out.println ("Incorrecto, ingresa bien tu area");
		}
	}
}