import java.util.*;
public class Pegs 
{
	//blue, green, orange, purple, red, and yellow, black, white
	
	
	// Fields
	private String color;
	
	
	// Constructors
	// Default Constructor generates a random color
	public Pegs()
	{
		Random ran = new Random();
		int col = ran.nextInt(6);
		switch(col)
		{
			case 0: color = "B"; break;
			case 1: color = "G"; break;
			case 2: color = "O"; break;
			case 3: color = "P"; break;
			case 4: color = "R"; break;
			case 5: color = "Y"; break;
		}
		
	}
	
	public Pegs(String s)
	{
		s = s.toUpperCase();
		if(s.equals("B"))
				color = "B";
		else if(s.equals("G"))
				color = "G";
		else if(s.equals("O"))
				color = "O";
		else if(s.equals("P"))
				color = "P";
		else if(s.equals("R"))
				color = "R";
		else if(s.equals("Y"))
				color = "Y";
	}
	
	// Methods
	
	// Get Color of Peg
	public String getColor()
	{
		return color;
	}
}
