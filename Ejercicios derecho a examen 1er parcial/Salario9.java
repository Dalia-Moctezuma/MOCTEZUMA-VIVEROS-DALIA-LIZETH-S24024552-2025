import java.util.Scanner;
	public class Salario9{
	public static void main (String args[]){
	Scanner leer=new Scanner (System.in);
	double salario,incremento=0,snuevo=0;
		System.out.println ("Ingrese su salario");
		salario=leer.nextDouble();
		incremento=salario*.25;
		snuevo=salario+incremento;
		System.out.println ("Tu nuevo salario es: " + snuevo + " por buen trabajador");
	}
}