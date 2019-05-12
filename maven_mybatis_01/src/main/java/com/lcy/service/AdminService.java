package com.lcy.service;

import java.io.IOException;
import java.util.List;

import com.lcy.entity.Admin;

public interface AdminService {
	/**
	 * 查询所有
	 * @return
	 */
	List<Admin> selAll() throws IOException ;
}
