package helpers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class HelperMethods {

	public static void keyBoardKeysPress(int key) throws AWTException
	{
		Robot rb=new Robot();
		rb.keyPress(key);
	}

	
}
