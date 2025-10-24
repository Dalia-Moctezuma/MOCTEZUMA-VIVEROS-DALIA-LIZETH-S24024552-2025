import java.util.Scanner;
	public class Empleados12{
	public static void main (String args []){
	Scanner leer=new Scanner (System.in);
	int salario=0;
	double pago=0,descuento=0,subsidio=0,salariofinal;
	System.out.print("Ingresa tu categoria de empleado (1-4): ");
        int categoria=leer.nextInt();
	System.out.println ("Ingresa las horas que trabajaste");
	int hora=leer.nextInt();
		switch (categoria) {
			case 1:
				salario=20000;
				break;
			case 2:
				salario=15000;
				break;
			case 3:
				salario=10000;
				break;
			case 4:
				salario=7500;
				break;
			default:
                		System.out.println("Error, ingresa la categoria 1,2,3 y 4");
		}
			pago=salario*hora;
			descuento=pago*0.072;
			salariofinal=pago-descuento;
		 if (pago>1000000){
			subsidio=pago*0.15;
			salariofinal=salariofinal+subsidio;
		}
		System.out.println("Tu salario final es: "+ salariofinal);
	}
}