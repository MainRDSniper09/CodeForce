import java.util.Scanner;

public class YesOrYes {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();////We create a scanner so that the user can type in an integer.
        sc.nextLine();//we use "sc.nextLine();" to return to a character string since we cannot put an integer at first and then want to type a character.
        String p;//We create a string since the user is going to type a number of strings to be analyzed.
        for (int i = 0; i < x; i ++){//We create a for that takes the limit typed by the user
            p = sc.nextLine();//we take the previously declared string and add a scanner to it so that it can contain the number of strings desired by the user
            if (p.equalsIgnoreCase("yes") == true ){ //we create a condition with a tool called "equalsIgnoreCase("yes")" where what we do here is to say, if it is equal to the word "yes" no matter if it is in uppercase, lowercase, but it has to say yes, it returns a boolean, if it returns a true then
                System.out.println("YES");//to print us a returned yes
            }else {
                System.out.println("NO");//otherwise it will return a no
            }
        }
    }
}
