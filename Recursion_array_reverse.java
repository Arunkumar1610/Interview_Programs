package interview_Programs;

public class Recursion_array_reverse {

	public static void name(String nam,int length) {
	    System.out.println(length);
	    if(length>=0) {
	      System.out.print(nam.charAt(length));
	      length--;
	      name(nam,length);
	    }
	    
	  }
	  public static void main(String []args) {
	    String nam="Gopala";
	    System.out.println(nam.length()+"****");
	    int le=nam.length()-1;
	    name(nam,le);
	    
	  }

	}

