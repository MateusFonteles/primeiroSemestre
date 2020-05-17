
/*
Multiples of 3 and 5
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
LINK PARA O PROBLEMA - https://projecteuler.net/problem=1 
*/

public class Multiples_of_3_and_5 {
    public static void main(String[] args) {
        
        
      
        int soma = 0; // A soma inicia em 0.
        
        for (int i=0; i<=999; i++){ //Continua até chegar ao 999, pois são os múltiplos de 3 e 5 abaixo de 1000
           if (i%3==0 || i%5==0){ // /Se a divisão por 3 ou 5 não gerar resto, inclui na soma.
           soma = soma + i;}    
           }
           
         
        System.out.println(soma); //Mostra no monitor o resultado final da soma.
    }
           
        
    
}
