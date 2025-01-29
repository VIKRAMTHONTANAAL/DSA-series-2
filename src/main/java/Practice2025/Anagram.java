package Practice2025;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1= "lITs NE";
        String s2= "silent";

        if(isAnagram(s1,s2)){
            System.out.println("its an anagram");
        }else {
            System.out.println("Its not an anagram");
        }
    }

    public static boolean isAnagram(String s1, String s2){
        s1= s1.replace(" ", "");
        s2= s2.replace(" ", "");
        s1= s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length()!=s2.length()){
            return false;
        }

        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);

    }
}
