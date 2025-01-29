package Practice2025;

import java.util.Stack;

class BalancedParanteses{

    public static void main(String[] args) {

        String balanced= "(((()))";

        Stack <Character> stack= new Stack<>();

        char brackets[]=balanced.toCharArray();

        for(int i=0; i< brackets.length;i++){

            if(brackets[i]=='{' || brackets[i]=='[' || brackets[i]=='(' ){

                stack.push(brackets[i]);
            }else if(brackets[i]=='}' || brackets[i]==']' || brackets[i]==')' ){
                stack.pop();
            }




        }

        if(stack.isEmpty()){
            System.out.println("paranteses are balanced");
        }else{
            System.out.println("paranteses are not balanced");
        }

    }





}