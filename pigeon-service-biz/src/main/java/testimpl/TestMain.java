package testimpl;

import com.pigeon.module.test.service.TestService;
import com.pigeon.module.test.service.impl.TestServiceImpl;

public class TestMain {

	public static void main(String[] args) {
		TestService tt = new TestServiceImpl();
		System.out.println(tt.selectByPrimaryKey(1).toString());
	}

}
