package Practice2025;

public class Evenodd {
    public static boolean isEven(int a){
        if((a&1)==1){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {

        int a=8;

        if(isEven(a)){
            System.out.println("NUMBER IS EVEN "+ a);
        }else{
            System.out.println("NUMBER IS ODD "+ a);
        }

    }

}
