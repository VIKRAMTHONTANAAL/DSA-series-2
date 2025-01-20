package Pattern2025;

public class Pattern11 {
    public static void main(String[] args) {
        int i =1, n=5;

        while (i<=n){
            int j=1;
            while (j<=n){
                char c=(char)('A'+j-1 +(n*i) -n);
                System.out.print(c);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
