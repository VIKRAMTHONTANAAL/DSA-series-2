package String;

class removeAdjacentDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String s) {


        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                if(i+2<s.length()){
                    s=s.substring(0,i)+s.substring(i+2,s.length());}
                else{
                    s=s.substring(0,i);
                }
                i=-1;

            }

        }
        return s;

    }
}