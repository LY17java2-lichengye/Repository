package com.lcy.test;

import java.io.IOException;
import java.util.List;

import com.lcy.entity.Admin;
import com.lcy.service.AdminService;
import com.lcy.service.Impl.AdminServiceImpl;

public class AdminTest {
	private AdminService adminService = new AdminServiceImpl();

	public void selectAll() throws IOException {
		List<Admin> list = adminService.selAll();
		for (Admin admin : list) {
			System.out.println(admin.getaLoginName() + admin.getaPassWord());
		}
	}
}
