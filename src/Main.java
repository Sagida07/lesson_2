import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 99;

        for (int i = 0; i < 1; i++) {
            System.out.println(generateRandomAge(n));
            System.out.println(myNumbers(generateRandomAge(n), 16));
            System.out.println(myNumbers(40, 33));
            System.out.println(myNumbers(51, -4));
            System.out.println(myNumbers(68, -12));
            System.out.println(myNumbers(18, 21));
            System.out.println(myNumbers(37, -25));
        }
    }

    public static String myNumbers(int age, int temperature) {
        if ((age > 20 && age < 40) && (temperature > -20 && temperature < 30))
            return "Можно идти гулять";
        else if (age < 20 && (temperature > 0 && temperature < 28))
            return "Можно идти гулять";
        else if (age > 45 && (temperature > -10 && temperature < 25))
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }
    public static int generateRandomAge(int n)
    {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }
        return new Random().nextInt(n + 1);
    }
}