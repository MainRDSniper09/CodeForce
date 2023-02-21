import java.util.Scanner;

public class Asum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();//We create a scanner so that the user can type in an integer.
        for (int i = 0; i < n; i++){//create a for so that the previously typed integer is the limit and is repeated that number of times
            int a,b,c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();//the exercise asks us to type 3 integers, so we create another scanner inside the for so that we can type the number of times typed by the user.
            if (a + b == c || a + c == b || b + a == c || b + c == a || c + b == a || c + a == b ){//we make a condition that tells us that if the sum of two numbers is equal to one of the 3 numbers entered by the user, example "2 3 5 = 2+3 = 5".
                System.out.println("YES");//if the condition is met, a "YES" is printed.
            }else {
                System.out.println("NO");//Otherwise a "NO" will be printed.
            }
        }
    }
}
