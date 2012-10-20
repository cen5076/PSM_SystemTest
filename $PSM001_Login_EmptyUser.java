
import resources.$PSM001_Login_EmptyUserHelper;
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
public class $PSM001_Login_EmptyUser extends $PSM001_Login_EmptyUserHelper
{
	/**
	 * Script Name   : <b>PSM001_Login_EmptyUser</b>
	 * Generated     : <b>Sep 26, 2012 9:03:01 PM</b>
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
		psmLoginwindow().click(atPoint(127,111));
		psmLoginwindow().inputChars("en5076");
		psmLoginwindow().click(atPoint(126,152));
		
		// Window: java.exe: System Message
		systemMessagewindow().waitForExistence(
                                        10.0, 2.0);
		systemMessagewindow().click(atPoint(147,159));
		
		// Window: java.exe: PSM Login
		psmLoginwindow().waitForExistence(10.0, 2.0);
	}
}

