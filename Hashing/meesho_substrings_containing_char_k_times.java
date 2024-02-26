 // Given a string which consists of characters from “0” to “9”; find the number of substrings which contain character “5” ->  “k” number of times.
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      String s = "00858005";
      int k = 2;
      int count = 0;
      int sum = 0;
      Map<Integer,Integer> map = new HashMap<>(); // map of freq and freq of freq
      map.put(0,1);
      
      for (int j=0; j<s.length(); j++){
          if (s.charAt(j) == '5'){
              count += 1; // keep count of occurences of 5 
          }
          
          int reqfreq = count - k;
          
          sum += map.getOrDefault(reqfreq,0); // add freq of freq 
          
          map.put(count, map.getOrDefault(count,0)+1);
      }
      System.out.println("Number of substrings containing 5 :  " + k+" : (k)  no of times "+sum);
    }
}
