import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Double saldo = 237.48;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite o numero da sua conta: ");
        Integer conta = scanner.nextInt();
        System.out.println("Por favor, digite o numero da sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco DIOJAVA, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}
