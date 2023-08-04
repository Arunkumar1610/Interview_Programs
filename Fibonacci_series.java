package interview_Programs;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int n = 10, firstTerm = 2, secondTerm = 5;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) 
	    {
	      System.out.print(firstTerm + ", ");    // 2,5,

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;  // 7, 
	      firstTerm = secondTerm;  // 5 7
	      secondTerm = nextTerm; // 7 
	    }
	}
}
