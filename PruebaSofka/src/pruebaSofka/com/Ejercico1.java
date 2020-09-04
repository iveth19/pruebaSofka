package pruebaSofka.com;
 import java.util.Scanner;
 
public class Ejercico1 {

	public static void main(String[] args) {
		
		double valorbruto=0;
		double descuento = 0;
		double totalpagar = 0;
		
		Scanner entradaEscaner = new Scanner(System.in);

		System.out.println ("**** Inicio ******");
		
		System.out.println ("Digite la distancia: ");
        double distancia = Double.parseDouble(entradaEscaner.nextLine ());
        
        System.out.println ("Digite días de estancia: ");
        Integer dia = Integer.parseInt(entradaEscaner.nextLine ());
        
        System.out.println ("Digite precio por km: ");
        double precio = Double.parseDouble(entradaEscaner.nextLine ());
		
        		if (distancia >=1000 && dia>=7) {
        			
        			valorbruto = precio * distancia;
                    descuento = valorbruto * 0.30;
                    totalpagar = valorbruto - descuento;
                    
        		}else 
        		{
        			valorbruto = precio * distancia;
        		}
        	System.out.println("Pago bruto a pagar: " + valorbruto);
        	System.out.println("El descuento es de: " + descuento);
        	System.out.println("El valor a pagar neto es : " + totalpagar);
}
	}
