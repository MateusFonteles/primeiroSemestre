public class Primes{

public static void main(String[] args)
{
    Primes p = new Primes();

    long t = 600851475143L;
    long d = 2;
    while (1==1)
    {
        long tmp = 600851475143L / d;
        if ( t % tmp == 0 &&  p.isPrime(tmp) )
        {
            System.out.println("= " + tmp);
            break;
        }
        d++;
    }
}

    private boolean isPrime(long tmp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
