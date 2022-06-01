package String;
class Solution {
    public static void main(String[] args) {
       char chars[] = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {

        int i=0;
        int ansIndex=0;


        while(i<chars.length){
            int j=i+1;
while(j<chars.length && chars[i]==chars[j]){
                j++;
            }
            chars[ansIndex++]=chars[i];

            int count=j-i;

            if(count>1){
                String countString=String.valueOf(count);
                for(int k=0;k<countString.length();k++){
                    chars[ansIndex++]=countString.charAt(k);
                }
            }


            i=j;
        }

        return ansIndex;
    }
}