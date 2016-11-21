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

    if (!myPlay.equals("rock") && !myPlay.equals("paper") && !myPlay.equals("scissors"))
        System.out.println("Invalid move. Try again.");

}

    System.out.println("Computer's play is: " + compMove); 


    if (personPlay.equals(computerPlay)) {
		System.out.println("It's a tie!");
	}
	else if (personPlay.equals("R")) {
		if (computerPlay.equals("S")) 
			System.out.println("Rock crushes scissors. You win!!");
		else if (computerPlay.equals("P")) 
			System.out.println("Paper eats rock. You lose!!");
	}
	else if (personPlay.equals("P")) {
		if (computerPlay.equals("S")) 
			System.out.println("Scissor cuts paper. You lose!!"); 
		else if (computerPlay.equals("R")) 
			System.out.println("Paper eats rock. You win!!");
	} 
	else if (personPlay.equals("S")) {
		if (computerPlay.equals("P")) 
			System.out.println("Scissor cuts paper. You win!!"); 
		else if (computerPlay.equals("R")) 
			System.out.println("Rock breaks scissors. You lose!!");
}
}
}
