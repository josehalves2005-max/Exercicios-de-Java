package operadora;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    int minutos = 0;
    double plano = 50.00;
    double juros = 0;
    double total = 0;
    
    System.out.println("Digite os minutos usados: ");
    minutos = sc.nextInt();
    
    if(minutos > 100){
        juros += plano + (minutos - 100) * 2;
        total = juros + plano;
        
        System.out.printf("Valor a pagar R$ = %.2f%n", total);
}
    else
        System.out.printf("Valor a pagar R$ = %.2f%n", plano);

    sc.close();
    }
    
}
