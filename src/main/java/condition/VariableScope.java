package condition;

public class VariableScope {

    public static void main(String[] args) {
        int a=3;
        System.out.println(a);

        if(true){
             a=5;
            System.out.println(a);
        }
        int i=5;
        for( i=1;i<=5;i++){
            System.out.println("HI");
        }
    }
}
