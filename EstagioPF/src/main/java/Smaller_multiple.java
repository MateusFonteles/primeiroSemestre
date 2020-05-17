/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

/**
 *
 * @author mateus
 */
public class Smaller_multiple {
    public static void main(String[] args) {
        
        int n = 2521;
        int div;
                
        do{for (int i=2; i<=20; i++){
        div = n/i;
        while(n%[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}==0)
        n++;
        }
    }
}
}

