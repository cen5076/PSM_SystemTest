
import resources.PSM002_Logout_CancelHelper;
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
 * @author David
 */
public class PSM002_Logout_Cancel extends PSM002_Logout_CancelHelper
{
	/**
	 * Script Name   : <b>PSM002_Logout_Cancel</b>
	 * Generated     : <b>Sep 26, 2012 9:13:39 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/09/26
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		startApp("PSM");
		
		// Window: java.exe: PSM Login
		psmLoginwindow().click(atPoint(146,73));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(143,114));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(159,162));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(392,274));
		
		// Window: java.exe: System Message
		systemMessagewindow().waitForExistence(
                                        10.0, 2.0);
		systemMessagewindow(ANY,MAY_EXIT).click(CLOSE_BUTTON);
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().waitForExistence(10.0, 2.0);
	}
}

