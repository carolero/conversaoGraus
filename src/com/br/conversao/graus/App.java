package com.br.conversao.graus;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input para obter valor a ser convertido
		System.out.println("Valor em graus Celsius a ser convertido");
		double celsius = input.nextDouble();
		
		// Calculo para converssão de celsius em fahrenheit
		double conversion = (9 * celsius + 160) / 5;
		
		double fahrenheit = conversion;
		
		// Print final para o usuário
		System.out.println(celsius + " graus Celsius é equivalente a " + fahrenheit + " graus Fahrenheit");
		
	}

}
