package exercicios02_02;

import java.util.Scanner;

public class Aviao {
	public String tipo;
	public String companhia;
	public double velocidade;
	public int capacidade;
	
	public Aviao(String tipo, String companhia, double velocidade, int capacidade) {
		this.tipo = tipo;
		this.companhia = companhia;
		this.velocidade = velocidade;
		this.capacidade = capacidade;
	}
	
	public void imprimirInfo() {
		System.out.println("\nTipo: " + tipo + "\nCompanhia: " + companhia + "\nVelocidade: " + velocidade + "km/h \nCapacidade de Passageiros: " + capacidade + " pessoas");
	}
	
	Scanner ler = new Scanner (System.in);
	
	public String cadastrarTipo() {
		System.out.println("Digite o modelo: ");
		tipo = ler.next();
		return tipo;		
	}
	
	public String cadastrarCompanhia() {
		System.out.println("Qual a companhia: ");
		companhia = ler.next();
		return companhia;		
	}
	
	public double cadastrarVelocidade() {
		System.out.println("Qual sua velocidade: ");
		velocidade = ler.nextDouble();
		return velocidade;
	}
	
	public int cadastrarCapacidade() {
		System.out.println("Capacidade de passageiros: ");
		capacidade = ler.nextInt();
		return capacidade;
	}
	
	public void imprimirCadastro()
	{
		System.out.println("Novo avião cadastrado! \nTipo: " + tipo + "\nCompanhia: " + companhia + "\nVelocidade: " + velocidade + "km/h \nCapacidade de Passageiros: " + capacidade + " pessoas");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Scanner getLer() {
		return ler;
	}

	public void setLer(Scanner ler) {
		this.ler = ler;
	}
	
	

}
