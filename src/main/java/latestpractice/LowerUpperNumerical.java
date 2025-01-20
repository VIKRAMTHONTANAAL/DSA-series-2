package latestpractice;


import java.util.Scanner;

public class LowerUpperNumerical {

    public static void main(String[] args) {
        char ch;
        Scanner scan=new Scanner(System.in);
        ch=scan.next().charAt(0);
            
        
        if(ch >= 'a' && ch <= 'z' ){
            System.out.println("Smaller case");
        } else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Bigger case");
        } else if (ch >= '0' && ch <= '9') {
           System.out.println("numericals");
        }


    }
}
