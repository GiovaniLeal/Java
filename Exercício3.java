package Exercicio3;

import java.util.Scanner; 

public class Main {

        public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            
            char menu = 'S';
          
            while ( menu == 's' || menu == 'S' ) {
            
                System.out.println("==============================");
                System.out.println("     Leitor de números        ");
                System.out.println("==============================");
                System.out.println("Insira um número : ");
                float numero = entrada.nextInt();
                
                //Descobrindo o numero inserido 
                
                if (numero == 0 ){
                    System.out.println("O número inserido é zero.");
                } else { 
                        if (numero > 0 ){
                        System.out.println("O número é maior que zero");
                } else {
                        System.out.println("O número é negativo.");}
                }              
            
            //Opcao de sair do loop
            System.out.println("Deseja continuar ? S - sim || N - não ");
            menu = entrada.next().charAt(0);
            
            }     
    }
    
}
