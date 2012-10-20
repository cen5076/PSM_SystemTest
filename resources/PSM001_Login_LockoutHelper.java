// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;

import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>PSM001_Login_Lockout</b><br>
 * Generated     : <b>2012/10/08 7:12:43 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 build 7601 Service Pack 1 <br>
 * 
 * @since  October 08, 2012
 * @author David
 */
public abstract class PSM001_Login_LockoutHelper extends RationalTestScript
{
	/**
	 * PSMLogin: with default state.
	 *		.text : PSM Login
	 * 		.class : SunAwtFrame
	 * 		.processName : java.exe
	 * 		.name : PSM Login
	 */
	protected TopLevelSubitemTestObject psmLoginwindow() 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("psmLoginwindow"));
	}
	/**
	 * PSMLogin: with specific test context and state.
	 *		.text : PSM Login
	 * 		.class : SunAwtFrame
	 * 		.processName : java.exe
	 * 		.name : PSM Login
	 */
	protected TopLevelSubitemTestObject psmLoginwindow(TestObject anchor, long flags) 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("psmLoginwindow"), anchor, flags);
	}
	
	/**
	 * SystemMessage: with default state.
	 *		.text : System Message
	 * 		.class : SunAwtFrame
	 * 		.processName : java.exe
	 * 		.name : System Message
	 */
	protected TopLevelSubitemTestObject systemMessagewindow() 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("systemMessagewindow"));
	}
	/**
	 * SystemMessage: with specific test context and state.
	 *		.text : System Message
	 * 		.class : SunAwtFrame
	 * 		.processName : java.exe
	 * 		.name : System Message
	 */
	protected TopLevelSubitemTestObject systemMessagewindow(TestObject anchor, long flags) 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("systemMessagewindow"), anchor, flags);
	}
	
	

	protected PSM001_Login_LockoutHelper()
	{
		setScriptName("PSM001_Login_Lockout");
	}
	
}

