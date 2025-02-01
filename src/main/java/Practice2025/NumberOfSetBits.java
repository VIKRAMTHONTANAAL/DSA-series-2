package Practice2025;

public class NumberOfSetBits {

    public static int totalNumberOfSetBits(int a){
        int count=0;

        while (a!=0){
            if((a&1)==1){
                count++;
            }
            a=a>>1;
        }

        return count;
    }
    public static void main(String[] args) {
int a = 5, b=3;
int total= totalNumberOfSetBits(b) + totalNumberOfSetBits(a);

        System.out.println("Total number of set bits "+ total  );

    }
}
