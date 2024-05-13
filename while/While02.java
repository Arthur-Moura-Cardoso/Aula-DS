/**
 *
 * @author Arthur e JPC 
 * 
 */
public class While02 {

    public static void main(String[] args) {
        int num = 0;
        int numPar = 0;

        while (num <= 100) {
            if (num % 2 == 0) {
                numPar = num;
                System.out.println("Os números pares compreendidos entre 0 e 100: " + numPar);
                num++;
            } else {
                num++;
            }
        }

    }

}
