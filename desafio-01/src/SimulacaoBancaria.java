import java.util.Scanner;

public class SimulacaoBancaria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double saldo = 0;
    boolean continuar = true;

    while (continuar) {
      
      int opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          double valor = scanner.nextDouble();
          saldo += valor;
          System.out.println("Saldo atual: " + String.format("%.1f", saldo));
          break;
        case 2:
          valor = scanner.nextDouble();
          if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saldo atual: " + String.format("%.1f", saldo));
          } else {
            System.out.println("Saldo insuficiente.");
          }
          break;
        case 3:
          System.out.println("Saldo atual: " + String.format("%.1f", saldo));
          break;
        case 0:
          System.out.println("Programa encerrado.");
          continuar = false;
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    }
    scanner.close();
  }
}
