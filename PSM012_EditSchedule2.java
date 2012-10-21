
import resources.PSM012_EditSchedule2Helper;
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
public class PSM012_EditSchedule2 extends PSM012_EditSchedule2Helper
{
	/**
	 * Script Name   : <b>PSM012_EditSchedule2</b>
	 * Generated     : <b>Oct 20, 2012 10:49:25 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/10/20
	 * @author Chakaitos
	 */
	public void testMain(Object[] args) 
	{
		startApp("PSM");
		
		// Window: java.exe: PSM Login
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(134,112));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(161,157));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(291,103));
		
		// Window: java.exe: Please Choose
		pleaseChoosewindow().click(atPoint(141,170));
		
		// Window: java.exe: Edit Schedule
		editSchedulewindow().click(atPoint(134,192));
		editSchedulewindow().inputKeys("{ExtDelete}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}CEN");
		editSchedulewindow().click(atPoint(368,194));
		editSchedulewindow().inputKeys("{BKSP}{BKSP}{BKSP}{BKSP}5076");
		editSchedulewindow().click(atPoint(179,214));
		editSchedulewindow().inputKeys("{BKSP}{BKSP}{BKSP}{BKSP}Software Testing");
		editSchedulewindow().click(atPoint(460,404));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(367,273));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().waitForExistence(10.0, 2.0);
		
		// Window: java.exe: System Message
		systemMessagewindow(ANY,MAY_EXIT).click(atPoint(126,155));
	}
}

