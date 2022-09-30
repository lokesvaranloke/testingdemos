package loanapp;

import org.testng.annotations.Test;

public class CarLoanAppTests {

	@Test(timeOut = 4000)
	public void CarLoanLoginWeb() {
		
		System.out.println("Car loan application - web login test");
	}
	
//	@Test(groups = {"Smoke"})
//	public void CarLoanLoginMobile() {
//		System.out.println("Car loan application - mobile login test");
//	}
	
	@Test(enabled = false)
	public void CarLoanLoginMobile() {
		System.out.println("Car loan application - mobile login test");
	}
	
	@Test(dependsOnMethods = {"CarLoanLoginWeb"})
	public void CarLoanLoginApi() {
		System.out.println("Car loan application - api login test");
	}
}
