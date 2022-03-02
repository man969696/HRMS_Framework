package com.hrms.testscript;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003 {
	//public static void main(String[] args) throws Exception {
	@Test
	public void tc003() throws Exception {
	DOMConfigurator.configure("log4j.xml");
    General obj = new General();
		
		obj.OpenApplication();
		obj.login();
		obj.enterFrame();
		obj.newEmpAdd();
		obj.exitFrame();
		obj.logout();
		obj.CloseApplication();
	}
}