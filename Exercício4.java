package Exercicio22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("===============================");
        System.out.println("      LUCRO SOBRE VENDAS       ");
        System.out.println("===============================");
               
        //VARIAVEIS 
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float lucro = 0;
        float porcentagem =0;
        
        //Loop de repetição para calcular 3 produtos 
        
        for(int i =0; i < 3; i++){
        System.out.print("Insira o nome do produto : ");
        nomeProduto = entrada.next();
        System.out.print ("Insira o preço de custo :");
        precoCusto = entrada.nextFloat();
        System.out.print("Insira o preço de venda : ");
        precoVenda = entrada.nextFloat();
        
        /* CACULO DA MARGEM DE LUCRO
          *Levei em consideração a diferença entre lucro e margem de 
         * de lucro
         */
        
         lucro = precoVenda - precoCusto ;
         porcentagem = (lucro/precoVenda) *100;
         
         //Validação de saidas    
        if (precoCusto > precoVenda){
            System.out.println("===============================");
            System.out.println("O produto " + nomeProduto + " obteve prejuízo "
                    + "de " + porcentagem +" % ");
            System.out.println("===============================");
        } else 
            if (precoCusto < precoVenda ){
                System.out.println("===============================");
                System.out.println ("O produto " + nomeProduto + " obteve lucro de "
                    + porcentagem +" % ");
                System.out.println("===============================");
            }
            else {
                System.out.println("===============================");
                System.out.println("Não obteve lucro e nem prejuizo.");
                System.out.println("===============================");}
        
        
        }
}
    
}
