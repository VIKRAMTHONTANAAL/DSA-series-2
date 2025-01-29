package Practice2025;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int sum=0;
        int number=371, n=number;
        boolean isArmstrong=false;


        for(int i=0; i <10;i++) {

          while (n!=0){
              int digit=n%10;
              sum=(int)(sum + Math.pow(digit, i));
              n=n/10;
          }

          if(sum==number){
              isArmstrong=true;
              break;
          }else{
              sum=0;
              n=number;
          }

        }

        if(isArmstrong){
            System.out.println("its armstrong");
        }else{
            System.out.println("its vladimir putin");
        }

    }
}

