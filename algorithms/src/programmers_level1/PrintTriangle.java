package programmers_level1;

public class PrintTriangle {
	public String printTriangle(int num){
		String star		= "*";
	    String nextLine = "\n";
	    StringBuffer sb = new StringBuffer();
	    
	    for (int i = 0; i < num; i++) { 
	      for (int j = 0; j <= i; j++) { 
	        sb.append(star);
	    	}
	      
	      sb.append(nextLine);
	    }
	    
		return sb.toString();		
	}

	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		
		System.out.println(pt.printTriangle(3));
	}
}