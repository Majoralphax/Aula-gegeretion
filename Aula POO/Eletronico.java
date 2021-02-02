package exercicios02_02;

import java.text.NumberFormat;
import java.util.Scanner;

public class Eletronico {
	public String produto;
	public String cor;
	public double preco;
	public double potencia;
	
	public Eletronico (String produto, String cor, double potencia, double preco) {
		this.produto = produto;
		this.cor = cor;
		this.preco = preco;
		this.potencia = potencia;		
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(preco);
		return formatoMoeda;
	}
	
	public void imprimirInfo() {
		System.out.println("Nome: " + produto + "\nCor: " + cor + "\nPotencia: " + potencia + "W\nValor: " + this.formatarMoeda());
	}
	
	Scanner ler = new Scanner (System.in);
	
	public String cadastrarProduto() {
		System.out.println("Digite o produto: ");
		produto = ler.next();
		return produto;
	}
	
	public String cadastrarCor() {
		System.out.println("Digite a cor do produto: ");
		cor = ler.next();
		return cor;
	}
	
	public double cadastrarPotencia() {
		System.out.println("Digite a potencia do produto: ");
		potencia = ler.nextDouble();
		return potencia;
	}
	
	public double cadastrarPreco() {
		System.out.println("Digite o valor do produto: ");
		preco = ler.nextDouble();
		return preco;
	}
}
