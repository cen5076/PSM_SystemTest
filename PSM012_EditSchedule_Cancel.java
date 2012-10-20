
import resources.PSM012_EditSchedule_CancelHelper;
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
public class PSM012_EditSchedule_Cancel extends PSM012_EditSchedule_CancelHelper
{
	/**
	 * Script Name   : <b>PSM012_EditSchedule_Cancel</b>
	 * Generated     : <b>Oct 1, 2012 2:43:44 PM</b>
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
		psmLoginwindow().click(atPoint(150,114));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(143,153));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(362,99));
		
		// Window: java.exe: Please Choose
		pleaseChoosewindow().waitForExistence(10.0, 2.0);
		pleaseChoosewindow().click(atPoint(147,160));
		
		// Window: java.exe: Edit Schedule
		editSchedulewindow().waitForExistence(10.0, 2.0);
		editSchedulewindow().click(atPoint(555,399));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().waitForExistence(10.0, 2.0);
	}
}

