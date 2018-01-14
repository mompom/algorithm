package programmers;

class StringExercise{
    String getMiddle(String word){
      int len = word.length();
      int idx = len/2;
      
      return (len % 2 == 0) ? word.substring(idx-1, idx+1) : 
      String.valueOf(word.charAt(idx));
    }

    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}