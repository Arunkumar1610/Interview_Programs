package interview_Programs;

public class zoho_interview_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		TEST CASE 1
//		n=6 , x=4 , y=10
//		(x<y)
//		a=4,3,7,11,50,1
//		
//		output=7
//		
//		CASE 2
//		x=10 y=14
//		output=11

		
		int[] arr= {4,3,7,11,50,1};
		
		int x=10 ,y=14;
		
		if(x<y) {
		
		for(int i=0; i<arr.length-1;i++)
		{
			if(arr[i]>x && arr[i]<y)
			{
				System.out.println(arr[i]);
			}
		}
		
		}
		else {
			System.out.println("condition mismatch");
		}
	}
}
