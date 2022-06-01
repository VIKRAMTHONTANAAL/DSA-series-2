package condition;

import java.util.Scanner;

public class FahrenheitToCelsius {


    public static void main(String[] args) {

        System.out.println("Enter the Fahrenheit");
        Scanner scan = new Scanner(System.in);
        float fahernheit = scan.nextFloat();

        float celsius = ((fahernheit - 32) * 5) / 9;
        System.out.println(celsius);
    }


}
