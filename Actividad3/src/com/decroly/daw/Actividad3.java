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
		
		if{
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
