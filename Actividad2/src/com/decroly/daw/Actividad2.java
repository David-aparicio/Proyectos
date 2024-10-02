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
	*/	
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
		
		
		
		
	}
}