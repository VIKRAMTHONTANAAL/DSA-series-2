package Practice;

public class ReverseANumber {

    public static void main(String[] args) {
        int a = 123456789;
        reverseANumber(a);
        reverseANumberTwo(a);
        reverseANumberThree(a);
    }

    public static void reverseANumber(int a) {

        int temp = 0;
        if (a == 0) System.out.println(temp);

        while (a != 0) {
            int dig = a % 10;
            temp = temp * 10 + dig;
            a = a / 10;

        }
        System.out.println(temp);
    }

    public static void reverseANumberTwo(int a) {

        StringBuffer rev;
        StringBuffer num = new StringBuffer(String.valueOf(a));
        rev = num.reverse();
        System.out.println(rev);


    }

    public static void reverseANumberThree(int a) {


        StringBuilder num = new StringBuilder();

        num.append(a);
        System.out.println(num.reverse());

    }

}
