package pearamountMovies.Main;

import javax.swing.JOptionPane;
import pearamountMovies.View.*;
import pearamountMovies.Model.*;
import pearamountMovies.Controller.*;


//***********************************************************************************************************
//
//
//                      This class is the main method class to run the movie program created by
//                                              Travis Pearson
//
//
//***********************************************************************************************************


public class PearamountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creates a new user
		PearamountInput user = new PearamountInput();
		//integer created to receive yes or no answer
		int repeat;
	
		//welcomes the user 
		JOptionPane.showMessageDialog(null,
				"         Welcome to Pearamount Movies!" + "\n    Sign Up to enjoy your favorite movies",
				"Pearamount Movies", JOptionPane.PLAIN_MESSAGE);
		
		//asks the user if they are already a member. If they are, it will send them to sign in. If they are
		//not, it will send the user to sign up for service.
		repeat = JOptionPane.showConfirmDialog(null, "Are you already a member? ", "Pearamount Movies",
				JOptionPane.YES_NO_OPTION);
		if (repeat == 0) {
			user.signIn();
		} else {
			JOptionPane.showMessageDialog(null, "               Let's Get You Watching!", "Pearamount Movies",
					JOptionPane.PLAIN_MESSAGE);
			user.signUp();
		}

		
		//sends user to the main menu of the movie program
		PearamountInput.mainMenu();
		//asks user if they wish to go back to the main menu
		PearamountInput.goBackMain();

	}

}
