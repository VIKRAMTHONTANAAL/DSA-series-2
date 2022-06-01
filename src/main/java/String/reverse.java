package String;

public class reverse {
    public static void main(removeOccurrences[] args) {
        String s="VIKRAM";
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
            reverse=reverse+s.charAt(i);
        }
        System.out.println();
        System.out.println("REVERSE"+reverse);


    }
}
