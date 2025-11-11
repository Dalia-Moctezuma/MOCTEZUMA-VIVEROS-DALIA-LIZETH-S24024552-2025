import java.util.Scanner;
public class Potencias{
	public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa el numero base:");
        int base = sc.nextInt();
        System.out.println("Ingresa la potencia:");
        int potencia = sc.nextInt();
        int resultado = 1;
        for (int i = 1; i <= potencia; i++) {
            for (int j = 1; j <= base; j++) {   
            }
            resultado *= base;
            System.out.println(base + " ^ " + i + " = " + resultado);
        }
    }
}