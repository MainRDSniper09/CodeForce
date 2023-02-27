import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine(); // we create a string for the user to type in the word
        String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1); // now we say that with the function "variable.substring(0,1)" is located in position 0 of the string of characters and position 1 and take that character that is located between that interval and leave the others, now as we are only asking that the first character we put it in uppercase, we do that with the function "toUpperCase()", finally with the function "variable.substring(1)" get all the rest of the letters except the first letter
        System.out.println(capitalizedWord); // imprimir la palabra en mayúscula
    }
}
