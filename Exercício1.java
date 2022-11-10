import java.util.Scanner;
// PTI - Algoritmos || 
// Aluno : Giovani dos Santos de Andrade Leal 
// Data : 03/09/2022

public class Main{
 
  public static void main(String[]args) {
    Scanner entradas = new Scanner (System.in);  
    
    //Menu Inicial 
    System.out.println("================================="); 
    System.out.println("     PTI - ALGORITIMOS II        "); 
    System.out.println("=================================");
    System.out.print ("Quantos números deseja armazenar ? ");
    int x = entradas.nextInt();
    
    //VETOR
     int[] vetor = new int [x];
  
    // Loop que armazena as entradas
      for (int i=0; i<vetor.length; i++) {
       System.out.print( "Numero :"  );
        vetor[i]= entradas.nextInt();
      }

    //Exibir Função da diferença 
    System.out.println("=================================");
    System.out.println (" - A diferença entre o maior e menor elemento é de :  " + diferenca(vetor, x));
    
    //Exibir  Função de validar a ordem do vetor 
    System.out.println("========= CONSIDERANDO ===========");
    System.out.println ("     TRUE - Crescente           " );
    System.out.println ("    FALSE - Decrescente         " );
    if (validarOrdem(vetor,x) == 1){
      System.out.println (" Esse vetor está na ordem Descrescente - FALSE  " );
    } else
    System.out.println (" Esse vetor está na ordem Crescente - TRUE " );      
  }

  //Exibir Função de validar a ordem do vetor 
   static int validarOrdem (int[] num, int y){
    for (int i=0; i < y;  i++){
      if (num[y-1] > num[i]){
        return 0;
      }
    }  
     return 1; 
   }
  
  // Função que retorna a diferença entre o maior número e o menor
   static int diferenca (int[] num, int y){
     
     //Descobrir o maior 
     int maior = num[0];   
     for (int i= 0; i < y; i++){
        if (num[i] > maior ) {
          maior = num[i];
        }
      } 
     //  Descobrir o menor
     int menor =num[0];
     
     for (int i=0; i < y; i++){
       if (num[i]<menor){
        menor= num[i];      
       }
     }
    //Operação de diferença entre maior e menor
    int operacao = 0;
    return operacao = maior - menor;
     
   }  
 
}
