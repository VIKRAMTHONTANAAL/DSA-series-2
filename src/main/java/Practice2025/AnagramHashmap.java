package Practice2025;

import java.util.HashMap;
import java.util.Map;

public class
AnagramHashmap {
    public static void main(String[] args) {
        String s1= "lIST fN ";
        String s2= "sil NET";

        if(isAnagram(s1,s2)){
            System.out.println("its an anagram");
        }else{
            System.out.println("its not an anagram");
        }


    }
    public static boolean isAnagram(String s1, String s2){
        s1=s1.replace(" ", "").toLowerCase();
        s2=s2.replace(" ", "").toLowerCase();
        Integer count =1;
        Map<Character,Integer> hash= new HashMap();

        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(hash.containsKey(ch)){
                hash.put(ch, hash.get(ch)+1);

            }else {
                hash.put(ch, count);

            }
        }

        for(int j=0;j<s2.length();j++){
            char ch=s2.charAt(j);
            if(hash.containsKey(ch)){
                hash.put(ch, (hash.get(ch))-1);
            }
            if(hash.get(ch)==null|| hash.get(ch)==0 ){
                hash.remove(ch);
            }
        }

        return hash.isEmpty();

    }
}
