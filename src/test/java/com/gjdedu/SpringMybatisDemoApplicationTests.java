package com.gjdedu;

import com.gjdedu.service.UserMapper;
import com.gjdedu.pojo.User_Mybatis;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringMybatisDemoApplicationTests {
	@Autowired()
	private UserMapper userMapper;
	// 查询所有用户信息
	@Test
	public void testList() {
		List<User_Mybatis> list = userMapper.list();
		list.stream().forEach(user ->{
			System.out.println(user);
		});

	}
}
