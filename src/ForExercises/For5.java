package ForExercises;

import java.util.Locale;
import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int valorUm = 0;
        int valorDois = 0;
        double valorFinal = 0;
       
        
        System.out.println("Digite o numero de repeticoes");
        int repeticao = sc.nextInt();
        
        for(int i = 0; i != repeticao; i++){
            System.out.println("Digite os numero que deseja dividir: ");
            valorUm = sc.nextInt();
            valorDois = sc.nextInt();
            
            if(valorDois == 0){
                System.out.println("Divisao impossivel ");}
            
            else{
                valorFinal =  valorUm / valorDois;  
                System.out.printf("%.1f%n ", valorFinal);
                }
        
 }
    sc.close();    


    
    
    
    
    
    }
    
}
