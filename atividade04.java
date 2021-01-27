package laços;

import java.util.Scanner;

public class atividade04{ 
     public static void main(String[] args) {
	
	
     double raiz, elevado, num;
    
 
    Scanner ler = new Scanner(System.in);


    System.out.println("Entre com um número inteiro qualquer ");
    num=ler.nextDouble();

      if (num%2==0)
    {
	   raiz =  Math.sqrt(num);
	   System.out.printf("Seu número é par e a raíz quadrada dele é %5.2f" , raiz);
	
    }
    else if ((num%2)>0)
    {
	   elevado = 	Math.pow(num, 2);
	
	
	
	    System.out.println("\nSeu número é ímpar e elevado ao quadrado dá: "+elevado+" e o número é: "+num);
	    System.out.printf("\nSeu número %5.2f é ímpar e elevado ao quadrado dá %5.2f" ,num, elevado);
   }

	
   }
}


