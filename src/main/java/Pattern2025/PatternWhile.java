package Pattern2025;

public class PatternWhile {

    public static void main(String[] args) {
        int i=0,j=0,n=5;

        while (i<n){

            while (j<n){
                System.out.print("*");
                j++;
            }
            System.out.println();

        i++;
        j=0;

        }


    }
}
