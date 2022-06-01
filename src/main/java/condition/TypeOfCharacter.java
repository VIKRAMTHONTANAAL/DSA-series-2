package condition;

import java.util.Scanner;

public class TypeOfCharacter {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character");

        char ch = scan.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper case");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Integer");
        }


    }


}
