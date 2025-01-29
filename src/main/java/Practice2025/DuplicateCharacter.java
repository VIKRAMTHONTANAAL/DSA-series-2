package Practice2025;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String s="programming";
        Integer count=1;
        Map <Character, Integer> hash= new HashMap<>();

        for(int i=0;i < s.length(); i++){

            if(hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i), hash.get(s.charAt(i))+1);
            }else {
                hash.put(s.charAt(i), count);
            }
        }

        for( char ch: hash.keySet()){
            if(hash.get(ch)>1){
                System.out.println(hash.get(ch) +" "+ ch);
            }

        }
    }
}
