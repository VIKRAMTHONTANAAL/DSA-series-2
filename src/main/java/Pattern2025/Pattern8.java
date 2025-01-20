package Pattern2025;

public class Pattern8 {
    public static void main(String[] args) {
        int i =1, n=5;
        while (i<=n){
            int j=1;
            while (j<=i){
                System.out.print(i+1-j);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
