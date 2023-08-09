package interview_Programs;

public class NumberPattern {
    public static void main(String[] args) {
    	
    	int h=5;

        for(int row=5; row>0; row--)
        {
        	for(int i=1; i<row; i++)
        	{
        		System.out.print("* ");
        	}
        	for(int j=row; j<=h; j++)
        	{
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
    }
}

