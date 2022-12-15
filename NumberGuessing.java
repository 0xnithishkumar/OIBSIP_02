//Importing scanner class
import java.util.Scanner;

class NumberGuessing {
  public static void main(String[] args) {
    //Initializing rounds, attmepts and score variables
    int rounds = 3;
    int attempts = 7;
    int score = 0;

    Scanner sc = new Scanner(System.in);
    
    //Loop for number of rounds
    for(int round=1; round<=rounds; round++){
      //Initializing target to a random value between 1 and 100
      int target = (int) ((Math.random() * (100 - 1)) + 1);
      System.out.println();
      System.out.println("--------------------rounds Number "+ round + "--------------------");
      //Loop for number of attempts
      for(int attempt=1; attempt<=attempts; attempt++){
        System.out.println();
        System.out.println("You have " + (attempts-attempt+1) + " attempts to go!");
        System.out.print("Guess a number between 1 to 100: ");
        //Input from the user
        int answer = sc.nextInt(); 
        if(answer == target){
          System.out.println("You have guessed correctly");
          score += (int) 100/attempt;
          break;
        }
        else{
          if(answer > target)
            System.out.println("Number to be guessed is less than " + answer);
          else
            System.out.println("Number to be guessed is greater than " + answer);
        }
      }
    }
    sc.close();
    System.out.println();
    System.out.println("Total score is " + score);
  }
}
