package Pattern2025;

public class Pattern14Two {

    public static void main(String[] args) {
        int i=1, n=5;

        while(i<=n){

            int space =n - i;

            while(space>0){
                System.out.print(" ");
                space--;
            }
            int j=1;
            while (j<=i){
                System.out.print("*");
                j++;
            }


            i++;
            System.out.println();
        }
    }
}
