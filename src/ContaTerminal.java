import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número da sua conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Consome a quebra de linha pendente

        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, "
                        + "sua agência é " + agencia + ", conta " + numero
                        + " e seu saldo R$ " + saldo + " já e3stá disponível para saque.";

        System.out.println(mensagem);
        
        scanner.close(); // Fechar o scanner após o uso
    }
}
