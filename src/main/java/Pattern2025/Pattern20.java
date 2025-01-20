package Pattern2025;

public class Pattern20 {

    public static void main(String[] args) {
        int i = 1, n=6;
        while(i<=n){
            int space=1;

            while(space <= n-i){
                System.out.print(" ");
                space++;
            }
            int j=1;
           while (j<=i){
               System.out.print(j);
                j++;
            }

           int k=1;

           while(k<=i-1){
               System.out.print(i-k);

               k++;
           }




            i++;
            System.out.println();

        }
    }
}
