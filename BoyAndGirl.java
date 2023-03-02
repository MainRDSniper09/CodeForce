import java.util.Scanner;

public class BoyAndGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();//We use the Scanner for the user to type the desired String of size "n" letters.
        boolean[] caracteresVistos = new boolean[128];//we create a boolean matrix why a boolean matrix? first we have to notice that in the ascii code there are 128 characters and the exercise is telling us that the String is counted taking into account the characters that are repeated example "wjmzbmr" the String counting it as it is would be a total of 7 characters, but as we see is repeated in the character "m" therefore we say that the "m" is already repeated once, then the size of the String is reduced and would be a String of 6 characters.
        int contadorCaracteresUnicos = 0;//we create a counter

        for (int i = 0; i < texto.length(); i++) {//we create a for that is the one that is going to go through the String
            int valorAscii = (int) texto.charAt(i);//we assign an integer value and with the charAt function we make it count character by character and convert it to integer, in order to know how many characters are in total
            if (!caracteresVistos[valorAscii]) {
                caracteresVistos[valorAscii] = true;
                contadorCaracteresUnicos++;//then we create a boolean condition that tells us to count the amount of unique characters with a counter, for that in the condition we deny that they are repeated, but if they are repeated the condition becomes True, so the counter would not take into account those that are repeated but those that are not repeated, example "wjmzbmr" would be like false,flase,false,false,false,false,false,true,false, when there is a true in our condition, it does not count 2 times this repeated character.
            }
        }
        if(contadorCaracteresUnicos % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else {
            System.out.println("IGNORE HIM!");
        }//finally we make a condition that tells us that if the number of characters is even, it will not print "CHAT WHIT HER" but if it is odd it will print "IGNORE HIM".


    }
}
