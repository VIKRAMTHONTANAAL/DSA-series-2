package Practice;

public class SwapMethods {

    public static void main(String[] args) {

        int a=10, b=20;
        swapOne( a,  b);
        swapTwo( a,  b);
        swapThree( a,  b);
        swapBitwiseXor(a,b);
        swapFive(a,b);

    }

    public static void swapOne(int a,int b){
        a=a+b;
        b=a-b;
                a=a-b;
        System.out.println("A value is "+a);
        System.out.println("B value is "+b);
    }

    public static void swapTwo(int a,int b){
       int temp=a;
       a=b;
       b=temp;
        System.out.println("A value is "+a);
        System.out.println("B value is "+b);

    }

    public static void swapThree(int a,int b){
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("A value is "+a);
        System.out.println("B value is "+b);

    }
    public static void swapBitwiseXor(int a,int b){

        //
        a=a^b;//a=ab
        b=a^b;//b=ab^b=a
        a=a^b;//ab^a=b
        System.out.println("A value is "+a);
        System.out.println("B value is "+b);

    }

    public static void swapFive(int a,int b){

        //
        b=a+b-(a=b);
        System.out.println("A value is "+a);
        System.out.println("B value is "+b);

    }
}
