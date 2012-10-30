
import resources.PSM001_Login_Logout_SunnyHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author Chakaitos
 */
public class PSM001_Login_Logout_Sunny extends PSM001_Login_Logout_SunnyHelper
{
	/**
	 * Script Name   : <b>PSM001_Login_SunnyDay</b>
	 * Generated     : <b>Oct 20, 2012 8:18:53 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/10/20
	 * @author Chakaitos
	 */
	public void testMain(Object[] args) 
	{
		ProcessTestObject psm = startApp("psm");
		
		// Window: java.exe: PSM Login
		psmLoginwindow().inputChars(dpString("User Name"));
		psmLoginwindow().click(atPoint(139,111));
		psmLoginwindow().inputChars(dpString("Password"));
		psmLoginwindow().click(atPoint(147,153));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(389,283));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().waitForExistence(10.0, 2.0);
		
		// Window: java.exe: System Message
		systemMessagewindow(ANY,MAY_EXIT).click(atPoint(136,163));

		
		psm.kill();
	}
}

