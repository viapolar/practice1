package com.javalec.ex;

import org.omg.CORBA.Environment;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {
	private Environment env;
	private String adminId;
	private String adminPw;
	

	@Override
	public void setEnvironment(Environment env) {
		// TODO Auto-generated method stub
		System.out.println("setEnvironment()");
		setEnv(env);
	}
	
	public Environment getEnv() {
		return env;
	}
	public void setEnv(Environment env) {
		this.env = env;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet()");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy()");
	}
	
	
}
