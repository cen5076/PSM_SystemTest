
import resources.$LogoutHelper;
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
public class $Logout extends $LogoutHelper
{
	/**
	 * Script Name   : <b>Logout</b>
	 * Generated     : <b>Sep 26, 2012 8:26:48 PM</b>
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
		psmLoginwindow().inputChars("c5076");
		psmLoginwindow().click(atPoint(135,117));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(143,159));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(377,277));
		
		// Window: java.exe: System Message
		systemMessagewindow(ANY,MAY_EXIT).click(atPoint(141,163));
	}
}

