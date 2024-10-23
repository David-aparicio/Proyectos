package com.decroly.daw;

import java.io.Reader;
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
//		sc = new Scanner(System.in);
//		
//		int P = 0;
//		int Q = 0; 
//		int array = 0;
//		
//		System.out.println("Escriba el número P");
//		P = sc.nextInt();
//		
//		System.out.println("Escriba el número Q");
//		Q = sc.nextInt();
//		
//		if(P > Q) 
//		{
//			System.out.println("El valor P tiene que ser mayor que Q");
//		}else 
//			{	
//				array = Q - P;
//				int[] numeros7 = new int[array];	
//				for (int i = 0; i <= array; i++) {
//					
//					numeros7[i] = P + i;
//					System.out.println("El array desde P hasta Q es: "+ numeros7[i]);
//				}
//			}
//		//Ejercicio8
//		sc = new Scanner(System.in);
//				
//		double[] numeros8 = new double[100];
//		
//		System.out.println("Introduce un valor real R(entre 0.0 y 1.0: )");
//		double R = sc.nextDouble();
//		
//		int contador = 0;
//		for(int i = 0; i < numeros8.length;i ++ ) {
//			
//			numeros8[i] = Math.random();
//			if (numeros8[i] >= R) {
//				contador++;
//			}
//		}
//		System.out.println("Hay "+contador+ " mayores o iguales que "+ R );
		
		//Ejercicio9
//		
//		int [] numeros9 = new int [100];
//		int N = 0;
//		
//		System.out.println("Escriba la posicion N");
//	    N = sc.nextInt(); 
//	    boolean existe = false;	
//	    	
//	    	
//	    for (int i = 0; i < numeros9.length; i++) {
//	    	numeros9[i] = (int) (Math.random() * 10 + 1);
//	    	
//	    	if (numeros9[i] == N) {
//	    		existe = true;
//	    		System.out.println("Está en la posicion " + i);
//	    		
//	    	}
//	    }
		//Ejercicio10
		  
//	    sc = new Scanner(System.in);
//	    
//		 System.out.print("Introduce el número de personas: ");
//	     int N = sc.nextInt();
//		
//	     double[] alturas = new double[N];
//		
//	     for (int i = 0; i < N; i++) {
//	    	 System.out.print("Introduce la altura de la persona: ");
//	     	 alturas[i] = sc.nextDouble();
//	     }
//	     
//	     	double sumaAlturas = 0;
//	        double alturaMax = alturas[0];
//	        double alturaMin = alturas[0];
//	     
//	     for (int i = 0; i < N; i++) {
//	         sumaAlturas += alturas[i];
//	         if (alturas[i] > alturaMax) {
//	             alturaMax = alturas[i];
//	     }
//	         if (alturas[i] < alturaMin) {
//	             alturaMin = alturas[i];
//	         }
//	     }
//	     
//	     double alturaMedia = sumaAlturas / N;
//		
//	     int PEMedia = 0;
//	     int PDMedia = 0;
//		 
//	     for (int i = 0; i < N; i++) {
//	    	 if (alturas[i] > alturaMedia) {
//	             	PEMedia++;
//	     } else if (alturas[i] < alturaMedia) {
//	                PDMedia++;
//	        }
//	     }
//	     
//	     System.out.println("la altura media es:" + alturaMedia);
//	     System.out.println("La altura Minima:"+ alturaMin);
//	     System.out.println("La altura máxima es: "+ alturaMax);
//	     System.out.println("Personas por encima de la media: " + PEMedia);
//	     System.out.println("Personas por debajo de la media: " + PDMedia);
////		
//		
		//Ejercicio 11
	     
//		int [] primero = new int [100];
//		int [] alreves = new int [100];
//		
//		for (int i = 0; i < primero.length; i++)
//		{
//			primero[i] = i + 1;
//			System.out.println(primero[i]);
//		}
//		
//		for (int i = 0; i < alreves.length; i++)
//		{
//			alreves[i] = primero[primero.length-1-i];
//			System.out.println(alreves[i]);
//		}
//		
//		System.out.println("Los numeros son: " + primero +" "+ alreves);
		//Ejercicio12
/*		sc = new Scanner(System.in);
		int [] numeros12 = new int [10];
		
		String opcion = "";
		
		do{
			
			System.out.println("a) - Mostrar valores");
			System.out.println("b) - Introducir valor");
			System.out.println("c) - Exit");
			opcion = sc.nextLine();
		
			switch(opcion)
			{
			case "a":
				for (int i = 0; i < numeros12.length; i++) {
   			 
				System.out.println("El valor del numero "+(i+1) + " es "+ numeros12[i] );
				}
				break;
			
			case "b":
				System.out.println("Introduce un valor: ");
				int V = sc.nextInt();
				
				System.out.println("Introduce su posición: ");
				int P = sc.nextInt();
				
				if (P >= 0 && P < numeros12.length) {
					numeros12[P] = V;
					System.out.println("El valor- " + V + " se añadió en la posicion- " + P);   
				 } else {
					 System.out.println("Posicion invalida, tiene que estar entre 0 y 9");
				 }
				 break;
				 
				 case "c":
				 System.out.println("Saliendo del programa");
				 break;
				 
				 default:
				 System.out.println("Introduce una opcion correcta del menu");
			 }
		
		
	}while(!opcion.equals("c)"));
		 */
		//Ejercicio 13
/*		System.out.println("Introduce el valor inicial:");
		int V = sc.nextInt();
		
		System.out.println("Introduce lo que incrementa: ");
		int Incremento = sc.nextInt();
		
		System.out.println("Introduce la cantidad de valores: ");
		int valores = sc.nextInt();		
		
		int secuencia[] = new int[valores];
		for(int i = 0; i < secuencia.length; i++){
			secuencia[i] = V + i * Incremento;
		}
		
		System.out.println("La secuencia aritmetica es: ");
        for (int num : secuencia){
            System.out.println( num + " ");
        }
*/		
		//Ejercicio 14 
		int [] numeros = new int [55];
	     		
		int repeticiones = 0;
		
        for (int i = 1; i <= 10; i++) {
        	 for (int j = 0; j < i; j++) {
                numeros[repeticiones] = i;
                repeticiones++;
        	 }   
        	 
        }
        System.out.print("La secuencia generada es: ");
        for (int i : numeros) {
            System.out.print(i + " ");
        }
		
		
	}//public static void

}//Public classs
