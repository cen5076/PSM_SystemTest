
import resources.$PSM014_EndSemesterClearHelper;
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
public class $PSM014_EndSemesterClear extends $PSM014_EndSemesterClearHelper
{
	/**
	 * Script Name   : <b>PSM014_EndSemesterClear</b>
	 * Generated     : <b>Oct 1, 2012 3:35:29 PM</b>
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
		psmLoginwindow().click(atPoint(132,122));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(165,162));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(370,79));
		
		// Window: java.exe: Schedule Setup
		scheduleSetupwindow().click(atPoint(205,83));
		scheduleSetupwindow().click(atPoint(174,117));
		scheduleSetupwindow().click(atPoint(167,123));
		scheduleSetupwindow().click(atPoint(108,196));
		scheduleSetupwindow().inputKeys("CE{BKSP}{BKSP}Sub");
		scheduleSetupwindow().click(atPoint(377,194));
		scheduleSetupwindow().inputChars("1234");
		scheduleSetupwindow().click(atPoint(276,218));
		scheduleSetupwindow().inputChars("Name");
		scheduleSetupwindow().click(atPoint(162,117));
		scheduleSetupwindow().inputChars("01/11/13");
		scheduleSetupwindow().click(atPoint(395,118));
		scheduleSetupwindow().inputChars("01/11/13");
		scheduleSetupwindow().click(atPoint(136,111));
		scheduleSetupwindow().click(atPoint(132,123));
		scheduleSetupwindow().inputKeys("{ExtRight}{BKSP}0");
		scheduleSetupwindow().click(atPoint(418,126));
		scheduleSetupwindow().inputKeys("{BKSP}5");
		scheduleSetupwindow().click(atPoint(480,400));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(330,97));
		
		// Window: java.exe: Please Choose
		pleaseChoosewindow().click(atPoint(233,104));
		pleaseChoosewindow().click(atPoint(233,104));
		pleaseChoosewindow().click(atPoint(158,164));
		
		// Window: java.exe: Edit Schedule
		editSchedulewindow().waitForExistence(120.0, 2.0);
		editSchedulewindow().click(atPoint(544,397));
	}
}

