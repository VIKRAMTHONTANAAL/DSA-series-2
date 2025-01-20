package Pattern2025;

public class Pattern10 {
    public static void main(String[] args) {
        int i =1, n=8;

        while (i<=n){
            int j=1;
            while (j<=n){
                char c=(char)('A' +j -1);
                System.out.print(c);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
