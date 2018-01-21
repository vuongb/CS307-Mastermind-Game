// Driver class for the game of Mastermind
import java.util.*;

public class Game {
	
	public static final int GUESSES = 12;
	


	// if showCode is true then the secret code is revealed before
	// the game starts. This will be used by graders of the program
	// to test the feedback of guesses
    private boolean showCode;

    /**
     * Create a Game object. 
     * @param easy If easy is true the secret code will be
     * revealed at all times when playing the game. If easy is
     * false the secret code is not revealed until correctly guessed
     * or the player runs out of turns.
     */
    public Game(boolean easy){
        showCode = easy;
    }

    /**
     * Run a one or more games of mastermind, until the player
     * quits.
     */
    public void runGames()
    {    	
    	boolean quit = false;
    	int guess = GUESSES;
    	Code master = new Code();
    	Code user;
    	prompt(master);
    	Scanner keyboard = new Scanner(System.in);
    	
    	// Create secret code
    	System.out.println("Generating Secret Code...");;

    	
    	while(!quit)
    	{
    		while(guess>=0)
    		{
    			if(showCode)
    				System.out.println("The secret code is: " + master.toString());
	    		guessPrompt(guess);
	    		String gu = getGuess(keyboard, master);
	    		if(gu.length() == 0)
	    			guess++;
	    		user = new Code(gu);
	    		guess--;
    		}
    	}
    }
    
    private void prompt(Code master)
    {
    	System.out.println("Welcome to Mastermind. \n");
    	System.out.println("This is a text version of the classic board game Mastermind.");
    	System.out.println("The computer will think of a secret code.");
    	System.out.println("The code consists of " + master.size() + " colored pegs.");
    	System.out.println("The pegs may be one of six colors: blue, green , orange, purple, red, or yellow.");
    	System.out.println("A color may appear more than once in the code.");
    	System.out.println("You try to guess what colored pegs are in the code and what order they are in.");
    	System.out.println("After making a guess the result will be displayed.");
    	System.out.println("A result consists of a black peg for each peg you have exactly correct (color and position) in your guess.");
    	System.out.println("For each peg in the guess that is the correct color, but is out of position, you get a white peg.\n");
    	System.out.println("Only the first letter of the color is displayed. B for Blue, R for Red, and so forth.");
    	System.out.println("When entering guesses you only need to enter the first character of the color as a capital letter.\n");
    	System.out.println("You have 12 to guess the answer or you lose the game.");
    }
    
    private void guessPrompt(int guess)
    {
    	System.out.println("\n You have: " + guess + " guesses left. \n");
		System.out.println("What is your next guess?");
		System.out.println("Type in the characters for your guess and press enter.");
		System.out.print("Enter guess: ");
    }
    
    private String getGuess(Scanner keyboard, Code master)
    {
    	String s = keyboard.nextLine();
    	s = s.toLowerCase();
    	boolean flag = s.length() == master.size();
    	for(int i = 0; i < s.length(); i++)
    	{
    		flag = flag && ((s.charAt(i) == 'y') || (s.charAt(i) == 'b') || 
    			(s.charAt(i) == 'g')|| (s.charAt(i) == 'o') || (s.charAt(i) == 'p')
    				|| (s.charAt(i) == 'r'));
    	}
    	if(flag)
    		return s.toUpperCase();
    	else
    		return "";
    }
    

}
