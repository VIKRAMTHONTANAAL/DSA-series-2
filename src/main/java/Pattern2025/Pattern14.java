package Pattern2025;

public class Pattern14 {

    public static void main(String[] args) {
        int i=1,n=5;
        while(i<=n){
            int j=1;
            while (j<=n){
                if(j>=n+1-i){
            System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                j++;
            }

            System.out.println();
            i++;

        }
    }
}
