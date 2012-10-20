
import resources.PSM012_EditSchedule_BlankHelper;
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
public class PSM012_EditSchedule_Blank extends PSM012_EditSchedule_BlankHelper
{
	/**
	 * Script Name   : <b>PSM012_EditSchedule_Blank</b>
	 * Generated     : <b>Oct 1, 2012 2:37:37 PM</b>
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
		psmLoginwindow().click(atPoint(222,118));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(149,158));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(305,104));
		
		
		// Window: java.exe: Please Choose
		pleaseChoosewindow().waitForExistence();
		pleaseChoosewindow().click(atPoint(148,166));
		
		// Window: java.exe: Edit Schedule
		editSchedulewindow().waitForExistence();
		editSchedulewindow().click(atPoint(182,119));
		editSchedulewindow().inputKeys("{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}");
		editSchedulewindow().click(atPoint(466,404));
	}
}

