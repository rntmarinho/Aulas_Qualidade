import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Informe o nome: ");
		Scanner digitaNome = new Scanner(System.in);
		String nome = digitaNome.next();
		
		System.out.println("Informe o Registro Academico: ");
		Scanner digitaRA = new Scanner(System.in);
		int RA = digitaRA.nextInt();
		
		System.out.println("Informe o ano de nascimento: ");
		Scanner digitaAno = new Scanner(System.in);
		int ano = digitaNome.nextInt();
		
		Aluno aluno = new Aluno(nome, ano , RA);
		
		System.out.println(aluno.exibirDados());
		
		digitaNome.close();
		digitaRA.close();
		digitaAno.close();
	}

}
