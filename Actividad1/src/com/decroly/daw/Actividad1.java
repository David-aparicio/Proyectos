package com.decroly.daw;

import java.util.Scanner;


public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//	System.out.println("Buenos días");// Ejercicio 1
	
	// Ejercicio 2
//	double lado = 5;
		
//	System.out.println("El area del cuadrado es:" + (lado * lado));

	// Ejercicio 3
	
	Scanner reader = new Scanner(System.in);
/*	System.out.println("Escriba el lado");
	double lado1 = reader.nextDouble();
	
	System.out.println("El area es : " +  lado1 * lado1);
	// Ejercicio 4
	
	reader = new Scanner(System.in);
	System.out.println("Escriba el primer numero");
	double x = reader.nextDouble();
	
	System.out.println("Escriba el segundo numero");
	double y = reader.nextDouble();
	
	System.out.println("EL valor de la suma es " + (x + y));
	System.out.println("El valor de la resta es " + (x - y));
	System.out.println("El valor del producto " + (x % y));
	System.out.println("El valor de la division " + (x / y));
	
	// Ejercicio 5
	
	reader = new Scanner(System.in);
	System.out.println("Escriba un número que corresponda a la longitud del radio");
	double radio = reader.nextDouble();
	
	double longitud = (2 * Math.PI) * radio;
	double area = Math.PI * Math.pow(radio,2);
	double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
	
	
	
	System.out.println("La longitud de la circunferencia es: " + longitud);
	System.out.println("El area de la circunferencia es: " + area);
	System.out.println("El volumen de la circunferencia es: " + volumen);
	
	// Ejercicio 6
	reader = new Scanner(System.in);
	System.out.println("Escriba el precio del articulo");
	double precioReal = reader.nextDouble();
	
	System.out.println("Escriba el precio de venta real");
	double precioVenta = reader.nextDouble();
	
	double descuento = ((precioVenta - precioReal) / precioVenta) * 100;
	
	System.out.println("El porcentaje de descuento es: " + (descuento + "%"));
	
	// Ejercicio 7
	
	reader = new Scanner(System.in);
	System.out.println("Escriba el numero en millas: ");
	double millas = reader.nextDouble();
	
	double metros = millas * 1852;
	
	System.out.println("Son: " + (metros + "m"));
	
	// Ejercicio 8
	
	reader = new Scanner(System.in);
	System.out.println("Escriba el primer número");
	double Primernum = reader.nextDouble();
	
	System.out.println("Escriba el segundo número");
	double Segundonum = reader.nextDouble();
	
	double mayor = Math.max(Primernum, Segundonum);
	double menor = Math.min(Primernum, Segundonum);
	
	System.out.println("El orden de menor a mayor es: " + menor + " " + mayor);
	
*/	// Ejercicio 9
	
	reader = new Scanner(System.in);
	System.out.println("Escriba el primer número");
	double Primernum1 = reader.nextDouble();
	
	System.out.println("Escriba el segundo número");
	double Segundonum1 = reader.nextDouble();
	
	double mayor1 = Math.max(Primernum1, Segundonum1);
	boolean iguales = Primernum1 == Segundonum1;
	
	System.out.println(iguales + "Son iguales");
	System.out.println("El numero mayor es: " + mayor1);
	

	
	 //Ejercicio 10
	 
	 reader = new Scanner(System.in);
	 System.out.println("Escriba un número");
	 double x = reader.nextDouble();
	 
	 System.out.println("Escriba otro número");
	 double y = reader.nextDouble();
	 
	 System.out.println("Escriba otro número");
	 double z = reader.nextDouble();
	 
	 double Primera = Math.max(x, y);
	 double definitiva = Math.max(Primera, z);
	 
	 System.out.println("El numero mayor es: " + definitiva);
	 
	 //Ejercicio 11
	 
	 reader = new Scanner(System.in);
	 System.out.println("Escriba el primer numero");
	 double prim1 = reader.nextDouble();
	 
	 System.out.println("Escriba un numero que no sea 0");
	 double seg2 = reader.nextDouble();
	 
	 boolean cerito = seg2 == 0;
	 
	 System.out.println(cerito + " Pusiste 0");
	 System.out.println("EL valor de la suma es " + (prim1 + seg2));
	 System.out.println("El valor de la resta es " + (prim1 - seg2));
	 System.out.println("El valor del producto " + (prim1 % seg2));
	 System.out.println("El valor de la division " + (prim1 / seg2));
	 
	 // Ejercicio 12
	 
	 reader = new Scanner(System.in);
	 System.out.println("Escriba el primer numero");
	 double prim2 = reader.nextDouble();
	 
	 System.out.println("Escriba un numero ");
	 double seg3 = reader.nextDouble();
	

	 double mayores = Math.max(prim2, seg3);

	 System.out.println("El numero mayor es: " + mayores);

	 

	 // Ejercicio 13


	 reader= new Scanner(System.in);

	 System.out.println("Escribe un numero: ");

	 double q = reader.nextDouble();

	 

	 boolean positivo = (q >= 0);

	 boolean negativo = (q <= 0);

	 

	 System.out.println(positivo + " El numero es positivo");

	 System.out.println(negativo + " El numero es negativo");
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
	