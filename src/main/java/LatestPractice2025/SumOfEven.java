package LatestPractice2025;

public class SumOfEven {
    public static void main(String[] args) {
        int sum=0,n=10,i=2;

        while(i<=n){
            if(i%2==0){
                sum=sum+i;
            }
            i++;
        }

        System.out.println(sum);
    }
}
