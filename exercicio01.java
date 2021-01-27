package laços;

import java.util.Scanner;

public class exercicio01 {
	
	
	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("/nEscreva o primeiro numero: ");
		n1 = ler.nextInt();
		System.out.println("/nEscreva o Segundo numero: ");
		n2 = ler.nextInt();
		System.out.println("/nEscreva o Terceiro numero: ");
		n3 = ler.nextInt();
		
	   if(n1>n2 && n1>n3){
		   
		   System.out.printf("\no maior numero digitado foi: %.2d",n1);
	   }
	   if(n2>n1 && n2>n3) {
		   
		   System.out.printf("\no maior numero digitado foi: %.2d",n2);
	   }
	   if(n3>n1 && n3>n2) {
		   
		   System.out.printf("\no maior numero digitado foi: %.2d",n3);
	   }
	  
			
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
