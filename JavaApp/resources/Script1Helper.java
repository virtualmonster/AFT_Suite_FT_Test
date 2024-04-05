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
 * Script Name   : <b>Script1</b><br>
 * Generated     : <b>2024/04/05 17:59:09</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 11 amd64 10.0 <br>
 * 
 * @since  April 05, 2024
 * @author STUART.WALKER
 */
public abstract class Script1Helper extends RationalTestScript
{
	/**
	 * ClassicsCD: with default state.
	 *		.captionText : ClassicsCD
	 * 		.class : ClassicsJava
	 * 		accessibleContext.accessibleName : ClassicsCD
	 * 		.processName : javaw.exe
	 */
	protected TopLevelTestObject classicsCD() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("classicsCD"));
	}
	/**
	 * ClassicsCD: with specific test context and state.
	 *		.captionText : ClassicsCD
	 * 		.class : ClassicsJava
	 * 		accessibleContext.accessibleName : ClassicsCD
	 * 		.processName : javaw.exe
	 */
	protected TopLevelTestObject classicsCD(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("classicsCD"), anchor, flags);
	}
	
	/**
	 * DesktopWindowXamlSource: with default state.
	 *		.text : DesktopWindowXamlSource
	 * 		.class : Windows.UI.Composition.DesktopWindowContentBridge
	 * 		.name : DesktopWindowXamlSource
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject desktopWindowXamlSourcewindow() 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("desktopWindowXamlSourcewindow"));
	}
	/**
	 * DesktopWindowXamlSource: with specific test context and state.
	 *		.text : DesktopWindowXamlSource
	 * 		.class : Windows.UI.Composition.DesktopWindowContentBridge
	 * 		.name : DesktopWindowXamlSource
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject desktopWindowXamlSourcewindow(TestObject anchor, long flags) 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("desktopWindowXamlSourcewindow"), anchor, flags);
	}
	
	/**
	 * Shell_SystemDim: with default state.
	 *		.text : null
	 * 		.class : Shell_SystemDim
	 * 		.processName : PickerHost.Exe
	 * 		.name : null
	 */
	protected TopLevelSubitemTestObject shell_SystemDimwindow() 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("shell_SystemDimwindow"));
	}
	/**
	 * Shell_SystemDim: with specific test context and state.
	 *		.text : null
	 * 		.class : Shell_SystemDim
	 * 		.processName : PickerHost.Exe
	 * 		.name : null
	 */
	protected TopLevelSubitemTestObject shell_SystemDimwindow(TestObject anchor, long flags) 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("shell_SystemDimwindow"), anchor, flags);
	}
	
	/**
	 * tree2: with default state.
	 *		.class : javax.swing.JTree
	 * 		name : tree2
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject tree2() 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("tree2"));
	}
	/**
	 * tree2: with specific test context and state.
	 *		.class : javax.swing.JTree
	 * 		name : tree2
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject tree2(TestObject anchor, long flags) 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("tree2"), anchor, flags);
	}
	
	

	protected Script1Helper()
	{
		setScriptName("Script1");
	}
	
}

