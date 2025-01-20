package Pattern2025;

public class Pattern7 {
    public static void main(String[] args) {
        int i=1, n=5;
        while(i<=n){
            int j=1;
            while (j<=i){
                System.out.print(j+i-1);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
