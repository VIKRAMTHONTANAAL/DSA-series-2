package operators;

public class PrePostIncrementDecrement {

    public static void main(String[] args) {
        int i=7;
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i--);
        System.out.println(--i);

        int a=1;
        int b=a++;
        int c=++a;
        System.out.println(b);
        System.out.println(c);
    }
}
