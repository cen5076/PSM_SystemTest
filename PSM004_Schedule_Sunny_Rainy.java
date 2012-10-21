
import resources.PSM004_Schedule_Sunny_RainyHelper;
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
 * @author Chakaitos
 */
public class PSM004_Schedule_Sunny_Rainy extends PSM004_Schedule_Sunny_RainyHelper
{
	/**
	 * Script Name   : <b>PSM0004_Schedule</b>
	 * Generated     : <b>Oct 20, 2012 5:20:57 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/10/20
	 * @author Chakaitos
	 */
	public void testMain(Object[] args) 
	{
		ProcessTestObject psm = startApp("PSM");
		
		// Window: java.exe: PSM Login
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(127,116));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(145,152));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow2().click(atPoint(323,72));
		
		// Window: java.exe: Schedule Setup
		scheduleSetupwindow().click(atPoint(207,88));
		scheduleSetupwindow().click(atPoint(175,126));
		scheduleSetupwindow().click(atPoint(175,126));
		scheduleSetupwindow().inputChars(dpString("StartDate"));
		scheduleSetupwindow().click(atPoint(411,123));
		scheduleSetupwindow().inputChars(dpString("EndDate"));
		scheduleSetupwindow().click(atPoint(105,189));
		scheduleSetupwindow().inputKeys(dpString("Subject"));
		scheduleSetupwindow().click(atPoint(386,194));
		scheduleSetupwindow().inputChars(dpString("ClassNumber"));
		scheduleSetupwindow().click(atPoint(226,216));
		scheduleSetupwindow().inputChars(dpString("CourseName"));
		scheduleSetupwindow().click(atPoint(127,308));
		scheduleSetupwindow().inputKeys(dpString("StartMon"));
		scheduleSetupwindow().click(atPoint(138,353));
		scheduleSetupwindow().inputChars(dpString("EndMon"));
		scheduleSetupwindow().click(atPoint(196,307));
		scheduleSetupwindow().inputChars(dpString("StartTues"));
		scheduleSetupwindow().click(atPoint(234,351));
		scheduleSetupwindow().inputChars(dpString("EndTues"));
		scheduleSetupwindow().click(atPoint(265,303));
		scheduleSetupwindow().inputChars(dpString("StartWed"));
		scheduleSetupwindow().click(atPoint(267,354));
		scheduleSetupwindow().inputKeys(dpString("EndWed"));
		scheduleSetupwindow().click(atPoint(384,304));
		scheduleSetupwindow().inputChars(dpString("StartThur"));
		scheduleSetupwindow().click(atPoint(356,344));
		scheduleSetupwindow().inputChars(dpString("EndThur"));
		scheduleSetupwindow().click(atPoint(439,301));
		scheduleSetupwindow().inputChars(dpString("StartFri"));
		scheduleSetupwindow().click(atPoint(434,350));
		scheduleSetupwindow().inputChars(dpString("EndFri"));
		scheduleSetupwindow().click(atPoint(521,303));
		scheduleSetupwindow().inputChars(dpString("StartSat"));
		scheduleSetupwindow().click(atPoint(523,351));
		scheduleSetupwindow().inputChars(dpString("EndSat"));
		scheduleSetupwindow().click(atPoint(465,405));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow2().click(atPoint(395,279));
		
		psm.kill();
		// Window: java.exe: System Message
		//systemMessagewindow(ANY,MAY_EXIT).click(atPoint(150,161));


	}
}

