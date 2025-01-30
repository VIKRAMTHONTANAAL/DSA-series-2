package Practice2025;

public class FirstNonRepeatingCharacter {


    public static void main(String[] args) {
        String s =  "geeksforgeeks";

        boolean found = false;
        int nonRepeat=0;
        for(int i=0;i<s.length()-1;i++){
            found=false;
            for (int j=0; j<s.length();j++){

                if(i!=j && s.charAt(i)==s.charAt(j)){
                    found=true;
                    break;
                }
            }
            if(found==false){
                System.out.println("First non repeating character is "+s.charAt(i));
                nonRepeat++;
                break;
            }
        }
        if(nonRepeat==0){
        System.out.println("$");
        }
    }
}
