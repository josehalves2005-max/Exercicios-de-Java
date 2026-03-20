package exercicio_if_else;

import java.util.Scanner;

public class Exercicio_if_else4 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double cachorroQuente = 4.00;
    double xSalada = 4.50;
    double xBacon = 5.00;
    double torrada = 2.00;
    double refrigerante = 1.50;
    
    int pedido = 0;
    int quantidade = 0;
    double valorTotal = 0;
    
    System.out.println("Digite seu pedido e a quantidade: ");
    pedido = sc.nextInt();
    quantidade = sc.nextInt();
    
    
    if(pedido == 1){
        valorTotal = cachorroQuente * quantidade; 
        System.out.printf("Total a pagar: %.2f%n", valorTotal);} 
  
    else if (pedido == 2){
        valorTotal = xSalada * quantidade; 
        System.out.printf("Total a pagar: %.2f%n", valorTotal);}
    
    else if(pedido == 3){
        valorTotal = xBacon * quantidade; 
        System.out.printf("Total a pagar: %.2f%n", valorTotal);}
    
    else if(pedido == 4){
        valorTotal = torrada * quantidade; 
        System.out.printf("Total a pagar: %.2f%n", valorTotal);}
    
    else if(pedido == 5){
        valorTotal = refrigerante * quantidade; 
        System.out.printf("Total a pagar: %.2f%n", valorTotal);}
 
    sc.close();
    }   
}
