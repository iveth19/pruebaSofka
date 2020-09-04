package pruebaSofka.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio2 {

	public static void main(String[] args) {
		{
			
				
				BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
		        String registro = "";
		        int bulto = 0;
		        int totalBultos = 0;
		        int numeroBultos = 0;
		        int min = 9999999;
		        int max = 0;
		        int ingresos = 0;
		        double valorDollar = 0.00027;

		      do{
		          
		         try {
		               System.out.println("Desea ingresar nuevo registro (Y/N)");
		               registro=consola.readLine();
		         } catch(Exception e) {
		             e.printStackTrace();
		         }
		         
		         if(!registro.equals("N")) {
		        	 try {
			              System.out.println("Ingrese el peso del bulto");
			              bulto=Integer.parseInt(consola.readLine());
			         } catch(Exception e) {
			             e.printStackTrace();
			         }
			        
					if(bulto > 500){
			            System.out.println("Valor del Bulto no debe exceder los 500 kg");
			        }else 
			        
			        if(bulto >= 0 && bulto <= 25) {
			            totalBultos = totalBultos + bulto;
			            numeroBultos = numeroBultos + 1;
			        }else
			        
			        if(bulto >= 26 && bulto <= 300){
			            totalBultos = totalBultos + bulto;
			            numeroBultos = numeroBultos + 1;
			            ingresos = ingresos + (bulto*1500);
			        }else
			        
			        if(bulto >= 301 && bulto <= 500){
			            totalBultos = totalBultos + bulto;
			            numeroBultos = numeroBultos + 1;
			            ingresos = ingresos + (bulto*2500);
			         }
					
				       if (min != 0 && max != 0) {
				            if (bulto > max) {
				                max = bulto;
				            }
				            if (bulto < min) {
				                min = bulto;
				            }
				        }
				 
				        if(min==0 || max==0) {
				            if (bulto > max) {
				                max = bulto;
				            }
				            if (bulto < min) {
				                min = bulto;
				            }
				        }		        
		        	 
		         }
		         

		        }while(registro.equals("Y"));

		        System.out.println("Total Bultos Ingresados al vuelo: " +  totalBultos);
		        if(totalBultos != 0) {
		        	System.out.println("Peso promedio bultos: " +  (totalBultos/numeroBultos));
		        }else {
		        	System.out.println("Peso promedio bultos: 0 ");
		        }
		        System.out.println("Peso del bulto mas pesado: " +  max);
		        System.out.println("Peso del bulto mas liviano: " +  min);
		        System.out.println("Total Ingresos en pesos: " +  ingresos);
		        System.out.println("Total Ingresos en dolares: " +  ingresos*valorDollar);
		        
			}
		
	}
	}


