import java.util.Scanner;
	public class Vehiculos14{
	public static void main (String args[]){
	Scanner leer=new Scanner (System.in);
	double venta1,venta2,venta3,venta4,comision1,comision2,comision3,comision4,comisiont=0;
		System.out.println ("Ingresa el valor de tu primer venta: ");
		venta1=leer.nextDouble();
		System.out.println ("Ingresa el valor de tu segunda venta: ");
		venta2=leer.nextDouble();
		System.out.println ("Ingresa el valor de tu tercera venta: ");
		venta3=leer.nextDouble();
		System.out.println ("Ingresa el valor de tu cuarta venta: ");
		venta4=leer.nextDouble();
			if (venta1<=10000000){
				comision1=venta1*0.02;
			}
			else if ((venta1>10000000) && (venta1<15000000)){
				comision1=venta1*0.04;
			}
				else{
					comision1=venta1*0.10;
				}
				System.out.println("Tu primera comision es: "+ comision1);
			if (venta2<=10000000){
				comision2=venta2*0.02;
			}
			else if ((venta2>10000000) && (venta2<15000000)){
				comision2=venta2*0.04;
			}
				else{
					comision2=venta2*0.10;
				}
				System.out.println("Tu segunda comision es: "+ comision2);
			if (venta3<=10000000){
				comision3=venta3*0.02;
			}
			else if ((venta3>10000000) && (venta3<15000000)){
				comision3=venta3*0.04;
			}
				else{
					comision3=venta3*0.10;
				}
				System.out.println("Tu tercera comision es: "+ comision3);
			if (venta4<=10000000){
				comision4=venta4*0.02;
			}
			else if ((venta4>10000000) && (venta4<15000000)){
				comision4=venta4*0.04;
			}
				else{
					comision4=venta4*0.10;
				}
				System.out.println("Tu cuarta comision es: "+ comision4);
				comisiont=comision1+comision2+comision3+comision4;
				System.out.println("Ganaste un total de comisiones por: "+comisiont);
				leer.close();
	}
}