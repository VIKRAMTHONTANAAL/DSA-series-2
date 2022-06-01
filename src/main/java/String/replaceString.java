package String;
public class replaceString {
    public static void main(String[] args) {
        String s="Coding Ninjas India";
        System.out.println(s=s.replaceAll(" ","@40"));
        StringBuilder string=new StringBuilder("Coding Ninjas India");
        System.out.println(replaceSpaces(string));
    }
    public static StringBuilder replaceSpaces(StringBuilder str) {// Write your code here.
        StringBuilder string=new StringBuilder("");
        String s="";
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)!=' '){
                s=s+str.charAt(i);
            }else{

                string.append(s);
                string.append("@40");

                s="";
            }

        }
        string.append(s);

        return string;
    }
}