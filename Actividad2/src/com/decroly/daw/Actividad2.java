package com.decroly.daw;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Ejercicio 1
		
		Scanner sc = new Scanner(System.in);
	/*	System.out.println(" DIme tu edad: ");
		int edad = sc.nextInt();
		
		if (edad >= 18) {
			
			System.out.println(" Eres mayor de edad ");
		}
	
		// Ejercicio 2
		
		sc = new Scanner(System.in);
		
		System.out.println(" DIme tu edad: ");
		int edad1 = sc.nextInt();
		
		if (edad1 >= 18) {
	
			System.out.println(" Eres mayor de edad ");
		} else if (edad1 < 18) {
			
			System.out.println(" Eres menor de edad ");
		}
		
		// Ejercicio 3 
		
		for (int i = 1; i <= 20 ; i++) {
			System.out.println(i);
			}
		
		// Ejercicio 4
		
		for (int i = 0; i <= 200; i +=2 ) {
			System.out.println(i);
			}
	


		// Ejercicio 5
		
		for (int contador = 1; contador <= 200; contador++) {
  
			if (contador % 2 == 0) {
       
			System.out.println("Los numeros pares son:" + contador); 
    		}
		}
		
		// Ejercicio 6
		
		sc = new Scanner(System.in);
		System.out.println(" Escriba un número ");
		int n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			
			System.out.println(i);
		}
		
		// Ejercicio 7
		
		sc = new Scanner(System.in);
		System.out.println("Escriba su nota");
		double Nota = sc.nextDouble();
		
		if(Nota < 5) {
			System.out.println(" Insuficiente ");
		} else if (Nota < 6) {
			System.out.println(" Suficiente ");
		} else if (Nota <7 ) {
			System.out.println(" Bien ");
		} else if (Nota <9) {
			System.out.println(" Notable ");
		} else if (Nota <= 10 ) {
			System.out.println(" Sobresaliente ");
		}
	
		// Ejercicio 8
		
		sc = new Scanner(System.in);
		System.out.println("Escriba su número positivo ");
		int N = sc.nextInt();
		
		int fact=1;
		
		if (N < 0) {
			System.out.println("Tiene que ser positivo");
		}
		for(i=1; i<=N; i++){
		      fact=fact*i;
		  }
		
		  System.out.println("El factorial de "+N+" es: "+fact);
		  */  
		  // Ejercicio 9
		  
//		  sc = new Scanner(System.in);
//		  System.out.println("Escriba la hora");
//		  int horas = sc.nextInt();
//		  
//		  System.out.println("Escriba los minutos que son");
//		  int minutos = sc.nextInt();
//		  
//		  System.out.println("Escriba los segundos ");
//		  int segundos = sc.nextInt();		  
//		  
//		  segundos = segundos + 1;
//		  
//		  if (segundos == 60) {
//			  segundos = 0;
//			  minutos ++;
//		  }
//		  if (minutos == 60) {
//			  minutos = 0;
//			  horas ++;
//		  }
//		  if (horas == 24) {
//			  horas = 0;
//		  }
//		  
//		  System.out.println("La hora que es despues de que pase un segundo es: " + horas + ":" + minutos + ":" + ":" + segundos);
		  
		  
		  //Ejercicio 10 
		  
//		  sc = new Scanner(System.in);
//		  int contador = 0;
//		  int numNegativo = 0;
//		  int numPositivo = 0;
//		  System.out.println("Introduce 10 números no nulos"); 
//		  
//		  while (contador < 10 ) {
//
//			  System.out.println("Escriba un numero");
//			  int numeros = sc.nextInt();
//			  
//			  if (numeros == 0 ) {
//				  System.out.println("Repita el número");
//				  continue;
//			  }else if (numeros < 0) {
//				  numNegativo++;
//				  contador++;
//				  
//			  }else {
//				  
//				  numPositivo++;
//				  contador++;
//			  }
//			  	  
//		 }
//		 if(numNegativo>=1) {
//			 System.out.println("Hay al menos un número negativo ");
//		 }else if(numNegativo ==0) {
//			 System.out.println("No hay numeros negativos ");
//		 }
			
		 
		 // Ejercicio 11
		 
//		  sc = new Scanner(System.in);
//		  contador = 0;
//		  numNegativo = 0;
//		  numPositivo = 0;
//		  System.out.println("Introduce 10 números no nulos"); 
//		  
//		  while (contador < 10 ) {
//
//			  System.out.println("Escriba un numero");
//			  int numeros = sc.nextInt();
//			  
//			  if (numeros == 0 ) {
//				  System.out.println("Repita el número");
//				  continue;
//			  }else if (numeros < 0) {
//				  numNegativo++;
//				  contador++;
//				  
//			  }else {
//				  
//				  numPositivo++;
//				  contador++;
//			  }
//			  	  
//		 }
//		 System.out.println("Introduciste: " + numNegativo + " numeros negativos.");
//		 System.out.println("Introduciste: " + numPositivo + " numeros positivos.");
		
		// Ejercicio 12
		
//		sc = new Scanner(System.in);
//		int contadorP = 0;
//		int contadorN = 0;
//		int numero = 0;
//		boolean hayNegativo = false;
//		System.out.println("Introduce un numero: ");	
//		 do {
//	            System.out.print("Número: ");
//	            numero = sc.nextInt();
//
//	            if (numero > 0) {
//	                contadorP++;
//	            } 
//	            
//	            if (numero < 0 ){
//	            	hayNegativo = true;
//	            	contadorN++;
//	            }
//		 	}while (numero !=0);
//		 
//		 		if(hayNegativo) {
//		 			System.out.println("Si hay negativos");
//		 		}
//	        
//			
//		 System.out.println("hay "+ contadorP+" Positivos");
//		 System.out.println("hay "+contadorN+" Negativos");
//		 
//		 // Ejercicio 13
//		 
//		 System.out.println("Los 10 primeros numeros naturales: ");
//		 int suma = 0;
//		 int producto = 1;		 
//		 for (int i = 1; i <= 10 ; i++) {
//			 suma += i;
//			 producto *= i;
//			 }
//		 
//		 System.out.println(" La suma es "+ suma);
//		 System.out.println("El producto es "+ producto);
		 
		 // Ejercicio 14
	
		sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre ");
		String nombre = sc.nextLine();
		
		System.out.println("Cuantas horas curras a la semana");
		double horas = sc.nextDouble();
		
		System.out.println("Cual es tu tarifa");
		int tarifa = sc.nextInt();
		double salariobruto;
		
		if (horas <= 35 ) {
			salariobruto = horas * tarifa;
		} else {
			double horasExtra = horas -35;
			salariobruto = (35 * tarifa)  + (horasExtra * tarifa * 1.5);
			
		}
		double impuestos = 0;

        if (salariobruto > 900) {

        	

            impuestos += (salariobruto - 900) * 0.45;   

            impuestos += 400 * 0.25;           

        } else if (salariobruto > 500) {

            impuestos += (salariobruto - 500) * 0.25;   

        }

        double salarioNeto = salariobruto - impuestos;
        
        System.out.println("Nombre" + nombre);
        System.out.println("Salario bruto: " + salariobruto + "€");
        System.out.println("Tasas de impuestos: " + impuestos + "€");
        System.out.println("Salario neto: " + salarioNeto + "€");
	
	
	
	
	} // Public class
}  // Public static