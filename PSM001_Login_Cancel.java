
import resources.PSM001_Login_CancelHelper;
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
public class PSM001_Login_Cancel extends PSM001_Login_CancelHelper
{
	/**
	 * Script Name   : <b>PSM001_Login_Alt</b>
	 * Generated     : <b>Sep 26, 2012 8:52:07 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/09/26
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		startApp("PSM");
		
		// Window: java.exe: PSM Login
		psmLoginwindow().click(atPoint(123,71));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow().click(atPoint(122,115));
		psmLoginwindow().inputChars("cen5076");
		psmLoginwindow(ANY,MAY_EXIT).click(atPoint(238,163));
	}
}

