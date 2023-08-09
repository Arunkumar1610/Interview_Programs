package interview_Programs;

import java.util.Scanner;

public class Find_Datatype {
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        
        
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long number=sc.nextLong();
                System.out.println(number+" can be fitted in:");
               
                //Complete the code
         if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
            System.out.println("* byte");
        }
        if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
            System.out.println("* short");
        }
        if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
            System.out.println("* int");
        }
        if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
            System.out.println("* long");
            }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
