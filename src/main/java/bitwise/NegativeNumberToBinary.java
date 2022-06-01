package bitwise;

import java.util.Scanner;

public class NegativeNumberToBinary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = scan.nextInt();

        int bitwiseNumber = 0;
        int i = 0;
        int j = 0;
        int complementBitwiseNumber = 0;
        if (n < 0) {
            n = n * -1;
//BITWISE
            while (n > 0) {
                bitwiseNumber = ((n % 2) * (int) Math.pow(10, i++)) + bitwiseNumber;
                n = n / 2;
            }
            System.out.println(bitwiseNumber);
            //COMPLEMENT OF BITWISE (1'S COMPLEMENT)
            while (bitwiseNumber != 0) {
                if ((bitwiseNumber % 10) == 1) {
                    complementBitwiseNumber = (0 * (int) Math.pow(10, j++)) + complementBitwiseNumber;
                } else {
                    complementBitwiseNumber = (1 * (int) Math.pow(10, j++)) + complementBitwiseNumber;
                }
                bitwiseNumber = bitwiseNumber / 10;
            }

            System.out.println(complementBitwiseNumber);

            int k = 0;
            int twosComplementNumber = 0;
            int copy = complementBitwiseNumber;
            //ADDING A BIT (2'S COMPLEMENT)
            while (copy % 10 == 1 && copy != 0) {
                twosComplementNumber = (0 * (int) Math.pow(10, k)) + twosComplementNumber;
                k++;
                copy = copy / 10;
            }
            twosComplementNumber = (1 * (int) Math.pow(10, k)) + twosComplementNumber;
            System.out.println(twosComplementNumber);


        } else {

            System.out.println("Number if not negative");

        }


    }
}
