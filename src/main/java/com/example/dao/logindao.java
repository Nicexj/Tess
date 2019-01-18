package com.example.dao;

import org.apache.ibatis.annotations.Param;

import com.example.pojo.Yh;

public interface logindao {
	//用户密码账号登陆
	public Yh login(@Param("yhm") String yhm, @Param("mm") String mm);

	
	//用户手机号验证码登陆
	
	
	
	//注册
	public int register(Yh y);
}
