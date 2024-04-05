/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.execution.moeb.services.MoebActionFailedEvent;
import com.ibm.rational.test.lt.execution.moeb.services.MoebFatalErrorEvent;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Calc_UWP_Test_A1EEF358229EAD00F5A7E56263666438 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	
	
    
    
	
	public Calc_UWP_Test_A1EEF358229EAD00F5A7E56263666438(IContainer container, String invocationId) {
		super(container, "Calc UWP", invocationId, "A1EEF358229EAD00F5A7E56263666438", "/desktopApp/Calc UWP.testsuite", "C:/Users/stuart.walker/HCL/devopstest/workspace/desktopApp/Calc UWP.testsuite");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTTestVerdictFailedEvent(), new RPTContinueEvent("Test verdict was set to fail"), 2, "Test verdict was set to fail"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTDroppedConnectionEvent(), new RPTContinueEvent("Server dropped connection"), 1, "Server dropped connection"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	this.addEventBehavior(new RPTEventStructure(new MoebActionFailedEvent(), new RPTContinueEvent("Playback of UI Action failed"), 0, "Playback of UI Action failed"));
	this.addEventBehavior(new RPTEventStructure(new MoebFatalErrorEvent(), new RPTStopUserEvent("Playback of UI step has a fatal error"), 0, "Playback of UI step has a fatal error"));
	}
	
	
	              this.add(applicationContext_1(this)); /* GENERIC CREATE TEMPLATE */

      this.add(applicationContext_2(this)); /* GENERIC CREATE TEMPLATE */

      this.add(applicationContext_3(this)); /* GENERIC CREATE TEMPLATE */

      this.add(applicationContext_4(this)); /* GENERIC CREATE TEMPLATE */

      this.add(applicationContext_5(this)); /* GENERIC CREATE TEMPLATE */

      this.add(applicationContext_6(this)); /* GENERIC CREATE TEMPLATE */

      this.add(applicationContext_7(this)); /* GENERIC CREATE TEMPLATE */

			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Calc_UWP_Test_A1EEF358229EAD00F5A7E56263666438 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
		// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start Calc (UWP)",
												  "A1EEF35822A0F6F0F5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b>Calc (UWP)<\\/b>\",\"to_overriden\":false,\"application_uid\":\"94d3e120-b184-404d-810d-802aca2e25f4\",\"timeout\":0,\"optionalStep\":false,\"uid\":\"A1EEF35822A0F6F0F5A7E56263666438\",\"application_package\":\"webuiApp.wui\",\"application_name\":\"Calc (UWP)\",\"application_os\":\"WINDOWS\",\"isWeb\":false,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"isClassID\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"true\"},{\"name\":\"executablePath\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Microsoft.WindowsCalculator_8wekyb3d8bbwe!App\"},{\"name\":\"winappArgs\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\"},{\"name\":\"winappWorkingDir\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\"}]},\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/desktopApp/Calc UWP.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Button whose Name is One - Calc (UWP)",
												  "A1EEF35822A0F70CF5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Button<\\/b> whose <b>Name<\\/b> is <b>One<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"94d3e120-b184-404d-810d-802aca2e25f4\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EEF35822A0F70CF5A7E56263666438\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"name\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"One\"},\"name\":\"name\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:425;left:5;bottom:476;right:82\\\", \\\"Geometry\\\": { \\\"height\\\": 51, \\\"width\\\": 77, \\\"x\\\": 5, \\\"y\\\": 425 }, \\\"bottom\\\": 476, \\\"class\\\": \\\"Button\\\", \\\"clickable\\\": false, \\\"content\\\": \\\"\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"num1Button\\\", \\\"left\\\": 5, \\\"name\\\": \\\"One\\\", \\\"proxyClass\\\": \\\"\\\", \\\"proxyName\\\": \\\"uibutton\\\", \\\"right\\\": 82, \\\"top\\\": 425, \\\"visible\\\": true, \\\"xpath\\\": \\\"\\\\\\/Window\\\\\\/Window[2]\\\\\\/Custom\\\\\\/Group\\\\\\/Group[5]\\\\\\/Button[2]\\\", \\\"xpathProp\\\": \\\"\\\\\\/Window\\\\\\/Window[2]\\\\\\/Custom\\\\\\/Group\\\\\\/Group[5]\\\\\\/Button[2]\\\" }\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.uibutton\"}}],\"timeout\":10}",
												  "/desktopApp/Calc UWP.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Button whose Name is Plus - Calc (UWP)",
												  "A1EEF35822A367FFF5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EEF35822A367FFF5A7E56263666438\",\"preferredThinktime\":0,\"thinktime\":3243,\"isWeb\":false,\"description\":\"Think <i>3,243<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"94d3e120-b184-404d-810d-802aca2e25f4\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Button<\\/b> whose <b>Name<\\/b> is <b>Plus<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"94d3e120-b184-404d-810d-802aca2e25f4\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EEF35822A367FFF5A7E56263666438\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"name\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Plus\"},\"name\":\"name\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:425;left:241;bottom:476;right:317\\\", \\\"Geometry\\\": { \\\"height\\\": 51, \\\"width\\\": 76, \\\"x\\\": 241, \\\"y\\\": 425 }, \\\"bottom\\\": 476, \\\"class\\\": \\\"Button\\\", \\\"clickable\\\": false, \\\"content\\\": \\\"\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"plusButton\\\", \\\"left\\\": 241, \\\"name\\\": \\\"Plus\\\", \\\"proxyClass\\\": \\\"\\\", \\\"proxyName\\\": \\\"uibutton\\\", \\\"right\\\": 317, \\\"top\\\": 425, \\\"visible\\\": true, \\\"xpath\\\": \\\"\\\\\\/Window\\\\\\/Window[2]\\\\\\/Custom\\\\\\/Group\\\\\\/Group[4]\\\\\\/Button[4]\\\", \\\"xpathProp\\\": \\\"\\\\\\/Window\\\\\\/Window[2]\\\\\\/Custom\\\\\\/Group\\\\\\/Group[4]\\\\\\/Button[4]\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.uibutton\"}}],\"timeout\":10}",
												  "/desktopApp/Calc UWP.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Button whose Name is One - Calc (UWP)",
												  "A1EEF35822A64E2FF5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EEF35822A64E2FF5A7E56263666438\",\"preferredThinktime\":0,\"thinktime\":3587,\"isWeb\":false,\"description\":\"Think <i>3,587<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"94d3e120-b184-404d-810d-802aca2e25f4\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Button<\\/b> whose <b>Name<\\/b> is <b>One<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"94d3e120-b184-404d-810d-802aca2e25f4\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EEF35822A64E2FF5A7E56263666438\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"name\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"One\"},\"name\":\"name\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:425;left:5;bottom:476;right:82\\\", \\\"Geometry\\\": { \\\"height\\\": 51, \\\"width\\\": 77, \\\"x\\\": 5, \\\"y\\\": 425 }, \\\"bottom\\\": 476, \\\"class\\\": \\\"Button\\\", \\\"clickable\\\": false, \\\"content\\\": \\\"\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"num1Button\\\", \\\"left\\\": 5, \\\"name\\\": \\\"One\\\", \\\"proxyClass\\\": \\\"\\\", \\\"proxyName\\\": \\\"uibutton\\\", \\\"right\\\": 82, \\\"top\\\": 425, \\\"visible\\\": true, \\\"xpath\\\": \\\"\\\\\\/Window\\\\\\/Window[2]\\\\\\/Custom\\\\\\/Group\\\\\\/Group[5]\\\\\\/Button[2]\\\", \\\"xpathProp\\\": \\\"\\\\\\/Window\\\\\\/Window[2]\\\\\\/Custom\\\\\\/Group\\\\\\/Group[5]\\\\\\/Button[2]\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.uibutton\"}}],\"timeout\":10}",
												  "/desktopApp/Calc UWP.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Button whose Name is Equals - Calc (UWP)",
												  "A1EEF35822A822F5F5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EEF35822A822F5F5A7E56263666438\",\"preferredThinktime\":0,\"thinktime\":3356,\"isWeb\":false,\"description\":\"Think <i>3,356<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"94d3e120-b184-404d-810d-802aca2e25f4\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Button<\\/b> whose <b>Name<\\/b> is <b>Equals<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"94d3e120-b184-404d-810d-802aca2e25f4\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EEF35822A822F5F5A7E56263666438\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"name\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Equals\"},\"name\":\"name\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:478;left:241;bottom:529;right:317\\\", \\\"Geometry\\\": { \\\"height\\\": 51, \\\"width\\\": 76, \\\"x\\\": 241, \\\"y\\\": 478 }, \\\"bottom\\\": 529, \\\"class\\\": \\\"Button\\\", \\\"clickable\\\": false, \\\"content\\\": \\\"\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"equalButton\\\", \\\"left\\\": 241, \\\"name\\\": \\\"Equals\\\", \\\"proxyClass\\\": \\\"\\\", \\\"proxyName\\\": \\\"uibutton\\\", \\\"right\\\": 317, \\\"top\\\": 478, \\\"visible\\\": true, \\\"xpath\\\": \\\"\\\\\\/Window\\\\\\/Window[2]\\\\\\/Custom\\\\\\/Group\\\\\\/Group[4]\\\\\\/Button[5]\\\", \\\"xpathProp\\\": \\\"\\\\\\/Window\\\\\\/Window[2]\\\\\\/Custom\\\\\\/Group\\\\\\/Group[4]\\\\\\/Button[5]\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.uibutton\"}}],\"timeout\":10}",
												  "/desktopApp/Calc UWP.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Button whose Name is Clear - Calc (UWP)",
												  "A1EEF35822AF4ED4F5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EEF35822AF4ED4F5A7E56263666438\",\"preferredThinktime\":0,\"thinktime\":3832,\"isWeb\":false,\"description\":\"Think <i>3,832<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"94d3e120-b184-404d-810d-802aca2e25f4\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Verify that <b>Content<\\/b> equals <b><\\/b> on <b>Label<\\/b> whose <b>Name<\\/b> is <b>Display is 2<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"94d3e120-b184-404d-810d-802aca2e25f4\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"vpExpression\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Content\",\"operator\":\"TEquals\"},\"optionalStep\":false,\"uid\":\"A1EEF3582C3BC417F5A7E56263666438\",\"isWeb\":true,\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"parameter\":{\"name\":\"name\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Display is 2\"},\"name\":\"name\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:104;left:1;bottom:179;right:321\\\", \\\"Geometry\\\": { \\\"height\\\": 75, \\\"width\\\": 320, \\\"x\\\": 1, \\\"y\\\": 104 }, \\\"bottom\\\": 179, \\\"class\\\": \\\"Text\\\", \\\"clickable\\\": false, \\\"content\\\": \\\"\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"CalculatorResults\\\", \\\"left\\\": 1, \\\"name\\\": \\\"Display is 2\\\", \\\"proxyClass\\\": \\\"\\\", \\\"proxyName\\\": \\\"uilabel\\\", \\\"right\\\": 321, \\\"top\\\": 104, \\\"visible\\\": true, \\\"xpath\\\": \\\"\\\\\\/Window\\\\\\/Window[2]\\\\\\/Custom\\\\\\/Group\\\\\\/Text[2]\\\", \\\"xpathProp\\\": \\\"\\\\\\/Window\\\\\\/Window[2]\\\\\\/Custom\\\\\\/Group\\\\\\/Text[2]\\\" }\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.uilabel\"}},{\"revealPref\":\"true\",\"description\":\"Click on <b>Button<\\/b> whose <b>Name<\\/b> is <b>Clear<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"94d3e120-b184-404d-810d-802aca2e25f4\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EEF35822AF4ED4F5A7E56263666438\",\"isWeb\":true,\"action\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"name\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Clear\"},\"name\":\"name\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:213;left:162;bottom:264;right:239\\\", \\\"Geometry\\\": { \\\"height\\\": 51, \\\"width\\\": 77, \\\"x\\\": 162, \\\"y\\\": 213 }, \\\"bottom\\\": 264, \\\"class\\\": \\\"Button\\\", \\\"clickable\\\": false, \\\"content\\\": \\\"\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"clearButton\\\", \\\"left\\\": 162, \\\"name\\\": \\\"Clear\\\", \\\"proxyClass\\\": \\\"\\\", \\\"proxyName\\\": \\\"uibutton\\\", \\\"right\\\": 239, \\\"top\\\": 213, \\\"visible\\\": true, \\\"xpath\\\": \\\"\\\\\\/Window\\\\\\/Window[2]\\\\\\/Custom\\\\\\/Group\\\\\\/Group[2]\\\\\\/Button[3]\\\", \\\"xpathProp\\\": \\\"\\\\\\/Window\\\\\\/Window[2]\\\\\\/Custom\\\\\\/Group\\\\\\/Group[2]\\\\\\/Button[3]\\\" }\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.uibutton\"}}],\"timeout\":10}",
												  "/desktopApp/Calc UWP.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Button whose Name is Close Calculator - Calc (UWP)",
												  "A1EEF35822AF4EEEF5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EEF35822AF4EEEF5A7E56263666438\",\"preferredThinktime\":0,\"thinktime\":3156,\"isWeb\":false,\"description\":\"Think <i>3,156<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"94d3e120-b184-404d-810d-802aca2e25f4\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Button<\\/b> whose <b>Name<\\/b> is <b>Close Calculator<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"94d3e120-b184-404d-810d-802aca2e25f4\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EEF35822AF4EEEF5A7E56263666438\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"name\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Close Calculator\"},\"name\":\"name\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:1;left:275;bottom:33;right:321\\\", \\\"Geometry\\\": { \\\"height\\\": 32, \\\"width\\\": 46, \\\"x\\\": 275, \\\"y\\\": 1 }, \\\"bottom\\\": 33, \\\"class\\\": \\\"Button\\\", \\\"clickable\\\": false, \\\"content\\\": \\\"\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"Close\\\", \\\"left\\\": 275, \\\"name\\\": \\\"Close Calculator\\\", \\\"proxyClass\\\": \\\"\\\", \\\"proxyName\\\": \\\"uibutton\\\", \\\"right\\\": 321, \\\"top\\\": 1, \\\"visible\\\": true, \\\"xpath\\\": \\\"\\\\\\/Window\\\\\\/Window\\\\\\/Button[3]\\\", \\\"xpathProp\\\": \\\"\\\\\\/Window\\\\\\/Window\\\\\\/Button[3]\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.uibutton\"}}],\"timeout\":10}",
												  "/desktopApp/Calc UWP.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

}
