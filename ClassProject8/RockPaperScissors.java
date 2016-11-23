import java.util.*; 


public class RockPaperScissors
{ 
public static void main(String[] args) 
{ 
    String myPlay = ""; //User's play -- "rock", "paper", or "scissors" 
    String compPlay = ""; //Computer's play -- "rock", "paper", or "scissors" 
    int compInt; //Randomly generated number used to determine 
                     //computer's play 
					 
    String response; 


    Scanner scan = new Scanner(System.in); 
    Random generator = new Random(); 
	
	compInt = generator.nextInt(3)+1; 
	
	if (compInt == 1) 
       compPlay = "rock"; 
    else if (compInt == 2) 
       compPlay = "paper"; 
    else if (compInt == 3) 
       compPlay = "scissors"; 
	
    System.out.printf("Hey, let's play Rock, Paper, Scissors!\n" + 
                       "Please enter a move.\n" + "Choose \"rock\", \"paper,\"" + 
                       "or \"scissors.\"");

					   
    while (!myPlay.equals("rock") && !myPlay.equals("paper") && !myPlay.equals("scissors")) {

    //Get player's play from input-- note that this is 
    // stored as a string 
    System.out.println("Enter your play: "); 
    myPlay = scan.next();

    if (!myPlay.equals("rock") && !myPlay.equals("paper") && 
            !myPlay.equals("scissors"))
        System.out.println("Invalid move. Try again.");

}

    System.out.println("Computer's play is: " + compPlay); 


    if (myPlay.equals(compPlay)) {
		System.out.println("It's a tie!");
	}
	else if (myPlay.equals("rock")) {
		if (compPlay.equals("scissors")) 
			System.out.println("Rock beats scissors. You win!");
		else if (compPlay.equals("paper")) 
			System.out.println("Paper beats rock. You lose.");
	}
	else if (myPlay.equals("paper")) {
		if (compPlay.equals("scissors")) 
			System.out.println("Scissors beat paper. You lose."); 
		else if (compPlay.equals("rock")) 
			System.out.println("Paper beats rock. You win!");
	} 
	else if (myPlay.equals("scissors")) {
		if (compPlay.equals("paper")) 
			System.out.println("Scissor beats paper. You win!"); 
		else if (compPlay.equals("rock")) 
			System.out.println("Rock beats scissors. You lose.");
}
}
}
