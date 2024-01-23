package lesson10_customMethods;

public class OverloadingTheMainMethod {

    public static void main(String[] args) {

        System.out.println("A");
        main(25);
        main(0.5);
        main(false);


    }

    public static void main(int  args){

        System.out.println(6);


    }
    public static void main(double args){


        System.out.println(3.5);


    }
    public static void main(boolean  args){


        System.out.println(false);

    }
}
