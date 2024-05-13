/**
 *
 * @author Arthur e JPC
 * 
 */

public class Case03 {

    public static void main(String[] args) {

        double num1 = 12.5;
        double num2 = 5;

        int codigo = 1;

        double media = (num1 + num2) / 2;
        double sub = (num1 - num2);
        double mult = (num1 * num2);
        double div = (num1 / num2);

        switch (codigo) {
            case 1 -> System.out.println("A média é = " + media);
            case 2 -> System.out.println("A diferença é = " + sub);
            case 3 -> System.out.println("O produto é = " + mult);
            case 4 -> System.out.println("A divisão é = " + div);
        }

    }

}
