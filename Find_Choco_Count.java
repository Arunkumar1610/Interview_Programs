package interview_Programs;

public class Find_Choco_Count
{
	
	public static void main(String[] args)
	{

		// Chocolate Problem
		
//		You have 15 Rs with you. You go to a shop and shopkeeper tells you price as 1 Rs per chocolate. 
//		He also tells you that you can get a chocolate in return of 3 wrappers. 
//		How many maximum chocolates you can eat?
				
				
	        int totalChoco= 15;
	        int totalWrap= totalChoco;

	        while (totalWrap >= 3)
	        {
	            int freeChoco = totalWrap / 3;
	            totalChoco = freeChoco + totalChoco;
	            totalWrap= totalWrap % 3;
	            totalWrap= totalWrap + freeChoco;
	        }
	        System.out.println(totalChoco);
	   
	}

}
