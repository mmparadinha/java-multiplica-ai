import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner numberInput = new Scanner(System.in);
    System.out.println("Escolha um número: ");

    try {
      int x = numberInput.nextInt();
      System.out.println("Tabela de multiplicação de " + x);
      for (int i = 1; i <= 10; i++) {
        System.out.println(i + " * " + x + " = " + (i * x));
      }
    } catch (Exception e) {
      System.out.println("O valor informado não é um número");
    }
    numberInput.close();
  }
}
