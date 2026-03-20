package ForExercises;

import java.util.Locale;
import java.util.Scanner;

public class For8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int quadrado = 0;
        int cubo = 0;
        
        System.out.println("Digite um numero");
        numero = sc.nextInt();
        
        for(int i = 0; i <= numero; i ++){
            
            quadrado = i * i;
            cubo = i * i * i;
            
            System.out.printf(" Numero de linha:%d%n Numero ao quadrado: %d%n Numero ao cubo: %d%n%n", i, quadrado, cubo);
        
        
        }
        
        






    }
    
}
