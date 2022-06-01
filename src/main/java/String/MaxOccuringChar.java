package String;
// { Driver Code Starts
import java.lang.*;


class MaxOccuringChar
{

    public static void main(removeOccurrences[] args) {
        System.out.println(getMaxOccuringChar("v"));
    }
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        StringBuilder str=new StringBuilder("Coding Ninjas Is A Coding Platform");
        str.replace(1,1,"@40");
        str.length();
        System.out.println(str);
        line.replace(" ","@40");
        // Your code here
        int maxCount=1;
        char maxChar=line.charAt(0);
        int count=1;

        for(int i=0;i<line.length();i++){

            for(int j=i+1;j<line.length();j++){
                if(line.charAt(i)==line.charAt(j)){
                    count++;
                }
            }
            if(count>maxCount){

                maxChar=line.charAt(i);

                maxCount=count;

            }
            else if(count==maxCount){
                if(line.charAt(i)<maxChar){
                    maxChar=line.charAt(i);
                }

            }
            count=1;
        }




        return maxChar;



    }

}