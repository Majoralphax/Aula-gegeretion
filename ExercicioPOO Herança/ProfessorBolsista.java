package AulaPOO;

public class ProfessorBolsista extends Professor{
	private float valorBolsa;
	 
	 public ProfessorBolsista()
	 {
	        }

	 public ProfessorBolsista(int matricula, String nome) 
	        { 
	                super(matricula,nome);
	 }

	 public ProfessorBolsista(int matricula, String nome, float valorBolsa) 
	        {
	                super(matricula,nome);
	 this.valorBolsa = valorBolsa;
	 }

	 public float getValorBolsa() 
	        {
	 return this.valorBolsa;
	 }

	 public void setValorBolsa(float valorBolsa) 
	        {
	 this.valorBolsa = valorBolsa;
	 }

	 public float getSalario() 
	        {
	 return this.getValorBolsa();
	 }

}
