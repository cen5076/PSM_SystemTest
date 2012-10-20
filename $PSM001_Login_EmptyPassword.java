
import resources.$PSM001_Login_EmptyPasswordHelper;
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
public class $PSM001_Login_EmptyPassword extends $PSM001_Login_EmptyPasswordHelper
{
	/**
	 * Script Name   : <b>PSM001_Login_Alt1</b>
	 * Generated     : <b>Sep 26, 2012 8:58:48 PM</b>
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
		psmLoginwindow().click(atPoint(129,77));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(130,159));
		
		// Window: java.exe: System Message
		systemMessagewindow().waitForExistence(
                                        10.0, 1.0);
		systemMessagewindow().click(atPoint(139,159));
		
		//Fail Window did not open
		// Window: java.exe: PSM Login
		psmLoginwindow().waitForExistence(10.0, 2.0);
	}
}

