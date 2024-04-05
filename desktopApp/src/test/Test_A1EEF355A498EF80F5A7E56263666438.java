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
public class Test_A1EEF355A498EF80F5A7E56263666438 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	
	
    
    
	
	public Test_A1EEF355A498EF80F5A7E56263666438(IContainer container, String invocationId) {
		super(container, "notepad++", invocationId, "A1EEF355A498EF80F5A7E56263666438", "/desktopApp/notepad++.testsuite", "C:/Users/stuart.walker/HCL/devopstest/workspace/desktopApp/notepad++.testsuite");
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

      this.add(applicationContext_8(this)); /* GENERIC CREATE TEMPLATE */

      this.add(applicationContext_9(this)); /* GENERIC CREATE TEMPLATE */

      this.add(applicationContext_10(this)); /* GENERIC CREATE TEMPLATE */

			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Test_A1EEF355A498EF80F5A7E56263666438 ",e);
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
												  "Start notepad++",
												  "A1EEF355A49DAA71F5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b>notepad++<\\/b>\",\"to_overriden\":false,\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0,\"optionalStep\":false,\"uid\":\"A1EEF355A49DAA71F5A7E56263666438\",\"application_package\":\"webuiApp.wui\",\"application_name\":\"notepad++\",\"application_os\":\"WINDOWS\",\"isWeb\":false,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"isClassID\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"},{\"name\":\"executablePath\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"C:\\\\Program Files\\\\Notepad++\\\\notepad++.exe\"},{\"name\":\"winappArgs\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\"},{\"name\":\"winappWorkingDir\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\"}]},\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/desktopApp/notepad++.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Button whose Name is Maximise - notepad++",
												  "A1EEF355A4A06994F5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Button<\\/b> whose <b>Name<\\/b> is <b>Maximise<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EEF355A4A06994F5A7E56263666438\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"name\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Maximise\"},\"name\":\"name\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:1;left:1966;bottom:31;right:2012\\\", \\\"Geometry\\\": { \\\"height\\\": 30, \\\"width\\\": 46, \\\"x\\\": 1966, \\\"y\\\": 1 }, \\\"bottom\\\": 31, \\\"class\\\": \\\"Button\\\", \\\"clickable\\\": false, \\\"content\\\": \\\"\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"left\\\": 1966, \\\"name\\\": \\\"Maximise\\\", \\\"proxyClass\\\": \\\"\\\", \\\"proxyName\\\": \\\"uibutton\\\", \\\"right\\\": 2012, \\\"top\\\": 1, \\\"visible\\\": true, \\\"xpath\\\": \\\"\\\\\\/Window\\\\\\/TitleBar\\\\\\/Button[2]\\\", \\\"xpathProp\\\": \\\"\\\\\\/Window\\\\\\/TitleBar\\\\\\/Button[2]\\\" }\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.uibutton\"}}],\"timeout\":10}",
												  "/desktopApp/notepad++.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Button whose Name is New - notepad++",
												  "A1EEF355A4C5089BF5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EEF355A4C5089BF5A7E56263666438\",\"preferredThinktime\":0,\"thinktime\":6243,\"isWeb\":false,\"description\":\"Think <i>6,243<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Button<\\/b> whose <b>Name<\\/b> is <b>New<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EEF355A4C5089BF5A7E56263666438\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"name\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"New\"},\"name\":\"name\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:51;left:3;bottom:73;right:26\\\", \\\"Geometry\\\": { \\\"height\\\": 22, \\\"width\\\": 23, \\\"x\\\": 3, \\\"y\\\": 51 }, \\\"bottom\\\": 73, \\\"class\\\": \\\"Button\\\", \\\"clickable\\\": false, \\\"content\\\": \\\"\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"left\\\": 3, \\\"name\\\": \\\"New\\\", \\\"proxyClass\\\": \\\"\\\", \\\"proxyName\\\": \\\"uibutton\\\", \\\"right\\\": 26, \\\"top\\\": 51, \\\"visible\\\": true, \\\"xpath\\\": \\\"\\\\\\/Window\\\\\\/Pane[2]\\\\\\/ToolBar\\\\\\/Button\\\", \\\"xpathProp\\\": \\\"\\\\\\/Window\\\\\\/Pane[2]\\\\\\/ToolBar\\\\\\/Button\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.uibutton\"}}],\"timeout\":10}",
												  "/desktopApp/notepad++.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click at 107,31 in Container whose Xpath is /Window/Pane - notepad++",
												  "A1EEF355A4CC348BF5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EEF355A4CC348BF5A7E56263666438\",\"preferredThinktime\":0,\"thinktime\":3641,\"isWeb\":false,\"description\":\"Think <i>3,641<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click at <b>107<\\/b>,<b>31<\\/b> in <b>Container<\\/b> whose <b>Xpath<\\/b> is <b>\\/Window\\/Pane<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EEF355A4CC348BF5A7E56263666438\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclickAt\",\"parameters\":[{\"name\":\"x\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"107\"},{\"name\":\"y\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"31\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"xpathProp\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\\/Window\\/Pane\"},\"name\":\"xpathProp\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:102;left:3;bottom:1135;right:1919\\\", \\\"Geometry\\\": { \\\"height\\\": 1033, \\\"width\\\": 1916, \\\"x\\\": 3, \\\"y\\\": 102 }, \\\"bottom\\\": 1135, \\\"class\\\": \\\"Pane\\\", \\\"clickable\\\": false, \\\"content\\\": \\\"\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"left\\\": 3, \\\"proxyClass\\\": \\\"\\\", \\\"proxyName\\\": \\\"uicontainer\\\", \\\"right\\\": 1919, \\\"top\\\": 102, \\\"visible\\\": true, \\\"xpath\\\": \\\"\\\\\\/Window\\\\\\/Pane\\\", \\\"xpathProp\\\": \\\"\\\\\\/Window\\\\\\/Pane\\\" }\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.uicontainer\"}}],\"timeout\":10}",
												  "/desktopApp/notepad++.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Input keys 'hello world' - notepad++",
												  "A1EEF355A4D36089F5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EEF355A4D36089F5A7E56263666438\",\"preferredThinktime\":0,\"thinktime\":7713,\"isWeb\":false,\"description\":\"Think <i>7,713<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Input keys <b>'hello world'<\\/b>\",\"to_overriden\":false,\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EEF355A4D36089F5A7E56263666438\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"inputKeys\",\"parameters\":[{\"name\":\"keystoscreenbutton\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"},{\"name\":\"newtext\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"hello world\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/desktopApp/notepad++.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Press key '[ENTER]' - notepad++",
												  "A1EEF355A4D73104F5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EEF355A4D73104F5A7E56263666438\",\"preferredThinktime\":0,\"thinktime\":157,\"isWeb\":false,\"description\":\"Think <i>157<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Press key <b>'[ENTER]'<\\/b>\",\"to_overriden\":false,\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EEF355A4D73104F5A7E56263666438\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"pressKey\",\"parameters\":[{\"name\":\"keystoscreenbutton\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"},{\"name\":\"newtext\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"[ENTER]\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/desktopApp/notepad++.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Input keys 'stuart walker' - notepad++",
												  "A1EEF355A4D890AEF5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EEF355A4D890AEF5A7E56263666438\",\"preferredThinktime\":0,\"thinktime\":13498,\"isWeb\":false,\"description\":\"Think <i>13,498<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Input keys <b>'stuart walker'<\\/b>\",\"to_overriden\":false,\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EEF355A4D890AEF5A7E56263666438\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"inputKeys\",\"parameters\":[{\"name\":\"keystoscreenbutton\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"},{\"name\":\"newtext\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"stuart walker\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/desktopApp/notepad++.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on MenuItem whose Name is \u2715 - notepad++",
												  "A1EEF355A4DB4FCEF5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EEF355A4DB4FCEF5A7E56263666438\",\"preferredThinktime\":0,\"thinktime\":2018,\"isWeb\":false,\"description\":\"Think <i>2,018<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>MenuItem<\\/b> whose <b>Name<\\/b> is <b>\\u2715<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EEF355A4DB4FCEF5A7E56263666438\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"name\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\\u2715\"},\"name\":\"name\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:31;left:1897;bottom:50;right:1921\\\", \\\"Geometry\\\": { \\\"height\\\": 19, \\\"width\\\": 24, \\\"x\\\": 1897, \\\"y\\\": 31 }, \\\"bottom\\\": 50, \\\"class\\\": \\\"MenuItem\\\", \\\"clickable\\\": false, \\\"content\\\": \\\"\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"left\\\": 1897, \\\"name\\\": \\\"\\\\u2715\\\", \\\"proxyClass\\\": \\\"\\\", \\\"proxyName\\\": \\\"uimenuitem\\\", \\\"right\\\": 1921, \\\"top\\\": 31, \\\"visible\\\": true, \\\"xpath\\\": \\\"\\\\\\/Window\\\\\\/MenuBar\\\\\\/MenuItem[16]\\\", \\\"xpathProp\\\": \\\"\\\\\\/Window\\\\\\/MenuBar\\\\\\/MenuItem[16]\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.uimenuitem\"}}],\"timeout\":10}",
												  "/desktopApp/notepad++.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Button whose Name is No - notepad++",
												  "A1EEF355A4E11C14F5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EEF355A4E11C14F5A7E56263666438\",\"preferredThinktime\":0,\"thinktime\":3907,\"isWeb\":false,\"description\":\"Think <i>3,907<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Button<\\/b> whose <b>Name<\\/b> is <b>No<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EEF355A4E11C14F5A7E56263666438\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"name\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"No\"},\"name\":\"name\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:119;left:111;bottom:142;right:186\\\", \\\"Geometry\\\": { \\\"height\\\": 23, \\\"width\\\": 75, \\\"x\\\": 111, \\\"y\\\": 119 }, \\\"bottom\\\": 142, \\\"class\\\": \\\"Button\\\", \\\"clickable\\\": false, \\\"content\\\": \\\"\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"7\\\", \\\"left\\\": 111, \\\"name\\\": \\\"No\\\", \\\"proxyClass\\\": \\\"\\\", \\\"proxyName\\\": \\\"uibutton\\\", \\\"right\\\": 186, \\\"top\\\": 119, \\\"visible\\\": true, \\\"xpath\\\": \\\"\\\\\\/Window\\\\\\/Window\\\\\\/Button[2]\\\", \\\"xpathProp\\\": \\\"\\\\\\/Window\\\\\\/Window\\\\\\/Button[2]\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.uibutton\"}}],\"timeout\":10}",
												  "/desktopApp/notepad++.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_10(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Button whose Name is Close - notepad++",
												  "A1EEF355A4E19144F5A7E56263666438",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EEF355A4E19144F5A7E56263666438\",\"preferredThinktime\":0,\"thinktime\":4533,\"isWeb\":false,\"description\":\"Think <i>4,533<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Button<\\/b> whose <b>Name<\\/b> is <b>Close<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"fd7436f9-0077-4af6-b1c1-6c11331d6847\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EEF355A4E19144F5A7E56263666438\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"name\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Close\"},\"name\":\"name\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:8;left:1873;bottom:30;right:1921\\\", \\\"Geometry\\\": { \\\"height\\\": 22, \\\"width\\\": 48, \\\"x\\\": 1873, \\\"y\\\": 8 }, \\\"bottom\\\": 30, \\\"class\\\": \\\"Button\\\", \\\"clickable\\\": false, \\\"content\\\": \\\"\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"left\\\": 1873, \\\"name\\\": \\\"Close\\\", \\\"proxyClass\\\": \\\"\\\", \\\"proxyName\\\": \\\"uibutton\\\", \\\"right\\\": 1921, \\\"top\\\": 8, \\\"visible\\\": true, \\\"xpath\\\": \\\"\\\\\\/Window\\\\\\/TitleBar\\\\\\/Button[3]\\\", \\\"xpathProp\\\": \\\"\\\\\\/Window\\\\\\/TitleBar\\\\\\/Button[3]\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.uibutton\"}}],\"timeout\":10}",
												  "/desktopApp/notepad++.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

}
