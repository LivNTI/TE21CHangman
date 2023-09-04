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

        // Declaring variables for later use
        boolean wordCompleted;

        //separate the string into a list of the letters
        String[] letters = word.split("");
        printList(letters);

        // and creat a list for the guessed word
        String[] guessedWord = new String[letters.length];
        int count = 0; // this is a counter
        // fill the guessed word with "_"
        while (count < guessedWord.length) {
            guessedWord[count] = "_";
            count++;
        }
        printList(guessedWord);

        // how many lives (tries) should our user have
        int lives = 3;

        //user input
        Scanner myScan = new Scanner(System.in);

        do {
            //get user input
            System.out.print("Guess a letter: ");
            String guess = myScan.nextLine();

            //System.out.println("user guess is " + guess);

            wordCompleted = true;

            //chekc if guess is in the word
            boolean isInWord = false;
            for (int i = 0; i < letters.length; i++) {
                // if guess is correct print the letter
                if (guess.equals(letters[i])) {
                    //System.out.println("letter exist on index " + i);
                    // guessedWord[i] = letters[i]; //slightly less optimal
                    guessedWord[i] = guess;
                    isInWord = true;
                }
                if (guessedWord[i].equals("_")) {
                    wordCompleted = false;
                }
            }
            if (!isInWord) { // same as isInWord == false
                // if isInWord == true --> !isInWord == false
                // if isInWord == false --> !isInWord == true
                lives--;

            }
            printList(guessedWord);
            System.out.println(" you now have " + lives + " lives left");
            // System.out.println("word COmp is " + wordCompleted);
        } while ((lives > 0) && (wordCompleted == false));

    }


    public static void printList(String[] myList) {
        // Check the contents of a list
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i]);

        }
        System.out.println();//prints a linebreak
    }
}








