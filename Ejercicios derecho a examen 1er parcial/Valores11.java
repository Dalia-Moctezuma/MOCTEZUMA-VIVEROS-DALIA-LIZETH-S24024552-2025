import java.util.Scanner;
	public class Valores{
	public static void main (String args []){
	Scanner leer=new Scanner (System.in);
	int a,b,c,mayor=0,menor=0;
	float promedio;
		System.out.println("Ingresa el primer valor");
		a=leer.nextInt();
		System.out.println("Ingresa el Segundo valor");
		b=leer.nextInt();
		System.out.println("Ingresa el tercer valor");
		c=leer.nextInt();
		if ((a == b) && (b == c)) 
			System.out.println("Los tres valores son iguales.");
		else {
            		if ((a > b) && (a > c))
                	mayor = a;
            		else if ((b > a) && (b > c))
               	 	mayor = b;
            		else
                	mayor = c;
			System.out.println("El numero mayor es: " + mayor);
           		if ((a < b) && (a < c))
                	menor = a;
            		else if ((b < a) && (b < c))
                	menor = b;
            		else
                	menor = c;
			System.out.println("El numero menor es: " + menor);
            		promedio = (a + b + c) / 3;
			System.out.println("El promedio es: " + promedio);
		}
	}
}