import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        boolean quit = true;

        System.out.println("hello lets play a game: ");
        System.out.println("--------------");
        do {


            System.out.println("Select a number for what you want to do");
            System.out.println("1. Addition game " +
                    "2. Subtraction game " + "3. Multiplication game " + "4. Division game");
            int option = cin.nextInt();
            if (option == 1) {
                System.out.println("Do some Addition : ");
                Addition();
                System.out.println("Game Over! 1.continue 2.end ");
                int res = cin.nextInt();
                if (res== 2) quit=false;

            } else if (option == 2) {
                System.out.println("Do some Subtraction : ");
                Subtraction();
                System.out.println("Game Over!");
                System.out.println("Game Over! 1.continue 2.end ");
                int res = cin.nextInt();
                if (res== 2) quit=false;

            } else if (option == 3) {
                System.out.println("Do some Multiplication : ");
                Multiplication();
                System.out.println("Game Over!");
                System.out.println("Game Over! 1.continue 2.end ");
                int res = cin.nextInt();
                if (res== 2) quit=false;

            } else if (option == 4) {
                System.out.println("Do some Division : ");
                Division();
                System.out.println("Game Over!");
                System.out.println("Game Over! 1.continue 2.end ");
                int res = cin.nextInt();
                if (res== 2) quit=false;
            }

        }while (quit);
    }


     static void Addition() {
         Scanner cin = new Scanner(System.in);
        Random rand = new Random();
        int a, b;
        boolean ans = true;
        int points = 0;
        do {
            a = rand.nextInt(1, 100);
            b = rand.nextInt(1, 100);
            System.out.println(a + "+" + b+ "=");
            int you = cin.nextInt();
            if (you != a+b) ans = false;
            System.out.println("score : " + points);
            points += 10;
        } while (ans);

    }

    static void Subtraction() {
        Scanner cin = new Scanner(System.in);
        Random rand = new Random();
        int a, b;
        boolean ans = true;
        int points = 0;
        do {
            a = rand.nextInt(1, 100);
            b = rand.nextInt(1, 100);
            System.out.println(a + "-" + b+ "=");
            int you = cin.nextInt();

            if (you != a-b) ans = false;
            System.out.println("score :" + points);
            points += 10;

        } while (ans);
    }
    static void  Multiplication() {
        Scanner cin = new Scanner(System.in);
        Random rand = new Random();
        int a, b;
        boolean ans = true;
        int points = 0;
        do {
            a = rand.nextInt(1, 100);
            b = rand.nextInt(1, 100);
            System.out.println(a + "*" + b+ "=");
            int you = cin.nextInt();
            if (you != a*b) ans = false;
            System.out.println("score : " + points);
            points += 10;
        } while (ans);
    }
    static void Division() {
        Scanner cin = new Scanner(System.in);
        Random rand = new Random();
        int a, b;
        boolean ans = true;
        int points= 0 ;
        do {
            a = rand.nextInt(1, 100);
            b = rand.nextInt(1, 100);
            System.out.println(a + "/" + b );
            int you  = cin.nextInt();
            if (you != a/b) ans = false;
            System.out.println("score : " + points);
            points += 10;
        } while (ans);
    }

}

