import java.net.Socket;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da CONTA: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o nummero da AGENCIA: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu NOME COMPLETO: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu SALDO: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo R$"+ saldo +" já está disponivel para saque!");




    }
}
