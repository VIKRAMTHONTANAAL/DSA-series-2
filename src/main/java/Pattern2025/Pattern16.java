package Pattern2025;

public class Pattern16 {
    public static void main(String[] args) {
        int i=1,n=6;
        while (i<=n){

            int space=i-1;

            while(space>0){
                System.out.print(" ");
                space--;
            }
            int j =1;
            while (j<=n+1-i){
                System.out.print(i);
                j++;
            }


            i++;
            System.out.println();
        }
    }
}
