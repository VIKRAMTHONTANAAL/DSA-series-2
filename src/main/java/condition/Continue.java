package condition;

public class Continue  {

    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            System.out.println();
            System.out.println();
            continue;
           //Unreachable System.out.println("");
        }
    }
}
