public class Aluno {
	
 private String nome;
 private int RA, anoNascimento;
 
 
 public Aluno (String nome, int anoNascimento, int RA) {
	 this.anoNascimento = anoNascimento;
	 this.nome = nome;
	 this.RA = RA;
 }

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getAnoNascimento() {
	return anoNascimento;
}

public void setAnoNascimento(int anoNascimento) {
	this.anoNascimento = anoNascimento;
}

public int getRA() {
	return RA;
}

public void setRA(int rA) {
	RA = rA;
}

 public int Calcularidade () {
	 
	 int idade, ano;
	 ano = 2022;
	 idade = ano - anoNascimento;
	 
	 return idade;
 }
	
	public String exibirDados() {
		
		String mensagem;
		
		mensagem = ("Estudante: " + nome + " tem, " + Calcularidade() + " anos, e possui o seguinte RA: " + RA) ;
		
		return mensagem;
	}
	
	
	
}
