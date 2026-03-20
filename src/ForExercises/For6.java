package ForExercises;

import java.util.Locale;
import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        int resultado = 0;
        
        System.out.println("Digite o numero: ");
        int numero = sc.nextInt();
        
        int fatorial = numero - 1; 
        int resultadoAnterior = numero;
        
        for(int i = fatorial; i > 0; i --){
        
            System.out.printf("Fatorial de %d e: %d%n",resultadoAnterior, resultado);
                           
            resultado = numero * i;

            numero = resultado;}
        
        
        if (numero == 0 || numero == 1){
            resultado = 1;
            System.out.printf("Fatorial de %d e: %d%n", numero, resultado);
}

        
sc.close();





    }
    
}
