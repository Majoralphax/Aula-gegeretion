package AulaPOO;

import java.util.Scanner;

public class TestePaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		Scanner leia = new Scanner (System.in);
		
		while(x>=0 && x<3) {
			System.out.println("Digite seu nome");
			String nome = leia.next();
			System.out.println("Digite seu tipo sangu�neo");
			String sangue = leia.next();
			System.out.println("Digite sua queixa");
			String queixa = leia.next();
			System.out.println("Digite seu ano de nascimento");
			int AnoNasc = leia.nextInt();
			//int z = 2021-AnoNasc;
			Paciente paciente1 = new Paciente(nome,sangue,queixa,AnoNasc);
			paciente1.idade(2021);
			paciente1.imprimirInfo();
			x++;
		}
		
		

	}

}
