package Practice2025;

public class CountVowels {

    public static void main(String[] args) {

        String s= "PARTICIPATE";
        s=s.toLowerCase();
        int count =0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e' ||ch=='i' || ch=='o'|| ch=='u'){
                count++;
            }
        }
        System.out.println("The vowel count is "+ count);
    }
}
