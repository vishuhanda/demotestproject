package demotestproject;



import static org.testng.AssertJUnit.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	
	@Test
	public void doLogin() {
		
		Assert.assertEquals(true, true);
		System.out.println(System.getProperty("hello"));
	}
	
	@Test
	public void doLogout() {
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void doworkout() {
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void doworkoutbad() {
		Assert.assertEquals(true, true);
	}
}
