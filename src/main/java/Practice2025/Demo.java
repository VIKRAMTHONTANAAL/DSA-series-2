package Practice2025;


public class Demo {
    public static void main(String[] args) {
        Child c1= new Child();

    }
}
 class Child extends Parent{
    {
        System.out.println("Non static block Child");
    }
    Child(){
        System.out.println("Inside child constructor");
    }
}

class Parent{
    {
        System.out.println("Non static block Parent");
    }
    Parent(){
        System.out.println("Inside parent constructor");
    }
}
