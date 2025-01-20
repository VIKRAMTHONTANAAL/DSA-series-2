package Pattern2025;

public class Pattern13 {

    public static void main(String[] args) {
        int i=1,n=6,count=0;
        while (i<=n){
            int j=1;
            while (j<=i){
                char c=(char)('A'+n-i+j-1);
                System.out.print(c);
                j++;
                count++;
            }
            System.out.println();
            i++;
        }
    }
}
