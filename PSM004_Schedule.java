
import resources.PSM004_ScheduleHelper;
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
public class PSM004_Schedule extends PSM004_ScheduleHelper
{
	/**
	 * Script Name   : <b>PSM004_Schedule</b>
	 * Generated     : <b>Sep 27, 2012 9:35:34 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/09/27
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		startApp("PSM");
		
		// Window: java.exe: PSM Login
		psmLoginwindow().click(atPoint(221,74));
		psmLoginwindow().inputKeys("cen5076");
		psmLoginwindow().click(atPoint(217,109));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(146,164));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(298,67));
		
		// Window: java.exe: Schedule Setup
		scheduleSetupwindow().waitForExistence(
                                        10.0, 2.0);
		scheduleSetupwindow().click(atPoint(200,85));
		scheduleSetupwindow().click(atPoint(170,118));
		scheduleSetupwindow().click(atPoint(170,118));
		scheduleSetupwindow().inputKeys("1/01/12");
		scheduleSetupwindow().click(atPoint(421,120));
		scheduleSetupwindow().inputChars("1/02/13");
		scheduleSetupwindow().click(atPoint(386,194));
		scheduleSetupwindow().inputChars("1234");
		scheduleSetupwindow().click(atPoint(132,193));
		scheduleSetupwindow().inputKeys("Sub");
		scheduleSetupwindow().click(atPoint(164,215));
		scheduleSetupwindow().inputChars("Nam");
		scheduleSetupwindow().click(atPoint(127,308));
		scheduleSetupwindow().inputKeys("12:00");
		scheduleSetupwindow().click(atPoint(138,353));
		scheduleSetupwindow().inputChars("13:00");
		scheduleSetupwindow().click(atPoint(201,306));
		scheduleSetupwindow().inputKeys("12:00");
		scheduleSetupwindow().click(atPoint(201,357));
		scheduleSetupwindow().inputChars("13:00");
		scheduleSetupwindow().click(atPoint(265,303));
		scheduleSetupwindow().inputChars("12:00");
		scheduleSetupwindow().click(atPoint(267,354));
		scheduleSetupwindow().inputKeys("13:00");
		scheduleSetupwindow().click(atPoint(352,304));
		scheduleSetupwindow().inputChars("12:00");
		scheduleSetupwindow().click(atPoint(365,348));
		scheduleSetupwindow().inputChars("13:00");
		scheduleSetupwindow().click(atPoint(439,301));
		scheduleSetupwindow().inputChars("12:00");
		scheduleSetupwindow().click(atPoint(434,350));
		scheduleSetupwindow().inputChars("13:00");
		scheduleSetupwindow().click(atPoint(521,303));
		scheduleSetupwindow().inputChars("12:00");
		scheduleSetupwindow().click(atPoint(523,351));
		scheduleSetupwindow().inputChars("13:00");
		scheduleSetupwindow().click(atPoint(465,405));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().waitForExistence(10.0, 2.0);
		
	}
}

