
import resources.PSM002_Logout_AfterEditHelper;
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
public class PSM002_Logout_AfterEdit extends PSM002_Logout_AfterEditHelper
{
	/**
	 * Script Name   : <b>PSM002_Logout_AfterEdit</b>
	 * Generated     : <b>Oct 1, 2012 4:12:16 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/10/01
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		startApp("PSM");
		
		// Window: java.exe: PSM Login
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(179,121));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(134,168));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(374,104));
		
		// Window: java.exe: Please Choose
		pleaseChoosewindow().click(atPoint(126,159));
		
		// Window: java.exe: Edit Schedule
		editSchedulewindow().click(atPoint(203,215));
		editSchedulewindow().inputChars(" Mod");
		editSchedulewindow().click(atPoint(462,398));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(394,284));
		
		// Window: java.exe: System Message
		systemMessagewindow().waitForExistence(
                                        10.0, 2.0);
		systemMessagewindow(ANY,MAY_EXIT).click(atPoint(143,159));
	}
}

