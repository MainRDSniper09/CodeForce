import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        //Odd and even numbers, given in a mathematical problem, generated with the code force page.
                Scanner sc = new Scanner(System.in);
                int w = sc.nextInt();
                //we make a condition which tells us if the remainder in this case expressed with the sign "%" tells us "if the given number is divisible by 2 and its remainder is 0, it means that it is even otherwise it is not".
                if (w % 2 == 0 && w != 2) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            }
        }


