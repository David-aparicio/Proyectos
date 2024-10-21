package com.decroly.daw;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
 
		// TODO Auto-generated method stub

		//Ejercicio 1
		
		Scanner sc = new Scanner(System.in);
//		double [] numeros = new double [10];
//		System.out.println("Introduce 10 numeros");
//		for (int i = 0; i < 10;i++) {
//			numeros[i]= sc.nextDouble();
//		}
//		System.out.println("Los numeros son ");
//		for (int i = 0; i < 10; i++) {
//			System.out.println(numeros[i]);
		//}
		
		//Ejercicio2
//
//		sc = new Scanner(System.in);
//		double [] numeros1 = new double [10];
//		double suma = 0;
//		System.out.println("Introduce 10 números");
//		for (int i = 0; i < numeros1.length;i++) {
//			numeros1[i]= sc.nextDouble();
//			suma = numeros1[i] + suma;
//		}
//		System.out.println("La suma es: " + suma);
		
		//Ejercicio3
//		sc = new Scanner(System.in);
//		
//		double [] numeros3 = new double [10];
//		
//		double mayor = Double.MIN_VALUE;
//		double menor = Double.MAX_VALUE;
//		
//		System.out.println("Introduce 10 números ");
//		
//		for ( int i = 0; i < numeros3.length; i++) {
//			numeros3[i] = sc.nextInt(); 
//			mayor = Math.max(mayor, numeros3 [i]);
//			menor = Math.min(menor, numeros3 [i]);
//		}
//		System.out.println("El numero mayor es "+ mayor);
//		System.out.println("El numero menor es "+ menor);
//		
		//Ejercicio4
//		sc = new Scanner(System.in);
//		
//		int [] numeros4 = new int [20];
//		int positivos = 0;
//		int negativos = 0;
//		System.out.println("Introduce 20 números");
//		
//		for (int i = 0; i< numeros4.length; i++) {
//			numeros4[i] = sc.nextInt();
//			
//			if(numeros4[i] >= 0) {
//				positivos += numeros4[i];
//			}
//			if(numeros4[i] < 0) {
//				negativos += numeros4[i];
//			}
//		}
//		System.out.println("La suma de los positivos es: "+ positivos);
//		System.out.println("La suma de los negativos es: " + negativos);
//		
		//Ejercicio5
//		sc = new Scanner(System.in);
//		
//		double [] numeros5 = new double [20];
//		
//		double suma = 0;
//		double media = 0; 
//		
//		System.out.println("Introduce 20 números");
//		
//		for ( int i = 0; i< numeros5.length; i++) {
//			numeros5[i] = sc.nextInt();
//			suma = suma + numeros5[i];
//			media = suma / 20;
//		}
//		System.out.println("La media es: "+ media);
		
		//Ejercicio6
//		sc = new Scanner(System.in);
//
//		int N = 0;
//		int M = 0;
//
//
//		System.out.println("Escriba el número N");		
//		N = sc.nextInt();
//
//		System.out.println("Escriba el número M");		
//		M = sc.nextInt();

//		double[] numeros6 = new double[N];
//		
//		for (int i = 0; i < N; i++){
//		
//			numeros6[i] = M;		

//			System.out.println("Los números son: " + numeros6[i]);

//		}
		//Ejercicio7
		sc = new Scanner(System.in);
		
		int P = 0;
		int Q = 0; 
		int array = 0;
		
		System.out.println("Escriba el número P");
		P = sc.nextInt();
		
		System.out.println("Escriba el número Q");
		Q = sc.nextInt();
		
		if(P > Q) 
		{
			System.out.println("El valor P tiene que ser mayor que Q");
		}else 
			{	
				array = Q - P;
				double [] numeros7 = new double[array];
				
			}
			
		
		
		
		
		
		
		
		
	}//public static void

}//Public classs
