/**
 *
 * @author Arthur e JPC
 * 
 */

import java.util.Scanner;

public class While07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int x = 0;

        System.out.println("Digite o tamanho do lado: ");
        numero = sc.nextInt();

        while (x <= numero * numero) {
            if (x % numero == 0)
                System.out.println("*\n");
            else
                System.out.println("*");

            x++;
        }

    }
}
