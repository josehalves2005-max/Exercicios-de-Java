package exercicio_if_else;

import java.util.Scanner;

public class Exercicio_if_else2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = 0;
        
        System.out.println("Digite um numero para saber se é impar ou par ");
        number = sc.nextInt();
        
        if(number % 2 == 0) {
            System.out.println("PAR");}
        else{
            System.out.println("IMPAR");}
        


sc.close();













}   
}
