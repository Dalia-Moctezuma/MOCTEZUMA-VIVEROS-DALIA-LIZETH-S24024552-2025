import java.util.Scanner;
	public class Numeroprimo17{
	public static void main (String args[]){
	Scanner leer=new Scanner (System.in);
	int n,i=1,c=0;
		System.out.println("Ingresa un numero");
		n=leer.nextInt();
		while (i<=n){
			if (n%i==0){
				c++;
			}
			i++;
		}
		if (c==2)
			System.out.println("El numero " +n+ " es primo ");
		else 
			System.out.println("El numero " +n+ " no es primo ");

	}
}