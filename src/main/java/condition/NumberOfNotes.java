package condition;



import java.util.Scanner;

public class NumberOfNotes {

    public static void main(String[] args) {
        System.out.println("Enter the amount");
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
int remainder=0;
int divisible=0;
        for(int i=1;i<=4;i++){


            switch (i){

                case 1:{
                   remainder= number%100;
                   divisible=(number-remainder)/100;
number=number-(100*divisible);
                    System.out.println("100s - "+divisible+ "  Remainder "+remainder);
                    remainder=0;
                      break;
                }
                case 2:{
                    remainder= number%50;
                    divisible=(number-remainder)/50;
                    number=number-(50*divisible);
                    System.out.println("50s - "+divisible+ "  Remainder "+remainder);
                    remainder=0;
                    break;
                }

                case 3:{
                    remainder= number%20;
                    divisible=(number-remainder)/20;
                    number=number-(20*divisible);
                    System.out.println("20s - "+divisible+ "  Remainder "+remainder);
                    remainder=0;
                    break;
                }
                case 4:{
                    remainder= number%1;
                    divisible=(number-remainder)/1;
                    number=number-(1*divisible);
                    System.out.println("1s - "+divisible+ "  Remainder "+remainder);
                    remainder=0;
                    break;
                }







            }


        }



    }
}
