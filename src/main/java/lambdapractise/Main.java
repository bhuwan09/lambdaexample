package lambdapractise;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Text from main class");

//        MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
//         or we can keep the object into the parent class(interface) varible, i.e
//        MyInterface myInterface = new MyInterfaceImpl();    //eg.1
//        myInterface.sayHello();



//  --------------------------------------  Use of anonymous functions  ------------------------------------------------------
//        MyInterface i = new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("Hello from first anonymous class");
//            }
//        };
//        i.sayHello();
//
//        MyInterface i2 = new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("Hello from second anonymous class");
//            }
//        };
//
//        i2.sayHello();



   // ---------------------------------------------- Use of lambda Expression ------------------------------------------------------------
//        MyInterface i= ()->System.out.println("hello from first lambda implementation");
//        i.sayHello();
//
//        SumInter sumInter = (int a, int b) -> {
//            return a+b;};
//        System.out.println(sumInter.sum(2,2));
//        System.out.println(sumInter.sum(1,2));

        // ----------- This can  be written as  ------------------

    MyInterface i= ()->System.out.println("hello from first lambda implementation");
        i.sayHello();

        SumInter sumInter = ( a, b) -> a+b;;        //omiting curly brackets, return type and data type
        System.out.println(sumInter.sum(2,2));
        System.out.println(sumInter.sum(1,2));


    }


}
