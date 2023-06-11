package Java_JRE_JDK;
public class EjemploCondicionales {

    public static void main(String[] args) {
        int age = 17;
        int people =2;

        String minAge = (age >= 18) ? "You are an adult" : "You are not an adult";
        System.out.println(minAge);
        if (age>=18) {
            System.out.println("You are an adult");
        }else {
            String friendConditional = (people >= 2)? "You're not and adult "+"but you can access":"You're not and adult"+"and you can't access";
            System.out.println(friendConditional);
        }
        System.out.println("Welcome");
    }


}
