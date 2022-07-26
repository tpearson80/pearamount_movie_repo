package pearamountMovies.View;

import javax.swing.JOptionPane;

import pearamountMovies.Controller.PearamountFlow;
import pearamountMovies.Model.PearamountUser;


//**************************************************************************************************************
//
//                       This class is where the user inputs are collected
//                       for the movie program.
//
//**************************************************************************************************************


public class PearamountInput {

	//creates new PearamountUser
	PearamountUser user = new PearamountUser();

	//empty constructor
	public PearamountInput() {

	}

	/**
	 * This method creates a signup feature for the user and saves their data
	 * to PearamountUserData.txt
	 */
	public void signUp() {
		PearamountFlow.pearamountUserData("PearamountUserData.txt", " ", true);
		JOptionPane.showMessageDialog(null, "              Thank You");
	}

	/**
	 * This method creates a sign in feature for the user 
	 * I have struggled to figure out exactly how to retrieve data
	 */
	public void signIn() {

		JOptionPane.showMessageDialog(null, "          Welcome Back!\n          Sign In Please");
		user.getFirstName();
		user.getLastName();
		user.getPassWord();
		JOptionPane.showMessageDialog(null, "              Thank You");
	}

	/**
	 * This method is the main menu of the program. It allows users to choose
	 * which genre of movie that they wish to watch
	 * @return number
	 */
	public static int mainMenu() {
		int number = 0;
		String input;
		try {
			input = JOptionPane.showInputDialog("               Main Menu" + "\n\n ****Enter Genre Selection****"
					+ "\nEnter 1 for Drama \nEnter 2 for Horror \nEnter 3 for Comedy \nEnter 4 for Anime"
					+ "\nEnter 5 for Documentary \nEnter 6 for Family \nEnter 7 for Childrens"
					+ "\nEnter 8 for Thriller \nEnter 9 to EXIT");
			number = Integer.parseInt(input);
			while (number < 1 || number > 9) {
				input = JOptionPane.showInputDialog("             INVALID ENTRY" + "\n               Main Menu"
						+ "\n\n  ****Enter Genre Selection****"
						+ "\nEnter 1 for Drama \nEnter 2 for Horror \nEnter 3 for Comedy \nEnter 4 for Anime"
						+ "\nEnter 5 for Documentary \nEnter 6 for Family \nEnter 7 for Childrens"
						+ "\nEnter 8 for Thriller \nEnter 9 to EXIT");
				number = Integer.parseInt(input);
			}

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "You must enter a number!", "Pearamount Movies",
					JOptionPane.WARNING_MESSAGE);
			mainMenu();
		}

		if (number == 1) {
			movieGenreDrama();
		}

		else if (number == 2) {
			movieGenreHorror();
		}

		else if (number == 3) {
			movieGenreComedy();
		}

		else if (number == 4) {
			movieGenreAnime();
		}

		else if (number == 5) {
			movieGenreDocumentary();
		}

		else if (number == 6) {
			movieGenreFamily();
		}

		else if (number == 7) {
			movieGenreChildren();
		}

		else if (number == 8) {
			movieGenreThriller();
		}

		else if (number == 9) {
			menuExitMessage();
		}

		else
			mainMenu();

		return number;
	}

	//Method for the drama genre
	public static void movieGenreDrama() {
		JOptionPane.showMessageDialog(null, "Enjoy your Drama Movie!");
		goBackMain();
	}

	//Method for the horror genre
	public static void movieGenreHorror() {
		JOptionPane.showMessageDialog(null, "Enjoy your Horror Movie!");
		goBackMain();
	}

	//Method for the comedy genre
	public static void movieGenreComedy() {
		JOptionPane.showMessageDialog(null, "Enjoy your Comedy Movie!");
		goBackMain();
	}

	//Method for the anime genre
	public static void movieGenreAnime() {
		JOptionPane.showMessageDialog(null, "Enjoy your Anime Movie!");
		goBackMain();
	}

	//Method for the documentary genre
	public static void movieGenreDocumentary() {
		JOptionPane.showMessageDialog(null, "Enjoy your Documentary Movie!");
		goBackMain();
	}

	//Method for the family genre
	public static void movieGenreFamily() {
		JOptionPane.showMessageDialog(null, "Enjoy your Family Movie!");
		goBackMain();
	}

	//Method for the childrens genre
	public static void movieGenreChildren() {
		JOptionPane.showMessageDialog(null, "Enjoy your Children's Movie!");
		goBackMain();
	}

	//Method for the thriller genre
	public static void movieGenreThriller() {
		JOptionPane.showMessageDialog(null, "Enjoy your Thriller Movie!");
		goBackMain();
	}

	/**
	 * This method allows the user to exit the program 
	 */
	public static void menuExitMessage() {

		// Exiting message
		JOptionPane.showMessageDialog(null, "Thank You for using Pearamount Movies" + "\n\n           Have a Great Day!"
				+ "\n\n                   Goodbye!", "Pearamount Movies", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

	//Method that asks user if they want to go back to the main menu of the program.
	public static void goBackMain() {

		int repeat;

		repeat = JOptionPane.showConfirmDialog(null, "Would you like to go back to the Menu? ", "Pearamount Movies",
				JOptionPane.YES_NO_OPTION);

		if (repeat == 0) {
			mainMenu();
		} else
			menuExitMessage();

	}
}
