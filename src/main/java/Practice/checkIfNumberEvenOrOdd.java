package main.java.Practice;

public class checkIfNumberEvenOrOdd {
    public static void main(String[] args) {
        int n=145678;
        int odd=0;
        int even=0;

       while(n!=0) {
           int dig = n % 10;
           if(dig%2==0){
             even++;
           }else {
              odd++;
           }
           n=n/10;
       }

        System.out.println(even+" number of even elements");
        System.out.println(odd+" number of odd elements");


    }
}
