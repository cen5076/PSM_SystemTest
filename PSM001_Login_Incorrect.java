
import resources.PSM001_Login_IncorrectHelper;
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
public class PSM001_Login_Incorrect extends PSM001_Login_IncorrectHelper
{
	/**
	 * Script Name   : <b>PSM001_Login_DataPool</b>
	 * Generated     : <b>Oct 7, 2012 4:41:27 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/10/07
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		ProcessTestObject psm = startApp("PSM");
		
		// Window: java.exe: PSM Login
		psmLoginwindow().click(atPoint(139,70));
		psmLoginwindow().inputChars(dpString("1"));
		psmLoginwindow().click(atPoint(151,117));
		psmLoginwindow().inputChars(dpString("2"));
		psmLoginwindow().click(atPoint(137,153));
		
		// Window: java.exe: System Message
		systemMessagewindow().waitForExistence(
                                        10.0, 2.0);
		systemMessagewindow().click(atPoint(132,160));
		psm.kill();
	}
}

