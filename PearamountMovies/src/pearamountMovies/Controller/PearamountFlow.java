package pearamountMovies.Controller;

import java.io.*;
import javax.swing.JOptionPane;
import pearamountMovies.Model.PearamountUser;


//**********************************************************************************************************************
//
//           This class retrieves data from the user and saves the data to the PearamountUserData.txt
//
//
//**********************************************************************************************************************


public class PearamountFlow {

	public PearamountFlow() {
		super();
	}

	public static void pearamountUserData(String userFile, String text, boolean updateFile) {

		// Creates a new user
		PearamountUser user = new PearamountUser();
		
		// Creates a file with user's information
		try {
			// Creates a file object called f
			File f = new File(userFile);
			// Creates FileWriter object called fw
			FileWriter fw = new FileWriter(f, updateFile);
			// Using PrintWriter method to collect user's personal data
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Last Name " + user.getLastName());
			pw.println("First Name " + user.getFirstName());
			pw.println("Phone Number " + user.getPhoneNum());
			pw.println("Email " + user.getEmail());
			pw.println("Password " + user.getPassWord());
			pw.println("Favorite Movie Genre " + user.getFavoriteMovieGenre(""));
			pw.close();
		
		//	FileOutputStream outStream = new FileOutputStream("PearamountUserData.txt");
		//	ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
		//	objectOutputFile.writeObject(user.getLastName());
		//	objectOutputFile.writeObject(user.getFirstName());
		//	objectOutputFile.writeObject(user.getPhoneNum());
		//	objectOutputFile.writeObject(user.getEmail());
		//	objectOutputFile.writeObject(user.getPassWord());
		//	objectOutputFile.writeObject(user.getFavoriteMovieGenre(""));
			
			JOptionPane.showMessageDialog(null,
					"              Thank You " + "\nData written to file PearamountUserData.txt", "Pearamount Movies",
					JOptionPane.INFORMATION_MESSAGE);

		} catch (IOException | NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error, Try Again", "Pearamount Movies", JOptionPane.ERROR_MESSAGE);
			pearamountUserData("PearamountUserData.txt", " ", true);
		}

	}
	
	
}
