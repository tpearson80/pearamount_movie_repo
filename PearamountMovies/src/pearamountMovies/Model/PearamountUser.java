package pearamountMovies.Model;

import javax.swing.JOptionPane;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.*;


//*********************************************************************************************************
//                    This class creates the model for a user to enter their
//                    information to the movie program
//
//
//*********************************************************************************************************

public class PearamountUser implements Serializable{

	//class variables
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//user last name
	private String lastName = "";
	//user first name
	private String firstName = "";
	//user email
	private String email = "";
	//user password
	private String passWord = "";
	//user phone number
	private long phoneNum;
	//user's favorite movie genre
	private String favoriteMovieGenre;
	
	//empty constructor
	public PearamountUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method gets the last name of the user
	 * @return lastName
	 */
	public String getLastName() {
	try {
		String input = JOptionPane.showInputDialog("Enter your last name: ");
		if (input == null) {
			JOptionPane.showMessageDialog(null, "You must enter your last name!", "Pearamount Movies",
					JOptionPane.ERROR_MESSAGE);
			getLastName();
		} else {
			input = lastName;
		}
	} catch (NullPointerException e) {
		JOptionPane.showMessageDialog(null, "Error Made", "Pearamount Movies", JOptionPane.PLAIN_MESSAGE);
		e.printStackTrace();
	}
		return lastName;
	}
	
	//Method sets lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * This method gets the password from the user
	 * @return passWord
	 */
	public String getPassWord() {
	try {
		String input = JOptionPane.showInputDialog("Enter your password: ");
		if (input == null) {
			JOptionPane.showMessageDialog(null, "You must enter password!", "Pearamount Movies",
					JOptionPane.ERROR_MESSAGE);
			getPassWord();
		} else {
			input = passWord;
		}
	} catch (NullPointerException e) {
		JOptionPane.showMessageDialog(null, "Error Made", "Pearamount Movies", JOptionPane.PLAIN_MESSAGE);
		e.printStackTrace();
	}
		return passWord;
	}

	//Method sets passWord
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	
	/**
	 * This method gets the first name from the user
	 * @return firstName
	 */
	public String getFirstName() {
	try {	
		String input;
		input = JOptionPane.showInputDialog("Enter your first name: ");
		if (input == null) {
			JOptionPane.showMessageDialog(null, "You must enter your first name!", "Pearamount Movies",
					JOptionPane.ERROR_MESSAGE);
			getFirstName();
		} else {
			input = firstName;
		}
	} catch (NullPointerException e) {
		JOptionPane.showMessageDialog(null, "Error Made", "Pearamount Movies", JOptionPane.PLAIN_MESSAGE);
		e.printStackTrace();
	}
		return firstName;
	}

	//Method sets the firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * This method gets the email from the user
	 * @return email
	 */
	public String getEmail() {
		try {
			String input;
			input = JOptionPane.showInputDialog("Enter your email address: ");

			if (emailValidation(input)) {
				input = email;
			}

			else {
				JOptionPane.showMessageDialog(null, "           INVALID ENTRY!");
				getEmail();
			}

		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Error Made", "Pearamount Movies", JOptionPane.PLAIN_MESSAGE);
			e.printStackTrace();
			getEmail();
		}

		return email;
	}

	//Method sets the email for user
	public void setEmail(String email) {
		this.email = email;
	}

	
	/**
	 * This method validates the input of the email from users
	 * @param emailInput
	 * @return
	 */
	public static boolean emailValidation(String emailInput) {
		
		String email_regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(email_regex);

		if (emailInput == null) {
			return false;
		} else {
			Matcher matcher = pattern.matcher(emailInput);
			return matcher.matches();
		}
	}

	/**
	 * This method gets the phone number from the user
	 * @return phoneNum
	 */
	public long getPhoneNum() {
		try {
			do {
				String input;
				input = JOptionPane.showInputDialog("Enter your phone number: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "INVALID ENTRY" + "You must enter your phone number");
					getPhoneNum();
				}
				phoneNum = Long.parseLong(input);
			} while (phoneNum < 100_000_0000L || phoneNum > 999_999_9999L);

			if (phoneNum < 100_000_0000L || phoneNum > 999_999_9999L) {
				JOptionPane.showMessageDialog(null, "Invalid Entry! Enter phone number: ", 
						"Pearamount Movies", JOptionPane.PLAIN_MESSAGE);
				getPhoneNum();
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid Number, Try Again", "Pearamount Movies",
					JOptionPane.PLAIN_MESSAGE);
		}
		return phoneNum;
	}

	//Method sets the phoneNum
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	/**
	 * This method gets the user's favorite movie genre
	 * @param m
	 * @return favoriteMovieGenre
	 */
	public String getFavoriteMovieGenre(String m) {
		ArrayList<String> movieGenre = new ArrayList<String>();

		movieGenre.add(0, "Horror");
		movieGenre.add(1, "Comedy");
		movieGenre.add(2, "Action");
		movieGenre.add(3, "Documentary");
		movieGenre.add(4, "Thriller");
		movieGenre.add(5, "Anime");
		movieGenre.add(6, "Family");
		movieGenre.add(7, "Childrens");
		movieGenre.add(8, "Drama");

		JOptionPane.showMessageDialog(null, movieGenre);
		String input = JOptionPane.showInputDialog("Enter Your Favorite Genre: ");
		JOptionPane.showMessageDialog(null, "You entered: " + input, "Pearamount Movies", JOptionPane.PLAIN_MESSAGE);
		input = favoriteMovieGenre;

		return favoriteMovieGenre;
	}

	//Method sets the favoriteMovieGenre
	public void setFavoriteMovieGenre(String favoriteMovieGenre) {
		this.favoriteMovieGenre = favoriteMovieGenre;
	}
	

	//This is the toString method for the PearamountUser class
	@Override
	public String toString() {
		return "PearamountUser \n[lastName=" + lastName + ", firstName=" + firstName + ", email=" + email + ", phoneNum="
				+ phoneNum + ", favoriteMovieGenre=" + favoriteMovieGenre + "]";
	}

}
