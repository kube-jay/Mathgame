import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static ArrayList<Integer> History = new ArrayList<>();

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
                PlayGame(Operation.Addition);
                System.out.println("Game Over! 1.continue 2.end   3. History ");
                int respond = cin.nextInt();
                if (respond == 2) quit = false;
                else if (respond == 3) {
                    System.out.println("History of Game Played: " + History);
                }
            }
                else if (option == 2) {


                    System.out.println("Do some Subtraction : ");
                    PlayGame(Operation.Subtraction);
                    System.out.println("Game Over! 1.continue 2.end   3. History ");
                    int respond = cin.nextInt();
                    if (respond == 2) quit = false;
                    else if (respond == 3) {
                        System.out.println("History of Game Played: " + History);
                    }
                }
                else if (option == 3) {
                    System.out.println("Do some Multiplication : ");
                    PlayGame(Operation.Multiplication);
                    System.out.println("Game Over! 1.continue 2.end   3. History ");
                   int respond = cin.nextInt();
                    if (respond == 2) quit = false;
                    else if (respond == 3) {
                        System.out.println("History of Game Played: " + History);
                    }
                }
                else if (option == 4) {
                    System.out.println("Do some Division : ");
                    PlayGame(Operation.Division);
                    System.out.println("Game Over! 1.continue 2.end   3. History ");
                    int respond = cin.nextInt();
                    if (respond == 2) quit = false;
                    else if (respond == 3) {
                        System.out.println("History of Game Played: " + History);
                    }
                }

    /*else if (option == 2) {
                System.out.println("Do some Subtraction : ");
                Subtraction();
                System.out.println("Game Over!");
                System.out.println("Game Over! 1.continue 2.end  3. History ");
                int respond = cin.nextInt();
                if (respond == 2) quit = false;

            } else if (option == 3) {
                System.out.println("Do some Multiplication : ");
                Multiplication();
                System.out.println("Game Over!");
                System.out.println("Game Over! 1.continue 2.end  3. History");
                int respond = cin.nextInt();
                if (respond == 2) quit = false;

            } else if (option == 4) {
                System.out.println("Do some Division : ");
                Division();
                System.out.println("Game Over!");
                System.out.println("Game Over! 1.continue 2.end  3. History ");
                int respond = cin.nextInt();
                if (respond == 2) quit = false;

            }*/

        } while (quit);
    }

    static Tuple getRandomNumbers(Operation operation) {
        Random rand = new Random();
        Tuple randomNumbers = new Tuple();

        int num1 = rand.nextInt(1, 20);
        int num2 = rand.nextInt(1, 20);

        if (operation == Operation.Division) {
            num1 = num1 * num2;
        }

        randomNumbers.setNum1(num1);
        randomNumbers.setNum2(num2);

        return randomNumbers;
    }


    static void PlayGame(Operation operation) {
        Scanner cin = new Scanner(System.in);
        Random rand = new Random();

        int a, b;
        int points = 0;
        for (int i = 0; i < 5; i++) {
            Tuple randomNumbers = getRandomNumbers(operation);
            a = randomNumbers.getNum1();
            b = randomNumbers.getNum2();

            System.out.println(generateQuestion(operation, a, b));
            int you = cin.nextInt();
            int actualResult = getProperResult(operation, a, b);

            if (you != actualResult) {
                break;
            }
            points += 10;
            System.out.println("score : " + points);

        }
        History.add(points);
    }

    static Integer getProperResult(Operation operation, int num1, int num2) {
        switch (operation) {
            case Addition:
                return num1 + num2;
            case Subtraction:
                return num1 - num2;
            case Multiplication:
                return num1 * num2;
            case Division:
                return num1 / num2;
            default:
                return 0;
        }
    }

    static String generateQuestion(Operation operation, int num1, int num2) {
        switch (operation) {
            case Addition:
                return num1 + " + " + num2 + " = ";
            case Subtraction:
                return num1 + " - " + num2 + " = ";
            case Multiplication:
                return num1 + " * " + num2 + " = ";
            case Division:
                return num1 + " / " + num2 + " = ";
            default:
                return "cant happen";
        }
    }
}











