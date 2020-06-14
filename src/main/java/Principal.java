import java.util.Scanner;
/**
 * Escreva a descrição da classe Principal aqui.
 *
 * @author Felipe Voigt
 * @version 1.0
 * @since 01/06/2020 - 21:21
 * @category view
 */
public class Principal{

    public static void main(String args[]) {

        System.out.println("\f");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do nadador: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        Nadador nadador = new Nadador(nome, idade);

        System.out.println(nadador);

    }
}
