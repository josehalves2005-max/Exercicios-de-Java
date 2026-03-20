package exercicio_if_else;

import java.util.Scanner;

public class Exercicio_if_else3 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    int a = 0;
    int b = 0;
    
    System.out.println("Digite dois numeros em ordem crescente ou descrescente: ");
    a = sc.nextInt();
    b = sc.nextInt();

    
    
    if(a <= b){
    
       if(b % a != 0){ 
       System.out.println("Nao e multiplo");
       }
       else if(b % a == 0){ 
       System.out.println("Sao multiplo");}            
}
    else{
       if(a % b != 0){ 
       System.out.println("Nao e multiplo");
       }
       else if(a % b == 0){ 
       System.out.println("Sao multiplo");}            
}
  
}
}

