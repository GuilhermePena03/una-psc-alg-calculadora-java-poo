import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String menu;
    Double numUm = 0.0, numDois = 0.0;

    System.out.println("Calculadora");

    do {
      System.out.println("Informe o primeiro número");
      numUm = sc.nextDouble();

      System.out.println("Informe o segundo número");
      numDois = sc.nextDouble();

      Calculadora calculadora = new Calculadora(numUm, numDois);

      System.out.println("\nEscolha a operação:");
      System.out.println("1 - Adição");
      System.out.println("2 - Subtração");
      System.out.println("3 - Multiplicação");
      System.out.println("4 - Divisão");
      System.out.println("5 - Potência");
      System.out.println("6 - Raiz Quadrada");
      System.out.println("Q - Sair");

      menu = sc.next();

      switch (menu.toUpperCase()) {
        case "1":
          System.out.println("Resultado: " + calculadora.somar());
          break;
        case "2":
          System.out.println("Resultado: " + calculadora.subtrair());
          break;
        case "3":
          System.out.println("Resultado: " + calculadora.multiplicar());
          break;
        case "4":
          System.out.println("Resultado: " + calculadora.dividir());
          break;
        case "5":
          System.out.println("Resultado: " + calculadora.potencia());
          break;
        case "6":
          System.out.println("Resultado: " + calculadora.raizQuadrada());
          break;
        case "Q":
          System.out.println("Programa encerrado");
          break;
        default:
        System.out.println("Opção invalida");
          break;
      }
    } while (!menu.equalsIgnoreCase("Q"));
    sc.close();
  }
}
