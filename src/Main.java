//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), 15));
        System.out.println(permission(generateRandomAge(), -10));
        System.out.println(permission(generateRandomAge(), 25));
        System.out.println(permission(generateRandomAge(), 5));
        System.out.println(permission(generateRandomAge(), 35));
        System.out.println(permission(79, 10));
    }

    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }


    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

}
