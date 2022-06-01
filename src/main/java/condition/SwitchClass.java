package condition;

public class SwitchClass {


    public static void main(String[] args) {

//int n=2;
        int num=1;
char n='2';
switch (n){
    case 2:
        System.out.println("First");
        //break;
        //continue;
    case '2': switch (num){
        case 1:
            System.out.println("Inside 2 and 1");
            //break;
        case 3:
            System.out.println("Inside 2 and 3");

    }

        System.out.println("Second");


     default:
        System.out.println("Default");


}


    }
}
