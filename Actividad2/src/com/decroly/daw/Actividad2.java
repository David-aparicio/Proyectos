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
		  
		  sc = new Scanner(System.in);
		  int contador = 0;
		  System.out.println("Introduce 10 números no nulos");
		  
		  while (contador <= 10 ) {
		  int numeros = sc.nextInt();
		  System.out.println("Escriba un numero");
		  contador++;
		  
		  if (numeros ==0) {
			  System.out.println("Repita el número");
			  continue;
		  }else if (numeros < 0)
		  
		  
		 }
		  
		  
		  

	
	
	
	
	
	
	
	
	
	} // Public class
}  // Public static