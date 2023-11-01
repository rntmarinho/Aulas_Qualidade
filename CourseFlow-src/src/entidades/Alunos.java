package entidades;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import banco.Conexao_bd;

public class Alunos extends Conexao_bd{
	private String alunoCPF, alunoNome, alunoTelefone, alunoEmail, alunoCEP;
	private Date alunoNascimento;
	
	public Alunos() {
		
	}
	
	public Alunos(String alunoCPF, String alunoNome, String alunoTelefone, String alunoEmail, String alunoCEP, Date alunoNascimento) {
		this.alunoCPF = alunoCPF;
		this.alunoNome = alunoNome;
		this.alunoTelefone = alunoTelefone;
		this.alunoEmail = alunoEmail;
		this.alunoCEP = alunoCEP;
		this.alunoNascimento = alunoNascimento;
	}
		
	public String getAlunoCPF() {
		return alunoCPF;
	}
	
	public void setAlunoCPF(String alunoCPF) {
		this.alunoCPF = alunoCPF;
	}
	
	public String getAlunoNome() {
		return alunoNome;
	}
	
	public void setAlunoNome(String alunoNome) {
		this.alunoNome = alunoNome;
	}
	
	public String getAlunoTelefone() {
		return alunoTelefone;
	}
	
	public void setAlunoTelefone(String alunoTelefone) {
		this.alunoTelefone = alunoTelefone;
	}
	
	public String getAlunoEmail() {
		return alunoEmail;
	}
	
	public void setAlunoEmail(String alunoEmail) {
		this.alunoEmail = alunoEmail;
	}
	
	public String getAlunoCEP() {
		return alunoCEP;
	}
	
	public void setAlunoCEP(String alunoCEP) {
		this.alunoCEP = alunoCEP;
	}
	
	public Date getAlunoNascimento() {
		return alunoNascimento;
	}
	
	public void setAlunoNascimento(Date alunoNascimento) {
		this.alunoNascimento = alunoNascimento;
	}
	
	public boolean alunoCadastrar() {
		String sql = "INSERT INTO sua_tabela (CFP, Nome, Telefone, Email, CEP, Nascimento) VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			conectar();
            try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            	statement.setString(1, alunoCPF);
                statement.setString(2, alunoNome);
                statement.setString(3, alunoTelefone);
                statement.setString(4, alunoEmail);
                statement.setString(5, alunoCEP);
                java.sql.Date sqlNascimento = new java.sql.Date(alunoNascimento.getTime());
                statement.setDate(6, sqlNascimento);
                statement.executeUpdate();
                int rowsAffected = statement.executeUpdate();

                return rowsAffected > 0;
            } finally {
                if (conexao != null && !conexao.isClosed()) {
                    conexao.close();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
	}
	
	@Override
	public String toString() {
		return "Alunos [alunoCPF=" + alunoCPF + ", alunoNome=" + alunoNome + ", alunoTelefone=" + alunoTelefone
				+ ", alunoEmail=" + alunoEmail + ", alunoCEP=" + alunoCEP + ", alunoNascimento=" + alunoNascimento
				+ ", conexao=" + conexao + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
