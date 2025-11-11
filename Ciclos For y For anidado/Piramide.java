import java.util.Scanner;
public class Piramide{
	public static void main(String args[]){
    	int n;
	Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la altura de la piramide:");
        n= sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j= 1; j<= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k= 1; k <= (2 * i - 1);k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}