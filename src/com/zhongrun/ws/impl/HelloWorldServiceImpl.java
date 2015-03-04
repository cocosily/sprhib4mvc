package com.zhongrun.ws.impl;

import javax.jws.WebService;

import com.zhongrun.ws.HelloWorldService;

@WebService(endpointInterface="com.zhongrun.ws.HelloWorldService",serviceName="helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String syaHello(String userName) {
		// TODO Auto-generated method stub
		System.out.println("PPPPPPPPP");
		return null;
	}

}
