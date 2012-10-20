
import resources.PSM001_Login_SunnyHelper;
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
public class PSM001_Login_Sunny extends PSM001_Login_SunnyHelper
{
	/**
	 * Script Name   : <b>PSM001_Login_Then_Close</b>
	 * Generated     : <b>Oct 7, 2012 3:28:31 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/10/07
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		startApp("PSM");
		
		// Window: java.exe: PSM Login
		psmLoginwindow().click(atPoint(165,71));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(229,111));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(154,165));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().waitForExistence();
		psmMainMenuwindow().click(atPoint(367,281));
		
		// Window: java.exe: System Message
		systemMessagewindow(ANY,MAY_EXIT).click(atPoint(134,163));
	}
}

