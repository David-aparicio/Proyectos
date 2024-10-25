package com.decroly.daw;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejercicio1
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Escribe una cadena de texto: ");
//		String cadena = sc.nextLine();
//		
//		String [] palabras = cadena.split(" ");
//		for(String palabra : palabras) {
//			System.out.println(palabra);
//		}
//		
		//Ejercicio2
		sc = new Scanner(System.in);
		
		System.out.println("Escriba una cadena de texto: ");
		String cadena2 = sc.nextLine();
		
		System.out.println("Escriba una cadena de texto: ");
		String cadena3 = sc.nextLine();
		
		if (cadena2.equalsIgnoreCase(cadena3)){
			System.out.println("Son iguales");
		}else {
			
			System.out.println("No son iguales");
		}
		// Ejercicio3
		sc = new Scanner(System.in);
		
		System.out.println("Escriba su nombre");
		String nombre = sc.nextLine();
		
		System.out.println("Escriba su primer apellido");
		String primerapellido = sc.nextLine();
		
		System.out.println("Escriba su segundo apellido");
		String segundoapellido = sc.nextLine();
		
		
		String iniciales = nombre.substring(0,3) + primerapellido.substring(0,3) + segundoapellido.substring(0,3);
		
		System.out.println(iniciales.toUpperCase());
		
		//Ejercicio4
		sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		
		frase = frase.toLowerCase();
		 
		int a = 0;
		int e = 0;
		int ivocal = 0;
		int u = 0;
		int o = 0;
		
		 for (int i = 0; i < frase.length(); i++) {
          if (frase.charAt(i) == 'a') {
              a++;
          }
      }
	 

     for (int i = 0; i < frase.length(); i++) {
           if (frase.charAt(i) == 'e') {
               e++;
           }
     }
      
     for (int i = 0; i < frase.length(); i++) {
         if (frase.charAt(i) == 'i') {
             ivocal++;
         }
     }
      
     for (int i = 0; i < frase.length(); i++) {
         if (frase.charAt(i) == 'o') {
             o++;
         }
     }
     
     for (int i = 0; i < frase.length(); i++) {
         if (frase.charAt(i) == 'u') {
             u++;
         }
     }
		
		System.out.println("Nº de A's: " + a + "\n\" + \"Nº de E's: " + e + "\n\" + \"Nº de I's:" + ivocal + "\n\" + \"Nº de O's: " + o + "\n\" + \"Nº de U's: " + u + "\n");
		
		//Ejercicio5
				sc = new Scanner(System.in);
				  
		        System.out.println("Escribe una frase: ");
				
		  		 String frasee = sc.nextLine().toLowerCase();
		  		 
		  		 String frasee2 = frasee.replaceAll(" ", "").toLowerCase();
		        
		        boolean palindromo = true;
		        
		        int letras = frasee2.length();
		        
		        for (int i = 0; i < letras; i++) {
		       	 
		            if (frasee2.charAt(i) != frasee2.charAt(letras - 1 - i)) {
		           	 
		                palindromo = false;
		                
		            }
		        }
		        
		        if (palindromo == true){
		       	 
		            System.out.println("Es un palindromo");
		           
		        } else if (palindromo == false){
		       	 
		            System.out.println("No es un palindromo");
		            
		        }
				
		
		
		
		
		
		
		
		
		
		
	}

}
