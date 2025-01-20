package Pattern2025;

public class Pattern4 {

    public static void main(String[] args) {
        int i=1,n=5;

        while (i<=n){
            int j=1;
            while (j<=n){
                System.out.print(n-j+1);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
