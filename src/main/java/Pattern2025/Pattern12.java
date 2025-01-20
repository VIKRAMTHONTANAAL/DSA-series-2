package Pattern2025;

public class Pattern12 {

    public static void main(String[] args) {
        int i=1,n=5;
        while (i<=n){
            int j=1;
            while (j<=n){
                char c=(char)('A'+i-1+j-1);
                System.out.print(c);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
