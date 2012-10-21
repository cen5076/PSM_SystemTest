
import resources.PSM004_Schedule_CancelHelper;
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
public class PSM004_Schedule_Cancel extends PSM004_Schedule_CancelHelper
{
	/**
	 * Script Name   : <b>PSM004_Schedule_Cancel</b>
	 * Generated     : <b>Sep 27, 2012 4:14:56 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/09/27
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		ProcessTestObject psm = startApp("PSM");
		
		// Window: java.exe: PSM Login
		psmLoginwindow().click(atPoint(137,80));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(164,109));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(138,156));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(294,67));
		
		// Window: java.exe: Schedule Setup
		scheduleSetupwindow().waitForExistence(
                                        10.0, 2.0);
		scheduleSetupwindow().click(atPoint(559,401));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().waitForExistence(10.0, 2.0);
		
		psm.kill();
	}
}

