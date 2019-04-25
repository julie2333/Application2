import java.math.BigInteger;


public class Fibonacci {
	public static void main(String[] args){
		for (int i=1;i<=200;i++){
			System.out.print("Fibonacci.of("+i+")=="+of(i)+"\n");
		}
	}
	
	public static BigInteger of(int n) {
	    if (n == 1 || n == 2) {
	        return new BigInteger("1");
	    }
	    BigInteger temp[] = new BigInteger[n + 1];
	    temp[0] = new BigInteger("0");
	    temp[1] = new BigInteger("1");
	    temp[2] = new BigInteger("1");
	    
	    for (int i = 3; i <= n; ++i) {
	        temp[i] = temp[i - 1].add(temp[i - 2]);	        
	    }
	    return temp[n];
	}
}
