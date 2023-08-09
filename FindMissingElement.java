package interview_Programs;

import java.util.Arrays;

public class FindMissingElement 
{

  public static int findMissingElement(int[] A, int N) 
  {
    int sum = 0;
    for (int i = 1; i <= N; i++) 
    {
      sum += i;
    }
   
    for (int i = 0; i < A.length; i++) {
      sum -= A[i];
    }

    return sum;
  }

  public static void main(String[] args) 
  {
 
    int[]A = {6, 1, 2, 8, 3, 4, 7, 10, 5};
   int N = 10;
    
    int result=findMissingElement(A, N);
    System.out.println("Missing Element is "+result);
  }
}

