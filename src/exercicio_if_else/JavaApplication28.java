package exercicio_if_else;

import java.util.Locale;
import java.util.Scanner;

public class JavaApplication28 {
public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    double salario = 0;
    double resto = 0;
    double restoDois = 0;
    double restoTres = 0;
    double soma = 0;
    double impostoUm = 0.08;
    double impostoDois = 0.18;
    double impostoTres = 0.28;
            
    System.out.println("Digite seu salário ");
    salario = sc.nextDouble();
    

    if(salario <= 2000.00){
        System.out.println("Isento");}
    
    else if(salario > 2000 && salario <= 4500){    
        salario =  salario - 2000.00;    
        resto = salario - 1000;
        salario = (salario - resto);        
        salario =  salario * impostoUm;
        resto = resto * impostoDois;
        
        soma = salario + resto;
    
            System.out.printf("R$ %.2f", soma);}
    
    else if(salario > 4500){
        salario = salario - 2000.00;
        resto = 1000;
        restoDois = 1500;
        restoTres = salario - 2500;
        salario = 0;
        resto = resto * impostoUm;
        restoDois = restoDois * impostoDois;
        restoTres = restoTres * impostoTres;
        
        salario = salario + resto + restoDois + restoTres;
            
            System.out.printf("R$ %.2f", salario);}

sc.close();

    }
    
}
