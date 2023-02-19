import java.util.Scanner;

public class ATeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//first we create an integer together with a scanner, so that the user can type in the number of exercises he wants to solve and they are saved in the integer variable
        int acum = 0;//we create an accumulator since it will be useful later on when we are going to use it
        for (int i = 0; i < n; i++){//we create a for to repeat the number of exercises that the user entered
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();//we create 3 integer variables which allow the user to enter how many exercises he/she can solve and repeat the number of times the user entered at the beginning.
            int sum = a+b+c;//as the exercise tells us that if they put 1 it means that they can solve the exercise and 0 to say that they can not solve the exercise, then we make a sum example "the user wanted to do 3 exercises, now the next thing is to type which of those exercises can do, 101 = 1, this means that they have done an exercise" for this we create the sum
            if (sum >= 2){
                acum++;//now we create a condition, which tells us that if the sum gives us more than 2, the accumulator will add 1, since we are counting how many exercises the user can develop.
            }
            System.out.println(acum);//and finally we print the accumulator, since we want to know how many exercises the user can solve.
        }

        }
    }

