/**
 *
 * @author Arthur e JPC
 * 
 */

public class While01 {
    public static void main(String[] args) {

        int num = 0; 
        int numImpar= 0;

        while(num <= 100){
            if(num%2 == 1){
            numImpar = num;
            System.out.println("Os números ímpares compreendidos entre 0 e 100: " +numImpar);
            num++; 
        }else {
                num++;
            }
        }
        
    }
}
