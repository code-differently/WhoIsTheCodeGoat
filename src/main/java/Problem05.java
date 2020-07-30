

public class Problem05 {

  public String validate(String s){

    char[] chars = s.toCharArray(); 
    //String answer = "";

    int i = chars.length-1;

    while(i > 0){ 
      if(chars[i-1] >= chars[i]){
        i -- ;
      } else {
        int pointer = i; 

        while(pointer < chars.length && chars[pointer] > chars[i-1]){
          pointer++;
        }

        char temp = chars[i-1];
        chars[i-1] = chars[pointer- 1]; 
        chars[pointer -1] = temp;

        //store the characters of the new string
        char[] cache = new char[chars.length]; 
        for(int j = 0; j < i; j++){
          cache[j] = chars[j];
        }
        int last = chars.length-1;  //the end position
        for(int j =i; j < chars.length; j++){
          cache[j] = chars[last--];
        }
        return new String(cache);
        //answer += cache.toString();
        //return answer; 
      }
    }
    return "no answer";
  }

  public String[] biggerIsGreater(String[] s){
    //check through each string and put in array
    String[] answer = new String[s.length];

    for(int i = 0; i < s.length; i++){
      answer[i] = validate(s[i]);
    }

    return answer;
  }



}
