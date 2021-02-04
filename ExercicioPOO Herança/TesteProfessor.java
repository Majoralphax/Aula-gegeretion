package AulaPOO;

public class TesteProfessor {
	public static void main(String[] args) 
	 {
	 ProfessorDE prof1 = new ProfessorDE();
	 
	 Professor prof = new Professor();
	 
	 ProfessorBolsista prof3 = new ProfessorBolsista();
	 
	 prof.setMatricula(100);
	 prof.setNome("João da Silva");
	 
	 prof1.setMatricula(1);
	 prof1.setNome("Alberto");
	 prof1.setSalario(3000);
	 
	 
	 prof3.setMatricula(3);
	 prof3.setNome("Joana");
	 prof3.setValorBolsa(100);
	 
	 
	 System.out.println("Informações Prof 1 = ");
	 prof1.Info();
	 //System.out.println("Salario Prof  = "+prof.Info());
	 System.out.println("Salario Prof 3 = "+prof3.getSalario());
	 }

}

