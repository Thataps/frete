import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o peso da sua encomenda em kg: ");
    double peso = sc.nextDouble();

    if (peso < 1) {
      System.out.println("O valor da encomenda é R$ 5,00");
    } else if (1 < peso && peso > 5) {
      System.out.println("O valor da encomenda é R$ 10,00");
    } else {
      System.out.println("O valor da encomenda é R$ 20,00");
    }
    
  }
}