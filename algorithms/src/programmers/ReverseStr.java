package programmers;

import java.util.Arrays;
import java.util.Collections;

public class ReverseStr {
	public String reverseStr(String str) {
    String[] array = str.split(""); //split은 값을 배열로 리턴
  
    Arrays.sort(array,  Collections.reverseOrder());
		
    return String.join("", array);
  }

	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println(rs.reverseStr("Zbcdefg") );
	}
}