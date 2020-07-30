import java.util.HashSet;
import java.util.Set;

public class Problem03 {

  public int countOfSubstrings(String str, int K){
    int counter = 0; 
    
    for(int i = 0; i < str.length() - K; i++){
      if(areCharactersUnique(str.substring(i, i + K))){
        counter ++;
      }
    }
    return counter;
  }

  public boolean areCharactersUnique(String s){
    for(int i = 0; i < s.length(); i++){
      for(int j = i+1; j < s.length(); j++){
        if(s.charAt(i) == s.charAt(j)){
          return false;
        }
      }
    }
    return true;

  }
}
