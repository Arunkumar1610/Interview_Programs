package interview_Programs;

public class Decimal_to_binary {
	public static void main(String[] args) {
		int decimal=58;
	     int binary[] = new int[40];    
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index] = decimal%2;    
	       decimal = decimal/2; 
	       index++;
	     }    
	     System.out.println(index);
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }    
	System.out.println();//new line  
	}
	   
}
