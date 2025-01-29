package Practice2025;

public class StringPalindrome {

    public static void main(String[] args) {
        String original="This siht";
        String reverse="";
        original=original.replace(" ", "");
        for(int i =0; i< original.length();i++ ){
            reverse=reverse+original.charAt(original.length()-1-i);


        }
        System.out.println(reverse);
        System.out.println( original);
        if(reverse.equalsIgnoreCase(original)){
            System.out.println("StringPalindrome");
        }else{
            System.out.println("Not StringPalindrome");
        }




    }
}
