package Practice2025;

public class VowelConsonantCount {

    public static void main(String[] args) {
        String s="programming";
        s=s.replace(" ","").toLowerCase();
        int vowel=0, consonant=0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowel++;
            }else if(s.charAt(i)>= 'a' && s.charAt(i)<= 'z'){
                consonant++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
    }
}
