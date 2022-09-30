 package loanapp;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class PersonalLoanAppTests {

	@Parameters({"URL"})
	@Test()
	public void PersonalLoanLoginWeb(String url) {
		System.out.println("Personal loan application - web login test");
		System.out.println("web login url = "+ url);
	}
	
	@Test
	public void PersonalLoanLoginMobile() {
		System.out.println("Personal loan application - mobile login test");
	}
	
	@Test
	public void PersonalLoanLoginApi() {
		System.out.println("Personal loan application - api login test");
	}
}
