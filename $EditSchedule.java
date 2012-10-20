
import resources.$EditScheduleHelper;
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
public class $EditSchedule extends $EditScheduleHelper
{
	/**
	 * Script Name   : <b>EditSchedule</b>
	 * Generated     : <b>Oct 6, 2012 7:09:28 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/10/06
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		startApp("PSM");
		
		// Window: java.exe: PSM Login
		psmLoginwindow().click(atPoint(201,71));
		psmLoginwindow().inputChars("cen507");
		psmLoginwindow().inputChars("6");
		psmLoginwindow().click(atPoint(139,112));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(123,151));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(331,100));
		
		// Window: java.exe: Please Choose
		pleaseChoosewindow().click(atPoint(231,97));
		pleaseChoosewindow().click(atPoint(229,100));
		pleaseChoosewindow().click(atPoint(209,176));
		
		// Window: java.exe: PSM Main Menu
		psmMainMenuwindow().click(atPoint(295,74));
		psmMainMenuwindow().click(atPoint(357,64));
		psmMainMenuwindow().click(atPoint(357,64));
		closebutton().click(atPoint(20,4));
		psmMainMenuwindow().click(atPoint(373,272));
	}
}

