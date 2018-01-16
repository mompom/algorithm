package programmers_level2;

import java.util.Arrays;
import java.util.Collections;

public class ReverseInt {
	public int reverseInt(int n){
		
    String[] arr = (Integer.toString(n)).split("");
    
    Arrays.sort(arr, Collections.reverseOrder());
    
	return  Integer.parseInt(String.join("", arr));
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}