package la�os;

import java.util.Scanner;

public class atividade04{ 
     public static void main(String[] args) {
	
	
     double raiz, elevado, num;
    
 
    Scanner ler = new Scanner(System.in);


    System.out.println("Entre com um n�mero inteiro qualquer ");
    num=ler.nextDouble();

      if (num%2==0)
    {
	   raiz =  Math.sqrt(num);
	   System.out.printf("Seu n�mero � par e a ra�z quadrada dele � %5.2f" , raiz);
	
    }
    else if ((num%2)>0)
    {
	   elevado = 	Math.pow(num, 2);
	
	
	
	    System.out.println("\nSeu n�mero � �mpar e elevado ao quadrado d�: "+elevado+" e o n�mero �: "+num);
	    System.out.printf("\nSeu n�mero %5.2f � �mpar e elevado ao quadrado d� %5.2f" ,num, elevado);
   }

	
   }
}


