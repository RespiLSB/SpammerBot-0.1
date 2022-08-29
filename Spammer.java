import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

/*Developed by Dovydas Rybakas a.k.a WrenchSec
This is a very simple java based spammer, it is devloped using basic Java functions that simply copies, pastes and hits enter all in a matter of a second.
*/

public class Spammer {
	public static void main(String[] args) throws AWTException {
		int x = 1; //sets the x value to 1
		Robot robot = new Robot();
		Scanner scanner = new Scanner(System.in);

		/*When you compile and run this program in application such as Eclipse (which was used to develope this specific program)
		it prompots you to enter any text that you would want the program to process.
		*/

		//The prompt message that you would see.
		System.out.println("Enter text: "); 
		//This function will take you to the next line. Mainly used to keep a tidy text area.
		String Text = scanner.nextLine(); 

		//This function selects the text that you have input.
		StringSelection stringSelection = new StringSelection(Text); 
		//This function stores the selected string done in the above statement and stores in the the clip board (or CTRL + C for short)
		Clipboard clipboard = Toolkit.getDefaultToolKit().getSystemClipboard(); 
		clipboard.setContents(stringSelection, null);

		//Announcement
		System.out.println("The spamming will start in 5 seconds!"); 
		//Program will timeout for 5 seconds (1000 = 1 second) which will give you time to prepare to click on the text area where you would like the program to spam.
		Thread.sleep(5000); 

		//This function lets you set the ammount of times you would want it to spam. In this case; program pastes your text 10 times and then stops.
		while(x <= 10) { 

		//Breks for 1 second between spamming to avoid a crash or a bug.
		Thread.sleep(1000); 

		/*By now: You can easily tell what the following text does.
		But if you are unclear, the 'Robot' import will perform the keyboard actions, VK_CONTROL means it will use the CTRL button. VK_V will us the V key. and VK_ENTER will use the ENTER key.
		And it accomplishes these keystrokes in 0.001 seconds. Pretty fast, right?
		*/
		robot.keyPress(KeyEevent.VK_CONTROL);
		robot.keyPress(KeyEevent.VK_V);
		robot.keyRelease(KeyEevent.VK_CONTROL);
		robot.keyRelease(KeyEevent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		x++;

		}

	}
}

//And this is how you create a simple spammer bot using Java in under 50 lines of code. You may download and use this code and try it out for yourself to annoy your friends.
//Coded by: Dovydas Rybakas a.k.a WrenchSec
