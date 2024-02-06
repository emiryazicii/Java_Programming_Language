package lesson15_GarbageCollection;

public class Test {

    int z;  // instance variable z ---> stored in the heap memory.

    public static void add(int a, int b){// local variables a and b -----> stored in the stack memory.

        System.out.println(a+b); // as an integer result of ( a+b ) not stored in stack or heap memory.
    }
    public static void main(String [] args){ // main is a method and ------> stored in the stack memory.

        add(5,3);  // method add , when it's called -----> stored in the stack memory.

        Test obj = new Test(); // obj is a reference variable and reference to a new object created in the heap memory.

        obj.z = 10;    //  obj itself -----> stored in the stack memory.
    }
}
