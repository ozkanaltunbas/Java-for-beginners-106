import java.util.Random;
import java.util.Scanner;
import java.math.*;
import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Random pick Number game !");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("define the range of the number of predictions (0-?) : ");
        int Definenum2 = input2.nextInt();
        System.out.println("Okay the number of prediction "+" 0 and "+Definenum2 + " between !");
        Random rand = new Random();
        int number = rand.nextInt(Definenum2);
        System.out.println(number);
        int health =5;
        int health2 = 3;
        while (health>0){
            System.out.println("Enter a number between (0 and "+Definenum2+") : ");
            int GuessNumber = input2.nextInt();
                    if (GuessNumber > number) {
                        System.out.println("This is not true ! choose a smaller number.");
                        health--;
                        System.out.println("You have " + health + " left.");
                    }
                    if (GuessNumber < number) {
                        System.out.println("This is not true ! choose a bigger number :)");
                        health--;
                        System.out.println("You have " + health + " left.");
                    }
                    if (GuessNumber == number) {
                        System.out.println("Well done your choose is true !!");
                        break;
                    }
                    if (health == 1) {
                        System.out.println("Its your last chance be carefull !! ");
                        Scanner input3 = new Scanner(System.in);
                        int last = input3.nextInt();
                        if (last == number) {
                            System.out.println("congratulations !!! ");
                            break;
                        } else {
                            System.out.println("im afraid you cant next time good luck ! ");
                            break;
                    }
            }

        }
    }

}




