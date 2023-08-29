/*
  TODO: what i need to do in my hangman
   * Ha ett ord
     - Statiskt?
     - Random från lista?
   * Dela upp ordet
   * Input
     - Kolla att det bokstav
   * Finns bokstaven i ordet?
   * Var finns bokstaven
   * SKriv ut bokstaven
   * Ta bort ett liv
   * Hur många liv?
   * Fortsätt tills vi är “klara”
     - Hela ordet gissat
     - Inga liv

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // choose a word
        // char aCharacter = 'g'; // this a character
        String word = "teknik";

        //separate the string into a list of the letters
        String[] letters = word.split("");

        //user input
        Scanner myScan = new Scanner(System.in);
        System.out.print("Guess a letter: ");
        String guess = myScan.nextLine();

        //System.out.println("user guess is " + guess);

        //chekc if guess is in the word
        for (int i = 0; i < letters.length; i++) {
            if (guess.equals(letters[i])) {
                System.out.println("letter exist on index " + i);
            }

        }




        /*
        // Check the contents of a list
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);

        }
         */


    }
}








