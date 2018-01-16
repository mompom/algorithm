package programmers_level1;

import java.util.Arrays;
import java.util.Collections;

public class ReverseStr {
	public String reverseStr(String str) {
    String[] array = str.split(""); 
  
    Arrays.sort(array,  Collections.reverseOrder());
		
    return String.join("", array);
  }

	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		
		System.out.println("결과는 : " + rs.reverseStr("Zbcdefg"));
	}
}