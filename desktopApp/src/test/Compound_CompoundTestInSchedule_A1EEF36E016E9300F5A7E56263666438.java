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
public class Compound_CompoundTestInSchedule_A1EEF36E016E9300F5A7E56263666438
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTestInSchedule {

	public Compound_CompoundTestInSchedule_A1EEF36E016E9300F5A7E56263666438(IContainer parent, String invocationId) {
		super(parent, "compound", invocationId, "A1EEF36E016E9300F5A7E56263666438");
	}

	public void execute() {

		this.add(new test.Webui_Test_A1EEF36EF86D9F70F5A7E56263666438(this, "A1EEF3718D7C1F40F5A7E56263666438") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}