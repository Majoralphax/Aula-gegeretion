package POO;

public class testesanimal {
	public static void main(String[] args) {
		
		
		Cachorro Dog = new Cachorro();
		
		Dog.setNome("Toti");
		Dog.setIdade(2);
		Dog.setCor("Preto");
		
		Cavalo Cav = new Cavalo();
		 
		Cav.setNome("Trovoada");
		Cav.setIdade(20);
		Cav.setCor("Branco");
		
		Preguiça Prego = new Preguiça();
		 
		Prego.setNome("zezin");
		Prego.setIdade(10);
		Prego.setCor("Preto");
		
        System.out.println("Nome do Dog: "+ Dog.getNome());
		
		System.out.println("Idade: "+ Dog.getIdade());
		System.out.println("Cor: "+ Dog.getCor());
		System.out.println("faz este som: ") ;
		Dog.som();
		
		System.out.println("Modo de locomoção: ");
		Dog.andar();
		
		
		
		System.out.println("============================================================== ");
		
		
		  System.out.println("Nome do Dog: "+ Cav.getNome());
			
			System.out.println("Idade: "+ Cav.getIdade());
			System.out.println("Cor: "+ Cav.getCor());
			
			System.out.println("faz este som: ") ;
			Cav.som();
			
			System.out.println("Modo de locomoção: ");
			Cav.andar();
		
			System.out.println("============================================================== ");
		
			
			  System.out.println("Nome do Dog: "+ Prego.getNome());
				
				System.out.println("Idade: "+ Prego.getIdade());
			    System.out.println("Cor: "+ Prego.getCor());
				
				System.out.println("faz este som: ") ;
				Prego.som();
				
				System.out.println("Modo de locomoção: ");
				Prego.andar();
	}
}
