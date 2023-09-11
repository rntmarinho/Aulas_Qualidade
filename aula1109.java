import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int numUm, numDois, numTres, numQuatro, numCinco, raio;
      int operation;
      double pi = 3.14;
      
      System.out.println("Digite a operação desejada: ");
      operation = sc.nextInt();
      sc.nextLine();
      
      switch(operation){
          
          case 1:
              System.out.println("Digite dois numeros a serem divididos: ");
              numUm = sc.nextInt();
              numDois = sc.nextInt();
              
              int divisao = numUm / numDois;
              
              System.out.println("A diferenca e: " + divisao);
              break;
              
           case 2:  
                System.out.println("Digite o valor do raio: ");
                raio = sc.nextInt();
                
                double area = pi * (raio * raio);
                System.out.println("A area do circulo e: " + area);
                break;
        
          case 3:
              System.out.println("Digite os cinco numeros: ");
              numUm = sc.nextInt();
              numDois = sc.nextInt();
              numTres = sc.nextInt();
              numQuatro = sc.nextInt();
              numCinco = sc.nextInt();
              
              double media = (numUm + numDois + numTres + numQuatro + numCinco)/5;
              
              System.out.println("A media dos numeros e: " + media);
              break;
        case 4:
            System.out.print("FIM DO PROGRAMA!!!");
              break;
         default:
              System.out.print("VALOR INVALIDO CARALHO!!!");
              break;
      }
      
      sc.close();
    }
}
