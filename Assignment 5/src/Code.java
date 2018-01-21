import java.util.ArrayList;

public class Code {
	
	// Fields
	private ArrayList<Pegs> cipher = new ArrayList<Pegs>();
	private static final int CODESIZE = 4;
	
	
	// Constructors
	
	// Default constructor generates random Master Code of size 4
	public Code()
	{
		Pegs p;
		for(int i = 0; i < CODESIZE; i++)
		{
			p = new Pegs();
			cipher.add(p);
		}		
	}
	
	// Constructor for User-Entered Codes
	public Code(String input)
	{
		String temp = "";
		for(int i = 0; i < input.length(); i++)
		{
			temp += input.charAt(i);
			cipher.add(new Pegs(temp));
			temp = "";
		}
	}
	
	// Converts the Code Object to a String
	public String toString()
	{
		String output = "";
		Pegs temp;
		for(int i = 0; i < cipher.size(); i++)
		{
			temp = (Pegs) cipher.get(i);
			output += temp.getColor();
		}
		return output;
	}
	
	// Get Code Size
	public int size()
	{
		return CODESIZE;
	}
	
}
