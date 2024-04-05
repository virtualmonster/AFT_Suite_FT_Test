/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class Compound_CompoundTest_A1EEF36E016E9300F5A7E56263666438
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public Compound_CompoundTest_A1EEF36E016E9300F5A7E56263666438(IContainer parent, String name) {
		super(parent, "compound", "A1EEF36E016E9300F5A7E56263666438");
	}

	public void execute() {

		this.add(RftTestInvocation_1(this));
		super.execute();
	}

	private com.ibm.rational.test.rtw.rft.codegen.lib.RtwRftScriptExecutor RftTestInvocation_1(IContainer parent) {
		com.ibm.rational.test.rtw.rft.codegen.lib.RtwRftScriptExecutor rtwRftExec = new com.ibm.rational.test.rtw.rft.codegen.lib.RtwRftScriptExecutor(
				this, "Script2");
		rtwRftExec.setProjectPath("JavaApp");
		rtwRftExec.setExecutionArgs("");
		return rtwRftExec;
	}

}