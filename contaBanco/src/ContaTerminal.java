import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta");
        int numero = entrada.nextInt();

        System.out.println("digite o número da Agência");
        String agencia = entrada.next();

        System.out.println("digite seu primeiro nome");
        String nome = entrada.next();

        System.out.println("digite seu sobrenome");
        String sobrenome = entrada.next();

        System.out.println("digite o saldo");
        double saldo = entrada.nextDouble();


        System.out.println("Olá " + nome +" "+ sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já esta disponível para saque.");

    }
}
