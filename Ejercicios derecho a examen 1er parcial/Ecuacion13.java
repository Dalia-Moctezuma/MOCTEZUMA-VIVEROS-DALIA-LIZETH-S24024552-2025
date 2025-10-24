import java.util.Scanner;
import java.lang.Math;
	public class Ecuacion13{
	public static void main(String args[]){
	Scanner leer=new Scanner (System.in);
	double A,B,C;
	double discriminante,x1,x2;
		System.out.println ("Ingresa el valor de A: ");
		A=leer.nextDouble();
		System.out.println ("Ingresa el valor de B: ");
		B=leer.nextDouble();
		System.out.println ("Ingresa el valor de C: ");
		C=leer.nextDouble();
        	if (A == 0) {
            		System.out.println("Error, la ecuacion no es cuadratica");
        	} 
		else {
            		discriminante = (B * B) - (4 * A * C);
            
            	if (discriminante < 0) {
                	System.out.println("Error, la ecuacion tiene raices imaginarias");
            	} 
	    	else {
                	x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
                	x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
                	System.out.println("Las raices son:");
                	System.out.println("x1 = " + x1);
                	System.out.println("x2 = " + x2);
            }
        }
    }
}