import java.util.Scanner;

public class AWayToLongWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//we first use a scanner so that the user can type in how many words he/she wants to enter and which words he/she wants to enter.
        int n = scanner.nextInt();//we create an integer which will allow us to see how many words the user wants to type in.
        scanner.nextLine();//now we create a scanner to type the number of times you want to write a word

        for (int i = 0; i < n; i++) {//we instantiate a for to repeat the procedure of reading the words typed by the user and how many words he/she wants to type
            String word = scanner.nextLine();//when entering the repetitive cycle it will ask the user to enter the number of words the user wanted to enter "4" the user wants to enter 4 words.
            if (word.length() > 10) {//we create a condition which is that if the word is longer than 10 characters do the following
                System.out.println(word.charAt(0) + "" + (word.length() - 2) + "" + word.charAt(word.length() - 1));
                //we make it take the initial of the word set with our tool "charAt(0)" then we make it read the whole string of characters and subtract two characters "word.length() - 2" and finally we take the last letter of the word set and print it "word.charAt(word.length() - 1))" so that it looks like this "localizacion = l10n" and we print it
            } else {
                System.out.println(word);//but if the word is less than 10 characters then print the same word the user entered "hola = hola".
            }

        }
    }
}







