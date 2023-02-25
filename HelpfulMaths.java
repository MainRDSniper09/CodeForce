
import java.util.Scanner;
import java.util.Arrays;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //enter the string of numbers with the + and - symbols
        String cadena = scanner.nextLine();

        // Convert string to an array of integers
        int[] numeros = Arrays.stream(cadena.split("[+\\-*/]")).mapToInt(Integer::parseInt).toArray();

        // Sort the array of numbers
        Arrays.sort(numeros);

        // Create a new string from the array of sorted numbers
        String numerosOrdenados = Arrays.toString(numeros).replaceAll("[\\[\\]]", "").replaceAll(", ", "+");

        // Print the new sorted string
        System.out.println(numerosOrdenados);
    }
}