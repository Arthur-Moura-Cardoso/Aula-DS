
/**
 *
 * @author Arthur e JPC
 * 
 */

import java.util.Scanner;

public class While05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int x = 0;
        int y;

        while (x < 10) {
            System.out.println("Digite um número: ");
            y = sc.nextInt();

            if (y > numero) {
                numero = y;
            }

            x++;

        }
        System.out.println("O maior número é: " + numero);

    }
}
