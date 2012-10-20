
import resources.PSM001_Login_LockoutHelper;
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
public class PSM001_Login_Lockout extends PSM001_Login_LockoutHelper
{
	/**
	 * Script Name   : <b>PSM001_Login_Lockout</b>
	 * Generated     : <b>Oct 7, 2012 5:17:06 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/10/07
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		startApp("PSM");
		
		//First BadPassword
		// Window: java.exe: PSM Login
		psmLoginwindow().inputChars(dpString("1"));
		psmLoginwindow().click(atPoint(141,115));
		psmLoginwindow().click(atPoint(144,114));
		psmLoginwindow().inputChars(dpString("2"));
		psmLoginwindow().click(atPoint(144,159));
		
		// Window: java.exe: System Message
		systemMessagewindow().click(atPoint(145,161));
		
		//Second BadPassword
		// Window: java.exe: PSM Login
		psmLoginwindow().waitForExistence(10.0, 2.0);
		
		this.dpNext();
		psmLoginwindow().inputChars(dpString("1"));
		psmLoginwindow().click(atPoint(141,115));
		psmLoginwindow().click(atPoint(144,114));
		psmLoginwindow().inputChars(dpString("2"));
		psmLoginwindow().click(atPoint(144,159));
		
		// Window: java.exe: System Message
		systemMessagewindow().click(atPoint(145,161));
		
		//Third BadPassword
		// Window: java.exe: PSM Login
		psmLoginwindow().waitForExistence(10.0, 2.0);
		
		this.dpNext();
		psmLoginwindow().inputChars(dpString("1"));
		psmLoginwindow().click(atPoint(141,115));
		psmLoginwindow().click(atPoint(144,114));
		psmLoginwindow().inputChars(dpString("2"));
		psmLoginwindow().click(atPoint(144,159));
		
		// Window: java.exe: System Message
		systemMessagewindow().click(atPoint(145,161));
		
	}
}

