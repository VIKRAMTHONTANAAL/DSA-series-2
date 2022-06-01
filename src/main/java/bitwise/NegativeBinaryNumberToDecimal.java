package bitwise;

import java.util.Scanner;

public class NegativeBinaryNumberToDecimal {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the negative binary number");
      String binary=scan.next();
        String complementBinaryString="";
        int complementBinary=0;

      for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='0'){
                complementBinaryString=complementBinaryString+"1";
            }else{
                complementBinaryString=complementBinaryString+"0";
            }
        }
        System.out.println(complementBinaryString);
      //2 s complement
        complementBinary=Integer.parseInt(complementBinaryString);
        System.out.println(complementBinary);
        int copyComplementBinary=complementBinary;
        int twosComplementaryBinary=0;
        int k=0;

        //psuedo
        //keep on navigating till you find 0 and make
        //Add 1 in the place
        while((complementBinary%10)!=0){
            k++;
complementBinary=complementBinary/10;
        }
twosComplementaryBinary= ((int)Math.pow(10,k))+ ((copyComplementBinary/(int)Math.pow(10,++k))*(int)Math.pow(10,k));

        System.out.println(twosComplementaryBinary);


        int negativeNumber=0;
        int j=0;
        while(twosComplementaryBinary!=0){
            if(twosComplementaryBinary%10==1){
                negativeNumber=negativeNumber+(int)Math.pow(2,j);
            }
            j++;
            twosComplementaryBinary=twosComplementaryBinary/10;
        }

        System.out.println(-1*negativeNumber);
    }

}
