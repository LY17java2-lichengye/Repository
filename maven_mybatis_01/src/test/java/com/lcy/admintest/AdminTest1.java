package com.lcy.admintest;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;

import com.lcy.test.AdminTest;

import junit.framework.TestCase;

public class AdminTest1 extends TestCase {
	AdminTest aTest = new AdminTest();

	@Test
	public void testSelectAll() {
		try {
			aTest.selectAll();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
