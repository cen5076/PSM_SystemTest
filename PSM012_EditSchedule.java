
import resources.PSM012_EditScheduleHelper;
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
public class PSM012_EditSchedule extends PSM012_EditScheduleHelper
{
	/**
	 * Script Name   : <b>PSM012_EditSchedule</b>
	 * Generated     : <b>Oct 7, 2012 10:42:41 PM</b>
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
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(205,114));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(138,161));

		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(347,94));
		
		// Window: java.exe: Please Choose
		//pleaseChoosewindow().waitForExistence(10.0, 2.0);
		pleaseChoosewindow().click(atPoint(153,164));
		
		// Window: java.exe: Edit Schedule
		editSchedulewindow().click(atPoint(201,78));
		editSchedulewindow().click(atPoint(174,118));
		editSchedulewindow().click(atPoint(250,88));

		editSchedulewindow().click(atPoint(181,121));
		editSchedulewindow().inputKeys("{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}02/01/12");
		editSchedulewindow().click(atPoint(451,118));
		editSchedulewindow().inputKeys("{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}02/02/13");
		editSchedulewindow().click(atPoint(129,195));
		editSchedulewindow().inputKeys("{BKSP}{BKSP}{BKSP}Sub2");
		editSchedulewindow().click(atPoint(403,180));
		editSchedulewindow().click(atPoint(389,191));
		editSchedulewindow().inputKeys("{BKSP}{BKSP}{BKSP}{BKSP}2345");
		editSchedulewindow().click(atPoint(372,215));
		editSchedulewindow().inputKeys("{BKSP}{BKSP}{BKSP}{BKSP}Nam2");
		editSchedulewindow().click(atPoint(465,399));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().waitForExistence(10.0, 2.0);
		
		psm.kill();
	}
}

