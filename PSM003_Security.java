
import resources.PSM003_SecurityHelper;
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
public class PSM003_Security extends PSM003_SecurityHelper
{
	/**
	 * Script Name   : <b>PSM003_Security</b>
	 * Generated     : <b>Sep 26, 2012 9:22:24 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/09/26
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		ProcessTestObject psm = startApp("PSM");
		
		// Window: java.exe: PSM Login
		psmLoginwindow().click(atPoint(152,76));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(141,114));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(138,153));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(302,202));
		psmMainMenuwindow().click(atPoint(302,202));
		psmMainMenuwindow().click(atPoint(377,201));
		
		this.logTestResult("Security Unimplemented", false);
		
		psm.kill();
		
	}
}

