package com.lcy.service.Impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lcy.entity.Admin;
import com.lcy.service.AdminService;

public class AdminServiceImpl implements AdminService {

	@Override
	public List<Admin> selAll() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		List<Admin> list = session.selectList("com.lcy.mapper.AdminMapper.selAll");
		session.close();
		return list;
	}

}
