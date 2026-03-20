package ForExercises;

import java.util.Locale;
import java.util.Scanner;

public class For7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        int divisor = 0;
        int numero = sc.nextInt();
        
        for(int i = 1; i <= numero; i++){
   
            divisor = numero % i;

            if (divisor == 0){
            System.out.printf("%d%n", i);}
        }
sc.close();
            
            
        }

}
    

