package exercicios02_02;

public class EletronicoExe {
	public static void main(String args []) {
		Eletronico[] novoProduto = new Eletronico[3];
		
		for (int x = 0; x <= 2; x++) {
			novoProduto[x] = new Eletronico(null, null, 0, 0);
			
			System.out.println("Cadastre um novo produto: \n");
			novoProduto[x].cadastrarProduto();
			novoProduto[x].cadastrarCor();
			novoProduto[x].cadastrarPotencia();
			novoProduto[x].cadastrarPreco();
		}
		
		System.out.println("\nLista de novos produtos:\n");
		
		for (int x = 0; x <= 2; x++) {
			novoProduto[x].imprimirInfo();
			System.out.println("\n");
		}
	}

}
