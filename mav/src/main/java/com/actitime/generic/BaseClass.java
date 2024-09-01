package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeTest
	public void OpenBrowser() {
		Reporter.log("OpenBrowser", true);
	}

}
