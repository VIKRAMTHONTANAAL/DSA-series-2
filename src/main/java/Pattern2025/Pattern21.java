package Pattern2025;

public class Pattern21 {

    public static void main(String[] args) {
        int i=1,n=6;

        while (i<=n){

            int j=1;

            while(j<=n+1-i){

                System.out.print(j);

            j++;
            }

            int k=i-1;


            while(k>0){
                System.out.print("*");

                k--;
            }


            int l=1;

            while(l<i){
                System.out.print("*");
                l++;
            }

            int m=n+1-i;

            while(m>0){
                System.out.print(m);
                m--;
            }



            System.out.println();
            i++;
        }
    }
}
