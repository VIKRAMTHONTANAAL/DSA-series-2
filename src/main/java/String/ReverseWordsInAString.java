package String;

public class ReverseWordsInAString {

    public static String reversedString(String s){
        String reverse="";

        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        return reverse;
    }

    public static void main(removeOccurrences[] args) {
       // String s="My name is this";
        String s="a";
        int i=0;
        String reverse="";
        String please="";

        while(i<s.length()){


          if(s.charAt(i)!=' '){
              please=please+s.charAt(i);
          }else{
              reverse=reverse+reversedString(please);
              reverse=reverse+" ";
              please="";
          }

            i++;
        }
        reverse=reverse+reversedString(please);
        System.out.println(reverse);
    }


}
