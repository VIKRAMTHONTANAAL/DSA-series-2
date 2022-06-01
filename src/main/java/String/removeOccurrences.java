package String;

class removeOccurrences {
    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc","abc"));
    }
    public static String removeOccurrences(String s, String part) {
        String compare="";
        int length=s.length();

        for(int i=0;i<=length-part.length();i++){
            if(length>=part.length()){
                compare=s.substring(i,i+part.length());
                if(compare.equals(part)){
                    s= s.substring(0,i)+s.substring(i+part.length(),s.length());
                    i=-1;
                    length=s.length();
                }

            }else{
                break;
            }

        }
        return s;
    }
}