package exercicios02_02;

public class AviaoExe {
	public static void main (String args []) {
		Aviao fly = new Aviao ("Boeing", "Azul", 800, 400);
		
		System.out.println("\nLista de aviões:");
		fly.imprimirInfo();		
		
		Aviao a = new Aviao (null, null, 0, 0);
		
		System.out.println("\nCadastre um novo modelo: \n");
		
		a.cadastrarTipo();
		a.cadastrarCompanhia();
		a.cadastrarVelocidade();
		a.cadastrarCapacidade();
		
		System.out.println("\n");
		a.imprimirCadastro();
		
		System.out.println("\nLista de aviões (atualizada):");
		fly.imprimirInfo();
		a.imprimirInfo();
	}

}
