import java.util.Scanner;
	public class Pulsaciones3{
	public static void main (String args []){
	Scanner leer= new Scanner (System.in);
		int edad=0,pulsaciones=0;
		System.out.println("Ingrese su edad, para calcular sus pulsaciones por cada 10 segundos de ejercicio");
                edad=leer.nextInt();
       		pulsaciones=(220 - edad) / 10;
       		System.out.println("Numero de pulsaciones: " + pulsaciones);
        }
}