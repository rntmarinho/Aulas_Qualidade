package aplication;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, raio;
		int operacao = 0;
		 
	
	while(operacao != 4){
		
		System.out.print("Digite a operação desejada: ");
		operacao = sc.nextInt();
		sc.nextLine(); 
		
		switch(operacao) {
		 case 1:
			 System.out.println("Digite dois numeros a serem divididos: ");
			 num1 = sc.nextInt();
             num2 = sc.nextInt();
             double divisao = num1 / num2 ;
            
            System.out.printf("A diferenca é: %.2f%n" , divisao);
            break;
		 case 2:
			 System.out.print("Digite o valor do raio: ");
            raio = sc.nextInt();
            sc.nextLine();
            
            double area = Math.PI * Math.pow(raio,2);
            
            System.out.printf("A area do circulo é: %.2f%n", area);
            break;
		 case 3:
			 System.out.println("Digite os numeros a serem calculados: ");
			 
			 double[] numeros = new double[5];
			 
			 for (int i=0; i<5; i++) {
				 numeros[i] = sc.nextDouble();
			 }
			 
			 double soma = 0.0;
			 for (int i=0; i<5; i++) {
				 soma += numeros[i];
			 }
			 
			 double media = soma / 5;
			 
			 System.out.printf("A média arititédica é: %.2f%n", media);
			 
			 break;
		 case 4:
	            System.out.print("FIM DO PROGRAMA!!!");
	              break;
	     default:
	              System.out.println("VALOR INVALIDO CARALHO!!!");
	              break;
		}
		
	}
			
		sc.close();
	}

}

