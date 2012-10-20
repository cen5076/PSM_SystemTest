
import resources.$FindPropertyHelper;
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
public class $FindProperty extends $FindPropertyHelper
{
	/**
	 * Script Name   : <b>FindProperty</b>
	 * Generated     : <b>Oct 7, 2012 4:03:29 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/10/07
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		startApp("PSM");
		
		// Window: java.exe: PSM Login
		psmLoginwindow().click(atPoint(154,76));
		psmLoginwindow().inputChars("cen506");
		psmLoginwindow().inputChars("7");
		psmLoginwindow().click(atPoint(226,120));
		psmLoginwindow().inputChars("anything");
		psmLoginwindow().click(atPoint(135,150));
		
		// Window: java.exe: System Message
		systemMessagewindow().click(atPoint(129,158));
		this.getRootTestObject().getProcess().kill();
	}
}

