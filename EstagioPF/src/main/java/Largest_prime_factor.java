
import javax.swing.JOptionPane;

/*

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

/**
 *
 * @author mateus
 */
public class Largest_prime_factor {
    public static void main(String[] args) {
    
        long primomaior =3; //pois a soma dos algorismos do número em questão é divisível por 3.
        long n = 3;   
        long div;
        long numero = 600851475143L;
        
        do{ 
        div = numero/n;
              n = n + 2;
        if(numero%n==0){
            numero = div;}
        if(n>primomaior){
            primomaior=n;
            JOptionPane.showMessageDialog(null, primomaior);                 
            System.out.println(primomaior);

        }
        
        }while (div==1);
           
  
}
}
