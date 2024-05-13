
/**
 *
 * @author Arthur e JPC
 * 
 */
public class While03 {

    public static void main(String[] args) {

        int numero_usuario = 10;
        int numero = 0;

        while (numero < numero_usuario) {
            if (numero % 2 == 0) {
                System.out.println(numero + " Número Par");
                numero++;
            } else {
                System.out.println(numero + " Número Impar");
                numero++;
            }
        }

    }

}
