package edu.kit.informatik;

import java.math.BigInteger;
import java.util.Scanner;

public class EGCD {

	private BigInteger x;
	public static BigInteger y;

	public static EGCD solve(BigInteger a, BigInteger b) { 	
    	BigInteger x = BigInteger.ZERO;
    	BigInteger last_x = BigInteger.ONE; 
    	BigInteger y = BigInteger.ONE;
        BigInteger last_y = BigInteger.ZERO;
        while (!b.equals(BigInteger.ZERO))
        	
        BigInteger[] quotientAndRemainder = a.divideAndRemainder(b);
        BigInteger quotient = quotientAndRemainder[0];

        BigInteger temp = a;
        a = b;
        b = quotientAndRemainder[1];

        temp = x;
        x = last_x.subtract(quotient.multiply(x));
        last_x = temp;

        temp = y;
        y = last_y.subtract(quotient.multiply(y));
        last_y = temp;
    }

    EGCD result = new EGCD	();
    result.x = last_x;
    result.y = last_y;
    result.gcd = a;
    return result;
}
}

        	BigInteger q = a / b;

        	BigInteger r = a % b;

 

            a = b;

            b = r;

 

            temp = x;

            x = lastx - q * x;

            lastx = temp;

 

            temp = y;

            y = lasty - q * y;

            lasty = temp;            

        }

        System.out.println("Roots  x : "+ lastx +" y :"+ lasty);

    }

	/** Main function **/

	public static void main(String[] args)

	{

		Scanner scan = new Scanner(System.in);
		BigInteger bigInteger = new BigInteger("");

		System.out.println("Extended Euclid Algorithm Test\n");

		/** Make an object of ExtendedEuclid class **/

		ExtendedEuclid ee = new ExtendedEuclid();

		/** Accept two integers **/

		System.out.println("Enter a b of ax + by = gcd(a, b)\n");

		BigInteger a = scan.nextBigInteger();

		BigInteger b = scan.nextBigInteger();

		/** Call function solve of class ExtendedEuclid **/

		ee.solve(a, b);

	}

}
