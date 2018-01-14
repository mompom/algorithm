package programmers;

import java.util.Arrays;

public class GetMinMaxString {
    public String getMinMaxString(String str) {
      String[] arr 	= str.split(" ");
      int[] arrInt 	= new int[arr.length];
      String result = "";
      int len 	= arrInt.length,
    	  i 	= 0;
 			
      for (i = 0; i < len; i++) {
        arrInt[i] = Integer.parseInt(arr[i]);
      }
      
      Arrays.sort(arrInt);
      result = arrInt[0] + " " + arrInt[len - 1];
      
        return result;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}