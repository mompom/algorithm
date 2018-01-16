package programmers_level1;

import java.util.Arrays;
import java.util.ArrayList;

class Divisible {
	public int[] divisible(int[] array, int divisor) {
		
	    ArrayList<Integer> divArray  = new ArrayList<Integer>();
			//ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
	    int arrLen = array.length;
	    for (int i = 0; i < arrLen; i++) {
	    	if (array[i] % divisor == 0) {
	    		divArray.add(array[i]);
	    	}
	    }
	      
	    int[] ret 	= new int[divArray.size()];
	    int retLen 	= ret.length;
	    
	    for(int i=0; i < retLen; i++) {
	        ret[i] = divArray.get(i).intValue();      
	      }
	    
	    return ret;
    }
	
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString (div.divisible(array, 5) ));
	}
}