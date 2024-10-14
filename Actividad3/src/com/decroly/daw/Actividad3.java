package com.decroly.daw;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		//Ejercicio 1
		int b500 = 0;
		int b200 = 0;
		int b100 = 0;
		int b50 = 0;
		int b20 = 0;
		int b10 = 0;
		int b5 = 0;
		
		System.out.println("Introduzca la cantidad de dinero: ");
		int dinero = reader.nextInt();
		int resto = dinero;
		
		if (dinero  %5 != 0) {
			System.out.println("El dinero tiene que ser multiplo de 5");
		}
		
		if (dinero >= 500) {
			b500 = resto / 500;
			 resto= resto % 500;
		}

		if (resto >= 200) {
			b200 = resto / 200;
			resto= resto % 200;
		}

		if (resto >= 100) {
			b100 = resto / 100;
			resto= resto % 100;
		}

		if (resto >= 50) {
			b50 = resto / 50;
			resto= resto % 50;
		}

		if (resto >= 20) {
			b20 = resto / 20;
			resto= resto % 20;
		}

		if (resto >= 10) {
			b10 = resto / 10;
			resto= resto % 10;
		}

		if (resto >= 5) {
			b5 = resto / 5;
			resto= resto % 5;

		}
		System.out.println("Se necesitan "+ b500+ " billetes de 500");
		System.out.println("Se necesitan "+ b200+ " billetes de 200");
		System.out.println("Se necesitan "+ b100+ " billetes de 100");
		System.out.println("Se necesitan "+ b50+ " billetes de 50");
		System.out.println("Se necesitan "+ b20+ " billetes de 20");
		System.out.println("Se necesitan "+ b10+ " billetes de 10");
		System.out.println("Se necesitan "+ b5+ " billetes de 5");
		
	
	
		
		//Ejercicio 2
		String opcion = "";
		double num1 = 0;
		double num2 = 0;
		
		do {
			reader = new Scanner(System.in);
			
			System.out.println("1) Sumar");
			System.out.println("2) Restar");
			System.out.println("3) Multiplicar");
			System.out.println("4) Dividir");
			System.out.println("5) Salir");
			opcion = reader.nextLine();
			
			switch(opcion)
			{
				case "1":
					reader = new Scanner(System.in);
					System.out.println("Introduce el primer número");
					num1 = reader.nextDouble();
					System.out.println("Introduce el segundo número");
					num2 = reader.nextDouble();
					System.out.println("El resultado es "+ (num1 + num2));
					break;
				case "2":
					reader = new Scanner(System.in);
					System.out.println("Introduce el primer número");
					num1 = reader.nextDouble();
					System.out.println("Introduce el segundo número");
					num2 = reader.nextDouble();
					System.out.println("El resultado es "+ (num1 - num2));
					break;
				case "3":
					reader = new Scanner(System.in);
					System.out.println("Introduce el primer número");
					num1 = reader.nextDouble();
					System.out.println("Introduce el segundo número");
					num2 = reader.nextDouble();
					System.out.println("El resultado es "+ (num1 * num2));
					break;
				case "4":
					reader = new Scanner(System.in);
					System.out.println("Introduce el primer número");
					num1 = reader.nextDouble();
					System.out.println("Introduce el segundo número");
					num2 = reader.nextDouble();
					if(num2 == 0) {
						System.out.println("El número no es valido");
					}else {
						System.out.println("El resultado es "+ (num1 / num2));;
					}
					break;
					
				case "5":
					System.out.println("arrivederci");
					break;
				default:
                    System.out.println("Introduzca una opcion correcta del menu");
                    break;
			}
		}while(!opcion.equals("5"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//static void

}//class
