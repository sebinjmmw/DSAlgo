import java.util.ArrayList;
import java.util.Iterator;

public class GCD {

    public static void main(String [] args) {

        int a = 108, b = 9;

        int c = a < b ? gcd(a, b) : gcd(b, a);

        System.out.println(c);

    }


    public static int gcd(int a, int b) {

        if(b%a!=0)
        return gcd( b%a, a);
        else
            return a;

    }
}
