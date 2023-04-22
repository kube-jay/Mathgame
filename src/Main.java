import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("hello lets play a game: ");
        System.out.println("--------------");
        System.out.println("Select a number for what you want to do");
        System.out.println("1. Addition game " +
                "2. Subtraction game " + "3. Multiplication game " + "4. Division game");
        int option = cin.nextInt();
        if (option == 1 ){
            System.out.println("Do some Addition : ");
                 Addition();
        }


    }


     static void Addition() {
        Random rand = new Random();
        int a, b;
        boolean ans = true;
        int points = 0;
        do {
            a = rand.nextInt(1, 100);
            b = rand.nextInt(1, 100);
            int ans1 = a + b;
            points += 10;
            if (ans1 != you) ans = false;
        } while (ans);

    }

    static void Subtraction() {
        Random rand = new Random();
        int a, b;
        boolean ans = true;
        int points = 0;
        do {
            a = rand.nextInt(1, 100);
            b = rand.nextInt(1, 100);
            int ans1 = a - b;
            points += 10;
            if (ans1 != you) ans = false;

        } while (ans);
    }
    static void  Multiplication(int you) {
        Random rand = new Random();
        int a, b;
        boolean ans = true;
        int points = 0;
        do {
            a = rand.nextInt(1, 100);
            b = rand.nextInt(1, 100);
            int ans1 = a * b;
            points += 10;
            if (ans1 != you) ans = false;

        } while (ans);
    }
    static void Division(int you) {
        Random rand = new Random();
        int a, b;
        boolean ans = true;
        do {
            a = rand.nextInt(1, 100);
            b = rand.nextInt(1, 100);
            int ans1 = a / b;
            if (ans1 != you) ans = false;


        } while (ans);
    }

}

