package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class TC001 {
	//public static void main(String args[]) {
	@Test
	public void tc001() {
	 //test case step
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.OpenApplication();
		obj.login();
		obj.logout();
		obj.CloseApplication();		
	}
}
