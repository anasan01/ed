package org.institutoserpis.ed;

import java.util.Scanner;
import java.util.Random;

public class Adivina 
{

	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner (System.in);
		 Random r = new Random();
		 int adivinar = r.nextInt(100);
		 int i = 0;
		 	System.out.print("Adivina un numero entre 0 y 99. ¿que numero es?");
		 	int apuesta = scanner.nextInt();
		 	while (adivinar != apuesta) {
		 		i++;
		 		if ( adivinar >apuesta) 
		 		{
		 			System.out.print("El numero a adivinar es mas grande. /n intentalo otra vez");
		 		} 	
		 		else 
		 			{
		 				System.out.println("El numero a adivinar es mas pequeño. /n intentalo otra vez");
		 				
		 			}	
		 				apuesta = scanner.nextInt();
		 		}	
		 			System.out.print("Felicidades ha dado con el numero en  " + i +" intentos");
		 	}
		 	
	}