package Pattern2025;

public class Pattern9 {
    public static void main(String[] args) {
        int i =1, n=5;

        while (i<=n){
            int j=1;
            char c=(char)('A' +i -1);
            while (j<=n){
                System.out.print(c);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
