package org.institutoserpis.ed;

import java.math.BigDecimal;

public class Suma {

	public static void main(String[] args) {
		String primerNumero = "14.5";
		BigDecimal primero = new BigDecimal(primerNumero);
		String segundoNumero = "33";
		BigDecimal segundo = new BigDecimal(segundoNumero);
		BigDecimal suma = primero.add(segundo);
		System.out.print("La suma es " + suma);		
	}

}
