package exercicio_if_else;

import java.util.Scanner;

public class Exercicio_if_else5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    int hora = 24;
    int inicio = 0;
    int fim = 0;
    int total = 0;
    
    System.out.println("DIGITE A HORA INICIAL E FINAL DO JOGO: ");
    inicio = sc.nextInt();
    fim = sc.nextInt();
    
    if( inicio > fim){
        total = (hora - inicio) + fim;
        System.out.printf("O JOGO DUROU %d HORA(S)%n", total);}
    
    else if( inicio < fim){
        total = (fim - inicio) ;
        System.out.printf("O JOGO DUROU %d HORA(S)%n", total);}
    
    else{
        total = (hora - inicio) + fim;
        System.out.printf("O JOGO DUROU %d HORA(S)%n", total);}
        
    sc.close();
    



    }
    
}
