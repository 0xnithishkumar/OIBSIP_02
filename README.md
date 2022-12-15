// Explanation of the code

The code is a simple number guessing game implemented in the Java programming language. When the program is run, it generates a random number between 1 and 100 and prompts the user to guess the number. The user has a certain number of attempts to guess the correct number. If the user's guess is correct, the program prints a success message and updates the user's score. If the user's guess is incorrect, the program gives the user a hint whether the target number is greater or less than the user's guess.

The program allows the user to play a certain number of rounds, and the user's score is updated after each round. At the end of all the rounds, the program prints the user's final score. The number of rounds and the number of attempts per round are configurable, and the program uses the Scanner class from the java.util package to read input from the command line.

The code imports the Scanner class from the java.util package and uses it to read user input from the command line. The code initializes the rounds, attempts, and score variables to keep track of the number of rounds, the number of attempts per round, and the user's score, respectively. The program then enters a loop to run for the specified number of rounds. In each round, it generates a random number between 1 and 100 to be the target number that the user needs to guess. The program then enters another loop to allow the user to make a certain number of attempts to guess the target number. In each attempt, it prompts the user to enter a number and reads it from the command line using the Scanner class. It then checks whether the user's guess is correct. If the user's guess is correct, the loop is broken and the score is updated. If the guess is incorrect, the program gives the user a hint whether the target number is greater or less than the user's guess. After all the rounds are completed, the program closes the Scanner and prints the user's final score


// Methodolgy of choosing 3 rounds and 7 attempts

The number of attempts is set to 7 because if we use binary search to find the target guessed by the computer, it takes 8 attempts at most. So, as it's a game, I gave one less chance. The number of rounds is 3 because we can give a proper score at the end of the game.


// Pseudocode

    class NumberGuessing {
      main(args) {
        // Initialize rounds, attempts and score variables
        rounds = 3
        attempts = 7
        score = 0
        scanner = new Scanner(System.in)

        // Loop for number of rounds
        for round = 1 to rounds {
          // Initialize target to a random value between 1 and 100
          target = random value between 1 and 100

          print empty line
          print round header

          // Loop for number of attempts
          for attempt = 1 to attempts {
            print empty line
            print number of attempts remaining
            print prompt to guess a number

            // Read user input
            answer = read input from scanner

            if answer is correct {
              print success message
              update score
              break out of attempts loop
            } else {
              if answer is greater than target {
                print message indicating target is less than answer
              } else {
                print message indicating target is greater than answer
              }
            }
          }
        }
        close scanner
        print empty line
        print total score
      }
    }
