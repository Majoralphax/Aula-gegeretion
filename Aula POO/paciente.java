package AulaPOO;

public class paciente {
	
	private String Nome;
	private String TipoSangue;
	private String Queixa;
	private int AnoNasc;
	
	public void Paciente(String Nome,String Sangue,String Queixa,int AnoNasc) {
		this.Nome = Nome;
		this.TipoSangue = Sangue;
		this.Queixa = Queixa;
		this.AnoNasc =  AnoNasc;
	}
	public void idade(int conta)
	{
		
	}
	public void imprimirInfo()
	{
		AnoNasc = 2021 - AnoNasc;
		System.out.println(Nome+" possui o tipo sanguíneo "+TipoSangue+" Com os sintomas "+Queixa+" de "+AnoNasc+" anos");
	}
	
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTipoSangue() {
		return TipoSangue;
	}

	public void setTipoSangue(String tipoSangue) {
		TipoSangue = tipoSangue;
	}

	public String getQueixa() {
		return Queixa;
	}

	public void setQueixa(String queixa) {
		Queixa = queixa;
	}

	public int getAnoNasc() {
		return AnoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		AnoNasc = anoNasc;
	}
	
	
}




