package com.careerdevs;

//import java.security.secureRandom;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       System.out.print("Welcome to Guess the WORD!!! \n");

        mainMenu();
        play();
        System.out.print("Thank you for Playing");
            }
    // start game, end game
        public static void  mainMenu(){
        System.out.println("1) Play game");
        System.out.println("2)Read Rules");
        System.out.println("3) Exit");
        int menuChoice = CLI.readInt("What would you like to do? \n ",1,3);


        }
   //how many players
    // pick a word
        public static void  wordGen(){

        }
        public static void finish(){

        }
      //  public static void play(){

      //  }
    // guesses  completed
        public static void outGuess(){

        }
    // game won
        public static void youWon(){}
    //how many players




//make an array with entire alphabet
// make an array with letters that have been choosen
// take in guess
// move letter to choosen array
// run through to see if is in word
//print results
        // print counter

//option t ocontinue gae or exit





// the basic code to play but not doing what i want it to
//need to randomize the word  possible with API??
// possible 2 player to create the word


        public static void play( ) {
            int numOfGuesses = 0;
            boolean iterated = false;
            String temp = "";
            String currentCorrect = "";
            ArrayList<String> alreadyChoosen = new ArrayList<>();

            String[] playableWords = new String[]{
                    "guessing", "these", "words",
                    "is", "very", "easy"
            };
            Random rand = new Random();

            String randomWord  =  playableWords[rand.nextInt(playableWords.length)];
            String word = randomWord;

            do {

                String guess = CLI.readString("What is your guess?");
                alreadyChoosen.add(guess);
                for(int i = 0; i < word.length(); i ++) {
                    if (guess.equals(Character.toString(word.charAt(i)))) {
                        if(!iterated)
                            temp += Character.toString(word.charAt(i));
                        else {
                            currentCorrect = Character.toString(temp.charAt(i)).replace("-", guess);
                            temp = temp.substring(0, i) + currentCorrect + temp.substring( i + 1, temp.length());
                        }
                    } else {
                        if(!iterated) {
                            temp += "-";
                        }
                    }
                }
                numOfGuesses++;
                iterated = true;
                System.out.println(temp +"\n"+ alreadyChoosen);
                if(temp.equals(word)) {
                    System.out.println("You guessed correctly!");
                    break;
                }
            }while (numOfGuesses < 10);

            System.out.println("Better luck next time");

        }
}




