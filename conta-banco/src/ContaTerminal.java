import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        // Solicitando e lendo os dados do usuário
        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();
        
        // Limpar o buffer do teclado
        scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da Conta!");
        saldo = scanner.nextDouble();
        
        // Fechando o scanner
        scanner.close();
        
        // Exibindo a mensagem final com concatenação
        String mensagem = "Olá " + nomeCliente + 
                         ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                         ", conta " + numero + 
                         " e seu saldo " + saldo + 
                         " já está disponível para saque";
        
        System.out.println(mensagem);
        

    }
}