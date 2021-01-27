package Turma15;

import java.util.Scanner;

public class atividade6 {
	
	
	
	public static void main (String args[])
	{
		double x1,x2,y1,y2,d;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o X1: ");
		x1 = ler.nextDouble();
		System.out.println("Entre com o X2: ");
		x2 = ler.nextDouble();
		System.out.println("Entre com o Y1: ");
		y1 = ler.nextDouble();
		System.out.println("Entre com o Y2: ");
		y2 = ler.nextDouble();
		
		d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		
		System.out.printf("\nO valor de D: %6.2f",d);
		
		
	}
}

