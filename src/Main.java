/*
 * This is TE21Cs hangman
 *
 * @AUTHOR LivNTI
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // choose a word
        String word = "teknik";

        // Declaring variables for later use
        boolean wordCompleted;
        String guess;

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
            do {
                //get user input
                System.out.print("Guess a letter: ");
                guess = myScan.nextLine();
            } while (!guess.matches("[a-öA-Ö]+")
                    || guess.length() != 1);

            wordCompleted = true;

            //check if guess is in the word
            boolean isInWord = false;
            for (int i = 0; i < letters.length; i++) {
                // if guess is correct print the letter
                if (guess.equalsIgnoreCase(letters[i])) {
                    guessedWord[i] = guess.toUpperCase();
                    isInWord = true;
                }
                if (guessedWord[i].equals("_")) {
                    wordCompleted = false;
                }
            }
            // reduces lives if letter is not in word
            if (!isInWord) {
                lives--;
            }
            printList(guessedWord);
            System.out.println(" you now have " + lives + " lives left");
        } while ((lives > 0) && (wordCompleted == false));
    }

    // prints a list
    public static void printList(String[] myList) {
        // Check the contents of a list
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i]);
        }
        System.out.println(); //prints a linebreak
    }
}








