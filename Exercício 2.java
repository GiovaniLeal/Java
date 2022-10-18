/*
*PROPOSTA : 
* Escreva um algoritmo para determinar o consumo médio de um automóvel sendo 
* fornecida a distância total percorrida pelo automóvel e o total de combustível
*  gasto;
 */

package Exercicio3;

import java.util.Scanner; 

public class Main {


    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);   
        
    // Inicio 
     char condicional = 's';
    
    while (condicional == 's' || condicional== 'S'){
      System.out.println("==========================================");
      System.out.println(" DETERMINANDO O CONSUMO MÉDIO DO AUTOMÓVEL");
      System.out.print("Informe a distância percorrida : KM - ");
      float distancia = entrada.nextFloat();
      System.out.print("Informe o total de combustivel gasto : Litros - ");
      float combustivel = entrada.nextFloat();
      
      // Calculo do consumo médio 
      
      float consumomedio = distancia / combustivel;
      
      //Mostrando na tela 
      System.out.println("===========================================");
      System.out.println ("O Consumo médio do seu automóvel é de "      
              + consumomedio + "KM/L");
     System.out.println("===========================================");
     System.out.println("DESEJA REALIZAR UM NOVO CALCULO ? ");
     System.out.println("S - SIM");
     System.out.println("N - NÃO");
     condicional = entrada.next().charAt(0);
    }
    
    
    
    }
    
}
