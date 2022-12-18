# Explanation of the code:-

- The code is a number guessing game implemented in Java. The program generates a random number between 1 and 100 and prompts the user to guess it

- The user has a certain number of attempts to guess the correct number. If the user's guess is correct, the program prints a success message and updates the user's score

- If the user's guess is incorrect, the program gives the user a hint if the target number is greater or less than the user's guess

- The program allows the user to play a certain number of rounds, and the user's score is updated after each round. At the end of all the rounds, the program prints the user's final score

- The number of rounds and the number of attempts per round are configurable. The program uses the Scanner class from the java.util package to read input from the command line

- The code initializes the rounds, attempts, and score variables to keep track of the number of rounds, the number of attempts per round, and the user's score, respectively. The program enters a loop to run for the specified number of rounds

- In each round, it generates a random number between 1 and 100 to be the target number that the user needs to guess. The program then enters another loop to allow the user to make a certain number of attempts to guess the target number

- In each attempt, it prompts the user to enter a number and reads it from the command line using the Scanner class. It then checks whether the user's guess is correct, If the user's guess is correct, the loop is broken and the score is updated

- After all the rounds are completed, the program closes the Scanner and prints the user's final score



# Methodolgy of choosing 3 rounds and 7 attempts:-

- Binary search is a search algorithm that enables the efficient location of a specific value within a sorted list of values. The algorithm achieves this by repeatedly dividing the list in half and determining which half of the list the sought value is likely to be located in, based on its value in relation to the midpoint of the list. In the worst case scenario, it would take at most 7 iterations of this process to locate a value between 1 and 100 within a sorted list using binary search.
 
- To increase the accuracy of the search results, it is often beneficial to perform the search multiple times, referred to as "rounds." This serves to confirm the results and can help to identify any potential errors or inconsistencies. In this instance, we will execute the search a total of 3 rounds to enhance the reliability of the results.

- The number of attempts required in the worst case scenario is 7. In order to confirm the results and increase the reliability of the search, multiple rounds can be performed. In this case, 3 rounds will be conducted, resulting in a total of 7 attempts. This demonstrates the efficiency of the binary search method in finding a specific number within a sorted list of numbers within a limited number of attempts.


# Pseudocode
1) Initialize variables rounds, attempts, and score to 3, 7, and 0 respectively. Create a Scanner object for reading user input.
2) Loop for the number of rounds (3):
- - Generate a random number between 1 and 100 and store it in a variable called target.
- - Print an empty line and the round header.
- - Loop for the number of attempts (7):
- - - Print an empty line, the number of attempts remaining, and a prompt for the user to guess a number.
- - - Read the user's input and store it in a variable called answer.
- - - If answer is correct, print a success message, increase score by 1, and break out of the attempts loop.
- - - If answer is not correct, print a message indicating whether the target is greater or less than answer.
3) Close the Scanner object and print the total score.
