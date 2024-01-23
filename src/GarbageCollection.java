import lesson14_customClass.Dog;

public class GarbageCollection {

    public static void main(String[] args) {

        String s1 = "Java";
        s1 = null; // "Java" will be eligible for garbage collection

        System.out.println(s1);

        // System.out.println(s1.toUpperCase());

        System.out.println("--------------------------------------------------");

        String str1 = "Python";
        str1 = "CYDEO";

        System.out.println(str1);

        System.out.println("----------------------------------------------------");

        Dog dog1 = new Dog();
        dog1.setInfo("Loki", "Chow chow", 'M', 3, "Medium", "Black");

        Dog dog2 = new Dog();
        dog2.setInfo("Chuck","Bulldog",'M',5,"Small","White");

        dog1 = dog2;

        System.out.println(dog1);
        System.out.println(dog2);
    }
}
