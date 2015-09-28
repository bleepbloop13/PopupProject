package popup.display;

import javax.swing.JOptionPane;
/**
 * This class provides popups for input and output
 * @author rbak9218
 * @version 1.0 9/28/15
 */
public class PopupDisplay
{
	/**
	 * Provides a popup box for asking a question and allows the user to enter and answer
	 * @param input Takes the input from the user
	 * @return Returns that input from the user
	 */
	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
		
	}
	/**
	 * This puts the answers into a string
	 * @param input This is the users answer
	 */
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
