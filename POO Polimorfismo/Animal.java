package POO;

public abstract class Animal {

	private String nome;
	private int idade;
	private String cor;
	
	public Animal(String nome, int idade, String cor) {
		
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;	
	}	
		public Animal() {
			
		}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	public void som() {
		// TODO Auto-generated method stub
		
	}
	public void andar() {
		// TODO Auto-generated method stub
		
	}
	
	}
