
import resources.Script1Helper;
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
 * @author STUART.WALKER
 */
public class Script1 extends Script1Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>5 Apr 2024 17:58:31</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 22631 ()
	 * 
	 * @since  2024/04/05
	 * @author STUART.WALKER
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Window: PickerHost.Exe: 
		shell_SystemDimwindow(ANY,DISABLED).clickDisabled();
		
		// Window: PickerHost.Exe: Windows Security
		desktopWindowXamlSourcewindow(ANY,MAY_EXIT).click(atPoint(101,380));
		
		// Frame: ClassicsCD
		tree2().click(atPath("Composers->Haydn->Symphonies Nos. 94 & 98"));
		classicsCD(ANY,MAY_EXIT).close();
	}
}

