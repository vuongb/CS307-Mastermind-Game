// Student information for assignment

// On <my|our> honor, <NAME1> and <NAME2>, 
// this programming assignment is <my|our> own work.

// Student 1, Name:
// Student 1, UTEID:
// Student 1, CS307 class unique section id: 
// Student 1, email address:
// Student 1, TA name:
//
// Student 2, Name:
// Student 2, UTEID:
// Student 2, CS307 class unique section id: 
// Student 2, email address:
// Student 2, TA name::
// 
// Number of slip days used on this assignment:



public class MastermindDriver {
   
    // Do not alter this method
    public static void main(String[] args){
        Game g = new Game(true);
        g.runGames();
        g = new Game(false);
        g.runGames();
    }
    
    // Tester code may be placed here (or create a 
    // seperate tester class.
}
