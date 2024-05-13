/**
 *
 * @author Arthur e JPC
 * 
 */

import java.util.Scanner;

public class while06 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int numero = 0;
        int numeromaior = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        
        while(x < 10){
            System.out.println("Digite um número: ");
            y = sc.nextInt(); 
        
            if(y > numero){
                y = numero;
                z = numero;
                
            }
            x++;
        }
        
        System.out.println("O maior número é: "+numeromaior+"\nO segundo maior número é: "+z);
    }
    
}
