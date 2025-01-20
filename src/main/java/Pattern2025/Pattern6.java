package Pattern2025;

public class Pattern6 {
    public static void main(String[] args) {
        int i=1,n=5;
        while (i<=n){
            int j=1;
            while (j<=i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
