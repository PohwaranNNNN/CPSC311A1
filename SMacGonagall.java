/**
 * CPSC331 Assignment1 Question3
 * Name: Gao XingYu
 * UCID: 30047403  
 */

package cpsc331.Assignment1;

public class SMacGonagall {
	
	public static int smacG(int n) {
	    // Assertion: n is an integer input such that n is greater than or equal to zero.
	    // Bound Function: n

	    if (n == 0) {
	      // Assertion: n is an integer input whose value is 0.

	    	return 1;
	      // Assertion:
	      // 1. n is an integer input with value 0.
	      // 2. The nth MacGonagall number returned as output, and M(n) = M(0)= 1.
	    	
	    }else if (n == 1) {
	      // Assertion: n is an integer input with value 1.

	    	return 0;
	      // Assertion:
	      // 1. n is an integer input with value 1.
	      // 2. The nth MacGonagall number returned as output,and M(n) = M(1) = 0.

	    }else if (n == 2) {
	      // Assertion: n is an integer input with value 2.

	    	return 5;
	      // Assertion:
	      // 1. n is an integer input with value 2.
	      // 2. The nth MacGonagall number returned as output,and M(n) = M(2) = 5.

	    } else if (n == 3) {
	      // Assertion: n is an integer input whose value is 3.

	    	return 8;
	      // Assertion:
	      // 1. n is an integer input with value 3.
	      // 2. The nth MacGonagall number returned as output,and M(n) = M(3) = 8.

	    }else if (n >= 4){
	      // Assertion: n is an integer input such that n is greater than or equal to 4.

	    	return 2*smacG(n-1)-2*smacG(n-3) + smacG(n-4);
	      // Assertion:
	      // 1. n is an integer input such that n is greater than or equal to 4.
	      // 2. The nth MacGonagall number, M(n) = 2*M_(n-1) - 2*M_(n-3) + M_(n-4) returned as output.
	    }else {
	    	throw new IllegalArgumentException(Integer.toString(n)); 	
	    }
	    // Assertion:
	    // 1. n is an integer input such that n is greater than or equal to zero.
	    // 2. The nth MacGonagall number M(n), has been returned as output.
	    // 3. If n is negative or n is not a number, then an IllegalArgumentException has been thrown.
	  }
	
	
	
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Fiddlesticks! One integer input is required.");
		}else {
			try {
				int n = Integer.parseInt(args[0]);
				System.out.println(smacG(n));
			}
			    	
			catch (NumberFormatException e) {
				System.out.println("Fiddlesticks! One integer input is required.");
			}
			    	
			catch (IllegalArgumentException e) {
				System.out.println("Fiddlesticks! The input integer cannot be negative.");
			}
		}
	}
}