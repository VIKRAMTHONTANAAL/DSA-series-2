package latestpractice2025;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        int n=100,i=0;
        double celsius;
        while (i<=n){
            celsius= (i-32)*(5.0/9.0);
          System.out.println(celsius);
          i++;
        }
    }
}
