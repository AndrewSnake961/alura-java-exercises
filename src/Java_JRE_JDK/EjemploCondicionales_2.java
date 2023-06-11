package Java_JRE_JDK;
public class EjemploCondicionales_2 {
    public static void main(String[] args) {
        int age = 17;
        int peopleQuantity =2;

        boolean isCouple= peopleQuantity > 1;
        boolean accesGranted=age>=18 && peopleQuantity >= 2;
        System.out.println("El valor de la condicion es: " + isCouple);

        String minAge = (age >= 18 ) ? "You are an adult" : "You are not an adult";
        System.out.println(minAge);
        if (accesGranted) {
            System.out.println("You can access ");
        }else { ;
            System.out.println("You can't access ");
        }
        System.out.println("Welcome");
    }


}

