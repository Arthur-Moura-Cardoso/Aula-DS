/**
 *
 * @author Arthur & JPC
 * 
 */

import java.util.Scanner;

public class ex10 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int numero; 

          System.out.println("Digite um número: ");
          numero = sc.nextInt();

          while(numero <=0){
               System.out.println("Valor NULO ");
               numero = sc.nextInt();
          }

          sc.close();
          for(int i = 0; i < numero; i++){
               System.out.println("Os números correspondidos entre os intervalos são: " + (i + 1));
          }
     }
}
