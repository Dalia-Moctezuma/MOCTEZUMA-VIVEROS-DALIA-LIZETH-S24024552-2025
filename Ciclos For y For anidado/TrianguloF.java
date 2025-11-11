import java.util.Scanner;
public class TrianguloF{
    public static void main(String args[]){
        int n, numero = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la altura");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numero + " ");
                numero++;
            }
            System.out.println();
        }
    }
}